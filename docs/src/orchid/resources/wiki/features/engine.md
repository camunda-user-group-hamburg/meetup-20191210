# Engine Features

## Context Logging

* `context:[activityId=task_talk2me, processDefinitionId=process_meetup_20191210:1:bc973df3-1b60-11ea-8b4c-acde48001122, processInstanceId=cd9ba055-1b60-11ea-8b4c-acde48001122]`

## Or Queries

<https://jira.camunda.com/plugins/servlet/mobile#issue/CAM-9676>

```
runtimeService.createProcessInstanceQuery()
      .processInstanceBusinessKey(bk1)
      .or()
      .processInstanceBusinessKey(bk2)
      .endOr()
      .list()
```

## Spin Configuration

<https://jira.camunda.com/plugins/servlet/mobile#issue/CAM-9972>

```
@Component
public class CamundaJacksonFormatConfigurator implements DataFormatConfigurator<JacksonJsonDataFormat> {
  @Override
  public Class<JacksonJsonDataFormat> getDataFormatClass() {
    return JacksonJsonDataFormat.class;
  }

  @Override
  public void configure(JacksonJsonDataFormat dataFormat) {

    final ObjectMapper mapper = dataFormat.getObjectMapper();
    final JavaTimeModule javaTimeModule = new JavaTimeModule();
    mapper.registerModule(javaTimeModule);
  }
}
```

## Error Eventing

<https://jira.camunda.com/plugins/servlet/mobile#issue/CAM-9994>

## External Task

I can use version tag when fetching and locking external tasks

<https://jira.camunda.com/plugins/servlet/mobile#issue/CAM-10393>