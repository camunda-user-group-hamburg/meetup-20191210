package de.cughh.meetup._20191210.application

import mu.KLogging
import org.camunda.bpm.engine.delegate.DelegateTask
import org.camunda.bpm.engine.delegate.TaskListener
import org.camunda.bpm.engine.spring.SpringProcessEngineConfiguration
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.camunda.bpm.spring.boot.starter.util.SpringBootProcessEnginePlugin
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

fun main(args:Array<String>) = runApplication<MeetupApplication>(*args).let { Unit }

@SpringBootApplication
@EnableProcessApplication
class MeetupApplication {

  companion object : KLogging()

  @Bean
  fun after10Seconds() = TaskListener {
    logger.info { """
      
      
      
      10 seconds passed!
      
      
      
    """.trimIndent() }
    it.assignee = null
  }


  @Component
  class TaskUpdate : TaskListener {

    @EventListener(condition = """#task.getEventName().equals("update")""")
    override fun notify(task: DelegateTask) {
      logger.info { "a task has been updated: ${task.id} - ${task.eventName}" }
    }

  }
}




object MeetupProcess {

  const val KEY = "process_meetup_20191210"
}
