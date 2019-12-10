package de.cughh.meetup._20191210.application

import mu.KLogging
import org.camunda.bpm.engine.RuntimeService
import org.camunda.bpm.engine.TaskService
import org.camunda.bpm.engine.delegate.DelegateTask
import org.camunda.bpm.engine.delegate.ExecutionListener
import org.camunda.bpm.engine.delegate.TaskListener
import org.camunda.bpm.engine.runtime.ProcessInstance
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.event.EventListener
import org.springframework.web.bind.annotation.*

fun main(args: Array<String>) = runApplication<MeetupApplication>(*args).let { Unit }

@SpringBootApplication
@EnableProcessApplication
class MeetupApplication {

  companion object : KLogging()


  @Bean
  fun after10Seconds() = TaskListener {
    logger.info {
      """
      
      
      
      10 seconds passed!
      
      
      
    """.trimIndent()
    }
    it.assignee = null
  }


  @EventListener(condition = "#task.getEventName().equals(\"update\")")
  fun onUpdate(task: DelegateTask) {
    logger.info { "a task has been updated: ${task.id} - ${task.eventName} - foo=${task.getVariableLocal("foo")}" }

  }

  @Bean
  fun logFailure() = ExecutionListener { logger.error { "process failed" } }


}

@RestController
@RequestMapping("/custom")
class InstanceSearch(
    private val runtimeService: RuntimeService,
    private val taskService: TaskService
) {

  @GetMapping("/processinstance")
  fun findByBusinessKey(
      @RequestParam("businessKey") businessKey:String,
      @RequestParam("instanceId") instanceId:String
  ) : List<String> = runtimeService.createProcessInstanceQuery()
      .or()
      .processInstanceBusinessKey(businessKey)
      .processInstanceId(instanceId)
      .endOr()
      .list().map{ it.processInstanceId}

  @PutMapping("/task/{businessKey}")
  fun updateLocalVariable(
      @PathVariable("businessKey") businessKey: String,
      @RequestParam("value") value:String
  ) {
    val task = taskService.createTaskQuery().processInstanceBusinessKey(businessKey).singleResult()!!

    taskService.setVariableLocal(task.id, MeetupProcess.VARIABLES.FOO, value)
  }

  @PutMapping("/task/fail/{businessKey}")
  fun failTask(
      @PathVariable("businessKey") businessKey: String
  ) {
    val task = taskService.createTaskQuery().processInstanceBusinessKey(businessKey).singleResult()!!

    taskService.handleBpmnError(task.id, "FAIL")
  }
}

object MeetupProcess {

  const val KEY = "process_meetup_20191210"

  object VARIABLES {
    const val FOO = "foo"
  }
}
