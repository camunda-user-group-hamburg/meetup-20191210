# Links

* [Slides des Camunda Webinars](https://www.slideshare.net/camunda/camunda-bpm-712-release-webinar)

* [Release Blog](https://blog.camunda.com/post/2019/11/camunda-bpm-7120-released/)


# Release Notes Version 7.12.0

siehe [camunda jira](https://jira.camunda.com/secure/ReleaseNote.jspa?projectId=10230&version=15387)

                                                        
<h2>        Bug Report
</h2>
<ul>
<li>[<a href='https://jira.camunda.com/browse/CAM-4866'>CAM-4866</a>] -         Failing Job Lock Time is not save correctly during Daylight Saving Hour
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-5164'>CAM-5164</a>] -         NPE while deploy a process when history level is AUTO
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-7775'>CAM-7775</a>] -         I can see incident stacktrace after the process instance is completed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-8802'>CAM-8802</a>] -         Batch operation forgets filter criteria by jumping back to confirmation screen
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9114'>CAM-9114</a>] -         Or query doen&#39;t work correctly when another table needs to be joined
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9210'>CAM-9210</a>] -         Stuck in modal after editing DMN file
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9811'>CAM-9811</a>] -         Engine fails on WebSphere 8.5/9 with certain log levels
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9856'>CAM-9856</a>] -         Form field looses data after adding task meta data (due date, group, etc.)
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9934'>CAM-9934</a>] -         Process status after interruptive event subprocess
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9980'>CAM-9980</a>] -         In Cockpit, error message not meaningful on redeploying a just edited DMN table
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10002'>CAM-10002</a>] -         Using the Spring integration, the data of a nested transaction is flushed even if the transaction is rolled back
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10035'>CAM-10035</a>] -         In Cockpit, on deployment page sort dropdown does not show on first click
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10080'>CAM-10080</a>] -         2nd retry stacktrace link points to the 1st retry one
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10122'>CAM-10122</a>] -         Error when deleting deployment with running instances and history disabled
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10126'>CAM-10126</a>] -         Database batch processing swallows Optimistic Locking Exception
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10212'>CAM-10212</a>] -         Can&#39;t remove long saved filter queries
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10259'>CAM-10259</a>] -         Engine resolves nested JUEL properties from variable context
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10274'>CAM-10274</a>] -         Embedded Subprocess without start event can be deployed but not executed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10282'>CAM-10282</a>] -         Weak performance of count queries on PostgreSQL
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10321'>CAM-10321</a>] -         &quot;PnW&quot; is not supported as duration
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10340'>CAM-10340</a>] -         In Cockpit, on the deployment page, dmn loading spinner never ends
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10342'>CAM-10342</a>] -         SDK-JS can&#39;t be used as a node dependency
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10343'>CAM-10343</a>] -         Process engine exception when querying historic details with processInstanceId and executionId
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10352'>CAM-10352</a>] -         In cockpit, recalculate user operation log is not displayed correctly
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10367'>CAM-10367</a>] -         Save Filter button not disabled in Cockpits process instance search
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10374'>CAM-10374</a>] -         standalone webapps do not run on tomcat and java version &gt; 8
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10379'>CAM-10379</a>] -         Classloading issue in Wildfly 12+
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10409'>CAM-10409</a>] -         Failing dabase batch operation can lead to inconsistent database state
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10422'>CAM-10422</a>] -         Variable in inspect dialog is not updated after edit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10423'>CAM-10423</a>] -         Datepicker stays on screen when I scroll
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10428'>CAM-10428</a>] -         SchemaLogQueryTest fail due to minor version update
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10429'>CAM-10429</a>] -         Moment does not use correct locale
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10435'>CAM-10435</a>] -         Correct the documentation on date inputs in embedded forms
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10440'>CAM-10440</a>] -         TaskServiceTest fails due to missing HistoryLevel check
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10441'>CAM-10441</a>] -         Jenkins Job Engine-api-compatibility is failing
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10456'>CAM-10456</a>] -         Fix Docs Smoke Tests for latest 7.11 version
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10488'>CAM-10488</a>] -         BPM Assert docs lead to a 404
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10495'>CAM-10495</a>] -         Task Fetching Backoff in Tasklist leads to unexpeced behaviour
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10512'>CAM-10512</a>] -         [Firefox] DMN file fails while uploading during edit view of DMN file in deployments page
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10513'>CAM-10513</a>] -         Importing variables from Optimize endpoint causes error for MSSQL
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10522'>CAM-10522</a>] -         Tasklist result shows an unclear error on selection &quot;Candidate User Filter&quot;
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10524'>CAM-10524</a>] -         SameSite property is not disabled by default for WAS 9
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10533'>CAM-10533</a>] -         In Cockpit: DMN icon is broken
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10538'>CAM-10538</a>] -         Document strategy for duplicate fixes in patch scripts
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10554'>CAM-10554</a>] -         Http header security filter not present in community distros
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10564'>CAM-10564</a>] -         Heatmap feature is not working
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10567'>CAM-10567</a>] -         In Tasklist, search pills are reset when selecting a task
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10581'>CAM-10581</a>] -         Incidents don&#39;t open modal if rootCauseIncidentMessage is null
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10590'>CAM-10590</a>] -         User stuck after deploying undefined dmn diagram on deployment page
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10592'>CAM-10592</a>] -         Rest API: Exceptions are sent as HTML instead of JSON
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10595'>CAM-10595</a>] -         [Internet Explorer] Instance statistics toggle button doesn&#39;t work
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10601'>CAM-10601</a>] -         Job executor on WAS/WLS does not take logging configuration into account
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10620'>CAM-10620</a>] -         Support overriding of logging behavior again
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10640'>CAM-10640</a>] -         Standalone Webapps fail on JBoss EAP 6.x because vfs access is not allowed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10672'>CAM-10672</a>] -         Link historic incidents to the specific stacktrace source
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10676'>CAM-10676</a>] -         WelcomePluginsRootResource doesn&#39;t contain any JAX-RS annotated methods
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10678'>CAM-10678</a>] -         Camunda docs v7.11 /process-instance/delete api is not updated
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10679'>CAM-10679</a>] -         Tasklist does not submit form field with default value if variable has already that value
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10686'>CAM-10686</a>] -         Task card flickers at expand
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10692'>CAM-10692</a>] -         Missing translation string for small window warning
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10693'>CAM-10693</a>] -         In REST API, version tag is not exposed for locked external tasks
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10706'>CAM-10706</a>] -         In Cockpit, on Migration, filter is reset when operation changes
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10707'>CAM-10707</a>] -         In Java External Task Client, version tag is not exposed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10708'>CAM-10708</a>] -         In JavaScript External Task client, I cannot fetch and lock by version tag
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10728'>CAM-10728</a>] -         Webapp displays administrative options by hard-checking against camunda-admin group
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10730'>CAM-10730</a>] -         TaskQuery assigneeIn filter can not be extended
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10735'>CAM-10735</a>] -         In Tasklist, filter tasks case-insensitively does not work
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10740'>CAM-10740</a>] -         Admin webapp - List of users disappear in Users page once /user api returns an error
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10751'>CAM-10751</a>] -         Inaccurate description of the default number of job executions
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10753'>CAM-10753</a>] -         Correct typos in patch level update guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10791'>CAM-10791</a>] -         Firefox does not send CSRF cookie if initial request comes from a cross-origin
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10801'>CAM-10801</a>] -         Filtering by candidateUser in an OR query does not resolve candidate groups
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10802'>CAM-10802</a>] -         Changing user profile via webapp fails when enablePasswordPolicy set to true
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10819'>CAM-10819</a>] -         Message Correlation throws an exception &quot;Cannot add TRANSIENT&quot; with localVariables
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10829'>CAM-10829</a>] -         Date picker of the generated task forms doesn&#39;t work as expected on version 7.11 and above
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10837'>CAM-10837</a>] -         Invalid listener definition in .bpmn not catched in the deployment time
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10840'>CAM-10840</a>] -         Add property to disable CamundaBpmWebappAutoConfiguration
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10844'>CAM-10844</a>] -         Process Instance History/runtime view - User Task pop up window has truncated data
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10864'>CAM-10864</a>] -         Variable instance query fails when matching a variable value
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10871'>CAM-10871</a>] -         Mark expression as resolved in VariableScopeElResolver if sucessfully resolved
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10879'>CAM-10879</a>] -         Module net.minidev.json-smart needs dependency to module net.minidev.accessors-smart
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10893'>CAM-10893</a>] -         In Process Instance Search, I can&#39;t filter by ActivityId
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10903'>CAM-10903</a>] -         Query involvedUser is not working
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10907'>CAM-10907</a>] -         Wildfly 18 build is not working
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10943'>CAM-10943</a>] -         I cannot login to welcome app
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10955'>CAM-10955</a>] -         I cannot see all variables in task list
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10962'>CAM-10962</a>] -         A user operation log for task deletion is written during process modification/deletion
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10991'>CAM-10991</a>] -         Closed incidents are missing in the Rest API response for historic activity statistics
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11003'>CAM-11003</a>] -         Correct the names of the logging context configuration properties
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11056'>CAM-11056</a>] -         Failed relogin due to cached CSRF Token
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11065'>CAM-11065</a>] -         In Admin, I cannot add a user to a group
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11069'>CAM-11069</a>] -         In Cockpit, on Deployments, Process Definitions disappear on second visit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11071'>CAM-11071</a>] -         In Cockpit, failing historic task requests when audit page is visited
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11084'>CAM-11084</a>] -         Unable to start process instance from Tasklist with recommende HTTP Header Security settings in Firefox
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11090'>CAM-11090</a>] -         Cannot resolve S function with enabled Javascript compilation
</li>
</ul>
    
<h2>        Feature Request
</h2>
<ul>
<li>[<a href='https://jira.camunda.com/browse/CAM-3862'>CAM-3862</a>] -         Expose followupdate setter in DelegateTask
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-4670'>CAM-4670</a>] -         I can use .assigneeIn(...) in task Query
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-6554'>CAM-6554</a>] -         I can query for historic entities without tenant id
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9556'>CAM-9556</a>] -         Add Annotation to Operator Log
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9676'>CAM-9676</a>] -         Support OR condition in all queries
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9855'>CAM-9855</a>] -         Recurring Timer Job DueDates do not depend on first job start date
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9972'>CAM-9972</a>] -         Auto Configuration for Java8/JSR-310 Date-Time types in Spring Boot
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9992'>CAM-9992</a>] -         In DMN model, add DMN 1.2 namespace
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9994'>CAM-9994</a>] -         I can define a BPMN Error Throw Event with an error message
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10229'>CAM-10229</a>] -         Introduce backoff to task fetching if task execution is slow
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10254'>CAM-10254</a>] -         Task listener for UPDATE Events
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10258'>CAM-10258</a>] -         I can programmatically customize resource deployment 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10278'>CAM-10278</a>] -         In BPM-examples, add rest controller for starting process
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10309'>CAM-10309</a>] -         I can use  processDefinitionKeyIn() and processDefinitionKeyNotIn() in process instance query (history / runtime)
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10324'>CAM-10324</a>] -         Add Pagination to the User Operations Tab
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10385'>CAM-10385</a>] -         make exception include the name of the variable if FormFieldHandler.createFormField fails
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10393'>CAM-10393</a>] -         I can use version tag when fetching and locking external tasks
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10395'>CAM-10395</a>] -         Case Insensitive Variable Search support in Java &amp;  REST API for ProcessInstanceQuery
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10396'>CAM-10396</a>] -         Ability to inspect Bpmn Element Documentation in Cockpit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10397'>CAM-10397</a>] -         Ability to use BPMN Escalation Events on User Tasks
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10398'>CAM-10398</a>] -         Ability to use BPMN Error Events on User Tasks
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10399'>CAM-10399</a>] -         Time triggered task listeners
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10400'>CAM-10400</a>] -         View Failed Job Stacktrace embedded in Cockpit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10416'>CAM-10416</a>] -         In Cockpit, I can use a datepicker on the set removal time batch operation view
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10436'>CAM-10436</a>] -         [UX Improvement] I can scroll through the list of saved filters in search widget
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10535'>CAM-10535</a>] -         Support Wildfly 17
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10573'>CAM-10573</a>] -         I can use an expression for the errorMessage of a BPMN error
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10587'>CAM-10587</a>] -         I can deploy and run DMN 1.2 models in the engine, limited to the DMN 1.1 feature set
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10600'>CAM-10600</a>] -         Add an index for all historic details of a variable instance
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10607'>CAM-10607</a>] -         I can configure the name of the CSRF token cookie
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10622'>CAM-10622</a>] -         Custom form handling
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10626'>CAM-10626</a>] -         I can filter tasks by assignees in tasklist 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10630'>CAM-10630</a>] -         I can configure the java ExternalTaskClient to fetchAndLock by priority
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10647'>CAM-10647</a>] -         Case Insensitive Variable Search support in more queries
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10669'>CAM-10669</a>] -         Case Insensitive Variable Search support for Historic Task Instance and Historic Variable Instance
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10701'>CAM-10701</a>] -         Javascript client: I can fetch and lock tasks by version tag
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10717'>CAM-10717</a>] -         Show timestamps for external task log in Cockpit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10721'>CAM-10721</a>] -         Update invalid license key from file
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10724'>CAM-10724</a>] -         Lifecycle for task listener events
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10767'>CAM-10767</a>] -         Users are unaware of the credentials to log into the camunda distro
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10771'>CAM-10771</a>] -         Improve BPMN Parser Exceptions
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10793'>CAM-10793</a>] -         Support Java 13
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10795'>CAM-10795</a>] -         In the form SDK, I can create BPMN Error &amp; Escalation Events
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10798'>CAM-10798</a>] -         Provide contextual process data in logging context
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10808'>CAM-10808</a>] -         Support Wildfly 18
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10809'>CAM-10809</a>] -         As Operator, I can submit a comment when performing process instance modification in Cockpit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10811'>CAM-10811</a>] -         I can configure the Javascript ExternalTaskClient to fetchAndLock by priority
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10834'>CAM-10834</a>] -         In Cockpit, I can configure updateEventTriggers for user tasks with timeout listeners
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10852'>CAM-10852</a>] -         Allow search for process definitions without versionTag
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10853'>CAM-10853</a>] -         Allow Spring Bean methods to be called from Script Tasks
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10865'>CAM-10865</a>] -         As Operator, I can submit a comment when performing process instance modification
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10866'>CAM-10866</a>] -         In cockpit, I can submit a comment when performing process instance modification
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10889'>CAM-10889</a>] -         UPDATE Task Event is fired on task-associated entity operations
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10908'>CAM-10908</a>] -         Display group names in Cockpit Human Tasks report
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10910'>CAM-10910</a>] -         Expose idIn parameter in group query REST API
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10913'>CAM-10913</a>] -         On the process instance search page, I can filter by tenant id
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10927'>CAM-10927</a>] -         I can directly link to the modal in tasklist to start a process
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10939'>CAM-10939</a>] -         I can filter incidents by process definition key
</li>
</ul>
    
<h2>        Aufgabe
</h2>
<ul>
<li>[<a href='https://jira.camunda.com/browse/CAM-9653'>CAM-9653</a>] -         Engine&#39;s context access synchronizes unnecessarily
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9750'>CAM-9750</a>] -         Update license terms in all OS repos
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9751'>CAM-9751</a>] -         Update license terms in all EE repos
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9752'>CAM-9752</a>] -         Update license terms in all OS distros
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9753'>CAM-9753</a>] -         Update license terms in all EE distros
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9784'>CAM-9784</a>] -         In Webapps, proms are not handled for sdk-js requests
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9812'>CAM-9812</a>] -         List all available archetype in docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9837'>CAM-9837</a>] -         Remove inner * selection from job acquisition query
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9838'>CAM-9838</a>] -         Job acquisition should only select columns that are required by the command
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9923'>CAM-9923</a>] -         Spike: E2E testing frameworks
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9938'>CAM-9938</a>] -         Log stacktrace of Optimistic Locking Exception during job execution only on level DEBUG
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-9997'>CAM-9997</a>] -         Document the changes for camunda-spin-dataformat-all in upgrade guide 7.9 to 7.10
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10067'>CAM-10067</a>] -         Ability to configure command exception logging
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10068'>CAM-10068</a>] -         Make unstable managed wls test job reliable
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10167'>CAM-10167</a>] -         Spike: Try out webpack as build tool for frontend
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10192'>CAM-10192</a>] -         Document limitations of joining inclusive gateway
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10201'>CAM-10201</a>] -         Spike: Step-wise migration from angular.js to react.js
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10223'>CAM-10223</a>] -         For Webapps, add automated Code Styling
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10310'>CAM-10310</a>] -         Update Platform versions after 7.11 release
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10322'>CAM-10322</a>] -         PR: redirect develop live to 7.11 instead of SNAPSHOT
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10330'>CAM-10330</a>] -         DMN Model API: Namespace compatibility test is not executed by surefire
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10368'>CAM-10368</a>] -         CMMN/DMN enabled status is checked on count enpoint calls
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10383'>CAM-10383</a>] -         SQL Upgrade scripts insert for schema version is documented
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10390'>CAM-10390</a>] -         Create a Testcafe test and integrate it into the testing process
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10401'>CAM-10401</a>] -         Prototype for Rest Service Distribution
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10402'>CAM-10402</a>] -         Spike on official Support of Camunda Scala DMN and FEEL engines
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10403'>CAM-10403</a>] -         Spike prototypical solution for MI with arbitrary cardinality
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10407'>CAM-10407</a>] -         Add OpenJDK builds to supported environments
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10410'>CAM-10410</a>] -         Move typed values into the platform
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10412'>CAM-10412</a>] -         Optimize Authorization Resource Type
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10413'>CAM-10413</a>] -         I can use Optimize permissions in Admin
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10414'>CAM-10414</a>] -         Remove transpilation Tasks for BPMN-js dependency
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10444'>CAM-10444</a>] -         Documentation - Example of using serialized variables of type Object in POST request
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10450'>CAM-10450</a>] -         Clarify relocated Gson classes with respect to public API definition
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10451'>CAM-10451</a>] -         Configure and test session cookie security config for enterprise containers
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10452'>CAM-10452</a>] -         Remove Cycle from docs pages
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10454'>CAM-10454</a>] -         I can generate a license book for Webapp repos
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10459'>CAM-10459</a>] -         Our distros and repos contain a full license book of dependencies
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10464'>CAM-10464</a>] -         In Cockpit, relative dates are not present in translation file
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10467'>CAM-10467</a>] -         Add integration test for CSRF Prevention
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10468'>CAM-10468</a>] -         Test release job on master broken in webapp build step
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10471'>CAM-10471</a>] -         Fix typo in BPMN Parser warning
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10473'>CAM-10473</a>] -         Adjust license header of external code in platform
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10476'>CAM-10476</a>] -         Use bpmn-js, cmmn-js and dmn-js from deps.js
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10480'>CAM-10480</a>] -         Platform ee node_modules folder should be excluded in license check
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10487'>CAM-10487</a>] -         Release camunda-bpm-custom-batch 1.4.0
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10489'>CAM-10489</a>] -         In Webapps, refactor places where XMLHttpRequest calls are used
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10491'>CAM-10491</a>] -         Discrepancy in the https://docs.camunda.org/manual/7.11/user-guide/testing/#debug-unit-tests page 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10492'>CAM-10492</a>] -         Discrepancy in the https://docs.camunda.org/manual/7.11/reference/bpmn20/subprocesses/embedded-subprocess/
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10493'>CAM-10493</a>] -         Add Security menu link to older versions of Optimize docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10498'>CAM-10498</a>] -         CSRF cookie security flags have aligned naming semantics
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10500'>CAM-10500</a>] -         In the migration guide I can read documentation about the promoted deployment descriptor version
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10501'>CAM-10501</a>] -         Improve CSRF cookie security unit tests
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10505'>CAM-10505</a>] -         Add missing restriction for event based gateway
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10511'>CAM-10511</a>] -         In Spring Boot, correct documentation about CSRF configuration
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10521'>CAM-10521</a>] -         Release xslt ee containing the updated license terms
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10528'>CAM-10528</a>] -         Create camunda-bpm release parent
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10534'>CAM-10534</a>] -         Remove 7.3 and 7.2 from enterprise download page
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10540'>CAM-10540</a>] -         PR: Add example for date URL encoding
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10541'>CAM-10541</a>] -         PR: Fix variable value description in result tables 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10543'>CAM-10543</a>] -         Move DMN Engine repo to platform
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10546'>CAM-10546</a>] -         Test Multi-Browser support in Testcafe
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10547'>CAM-10547</a>] -         Create Bootstrap Config for Testcafe Tests
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10562'>CAM-10562</a>] -         I can read the restriction introduced on the Starter by CSRF prevention
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10563'>CAM-10563</a>] -         Bundle camunda-bpm-sdk-js into deps.js
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10568'>CAM-10568</a>] -         Make h2 test fork count configurable
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10572'>CAM-10572</a>] -         Test release job is broken because of merged DMN Engine
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10574'>CAM-10574</a>] -         I can read on the DMN Engine and Typed Values migration in the upgrade guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10575'>CAM-10575</a>] -         Integrate ProcessEngineLoggingRule into codebase
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10576'>CAM-10576</a>] -         DatabaseFlushTest is not stable on MariaDB Galera
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10582'>CAM-10582</a>] -         I can declare multiple alternative namespaces
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10584'>CAM-10584</a>] -         Improve documentation regarding POM content of SPIN libraries
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10589'>CAM-10589</a>] -         Instance migration test suite uses wrong dependencies due to DMN engine &amp; Typed Values migration
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10593'>CAM-10593</a>] -         The process engine should only log exceptions that do not propagate to user code
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10603'>CAM-10603</a>] -         Improve default error pages in webapps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10606'>CAM-10606</a>] -         Use pagination for all backend queries in Webapps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10616'>CAM-10616</a>] -         Add index on ACT_HI_JOB_LOG.JOB_DEF_CONFIGURATION_
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10617'>CAM-10617</a>] -         In Webapps, cleanup vendor folder from unused libs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10627'>CAM-10627</a>] -         Log BPMN stack trace on level DEBUG
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10631'>CAM-10631</a>] -         CompetingMessageCorrelationTest is instable on Oracle 18
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10632'>CAM-10632</a>] -         Webapp ITs are executed against standalone webapps on vanilla tomcat &amp; widlfly
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10635'>CAM-10635</a>] -         Webapp ITs are executed against standalone webapps on vanilla WLS 12 R2 &amp; JBoss EAP 7.2
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10636'>CAM-10636</a>] -         Standalone Webapp ITs cannot be executed on JBoss EAP 6.x deployed via cargo plugin
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10639'>CAM-10639</a>] -         Task Rest query assigneeIn filter can be used by Tasklist filters
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10645'>CAM-10645</a>] -         I can filter case-insensitively for process instance variables in all web apps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10648'>CAM-10648</a>] -         Webapp ITs are executed against standalone webapps on vanilla WAS
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10649'>CAM-10649</a>] -         EE and CE use the same error page
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10663'>CAM-10663</a>] -         Introduce Standalone Webapps ITs for JBoss EAP 6.4
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10667'>CAM-10667</a>] -         Use latest license check version
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10671'>CAM-10671</a>] -         Needs to add documentation for &quot;enableFetchProcessDefinitionDescription&quot; flag 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10673'>CAM-10673</a>] -         Remove demo process from standalone web applications
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10674'>CAM-10674</a>] -         IBM JDK 8 builds fail
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10675'>CAM-10675</a>] -         Fix JS External Task Client CI
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10681'>CAM-10681</a>] -         Update version compatibility matrix for external task client
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10684'>CAM-10684</a>] -         Added description for enableFetchProcessDefinitionDescription
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10689'>CAM-10689</a>] -         JBoss EAP vanilla runtime points to wrong parent relative path
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10690'>CAM-10690</a>] -         Update JS promise API usage in the docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10695'>CAM-10695</a>] -         Bump dependencies 08/2019
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10703'>CAM-10703</a>] -         Javascript projects: Detect usage of dependencies with incompatible licenses
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10704'>CAM-10704</a>] -         Release external-task-client-js
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10705'>CAM-10705</a>] -         In webapps, centralize search config translation
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10709'>CAM-10709</a>] -         PR: processInstanceBusinessKeyIn docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10719'>CAM-10719</a>] -         Document Java Maintenance Policy for Docker Container
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10720'>CAM-10720</a>] -         Add Java 11 to docker container with Camunda 7.12
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10722'>CAM-10722</a>] -         Switch the parent of dmn engine
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10732'>CAM-10732</a>] -         I can read JavaDocs on TaskQuery properties that support Tasklist filters
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10734'>CAM-10734</a>] -         In Cockpit, timestamp for external task log can be copied
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10744'>CAM-10744</a>] -         Clarify that task or queries use conjunctive and not disjunctive normal form
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10756'>CAM-10756</a>] -         Wrong grammar in messages in BpmnBehaviorLogger (&#39;from type&#39;)
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10757'>CAM-10757</a>] -         Update doc - batchOperationsForHistoryCleanup parameter is supported only with spring beans and process engine plugins
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10758'>CAM-10758</a>] -         Admin - In Change Password section of &quot;Users&quot;, update the name of &quot;My Password&quot; field 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10760'>CAM-10760</a>] -         Classloading problem during job execution in WebLogic
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10773'>CAM-10773</a>] -         WebSphere 9 Full Installation Guide is incomplete
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10778'>CAM-10778</a>] -         Disable sign-in button while login request is in process
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10780'>CAM-10780</a>] -         Add e2e tests for case-insensitively variable search
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10790'>CAM-10790</a>] -         Fix Webapp build on windows
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10805'>CAM-10805</a>] -         Reduce the log level of &quot;User with id [...] does not exist&quot; exception
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10810'>CAM-10810</a>] -         Backport DMN 1.2 schema compatibility
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10812'>CAM-10812</a>] -         DMN engine &amp; typed values not deployed to maven central
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10814'>CAM-10814</a>] -         Add support for cascading changes on timer due dates in webapp
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10815'>CAM-10815</a>] -         Reduce overhead of building of process engines in the test suite
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10828'>CAM-10828</a>] -         Document that job definition get query request can be paginated
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10839'>CAM-10839</a>] -         Investigate failing standalone webapp ITs 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10841'>CAM-10841</a>] -         Adjust page login error message in webapps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10842'>CAM-10842</a>] -         Fix unstable engine test
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10854'>CAM-10854</a>] -         For IE 11, change CSRF cookie name e2e fails
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10856'>CAM-10856</a>] -         I can fetch process and decision definition versions without query limit in webapp API
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10857'>CAM-10857</a>] -         Master build for Java External Task Client fails
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10867'>CAM-10867</a>] -         On definition views, I can select a specific version independently of defined query limit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10875'>CAM-10875</a>] -         Fix wrong link in History page doc
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10876'>CAM-10876</a>] -         Improve process instance restart REST API docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10877'>CAM-10877</a>] -         Update serialization method in docs #306
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10878'>CAM-10878</a>] -         Increase timeout of nexus deployment to ten minutes
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10881'>CAM-10881</a>] -         Adjust webapp IT on Wildfly/JBoss
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10882'>CAM-10882</a>] -         Document logging configurations for common cases
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10884'>CAM-10884</a>] -         Fix failing karma tests regarding drd definition versions
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10885'>CAM-10885</a>] -         Release camunda bpm release parent
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10887'>CAM-10887</a>] -         Create Statistics Endpoint for Process Instances
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10890'>CAM-10890</a>] -         Configure test cafe reporter correctly
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10891'>CAM-10891</a>] -         Update bpm-release-parent version to latest in platform projects
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10892'>CAM-10892</a>] -         For a historic process instance, I can get the number of &quot;closed&quot; incidents
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10899'>CAM-10899</a>] -         Remove retired environments from docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10904'>CAM-10904</a>] -         Improve locked user IdentityServerTests
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10906'>CAM-10906</a>] -         I can retrieve the number of incidents grouped by activity id for a runtime process instance
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10917'>CAM-10917</a>] -         Bump jsonassert test dependency to 1.5.0
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10918'>CAM-10918</a>] -         Bump surefire plugin to 2.22.2
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10923'>CAM-10923</a>] -         Move Logging Rule to Camunda Commons
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10928'>CAM-10928</a>] -         Adjust mvn commands in platform/qa ReadMe files
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10929'>CAM-10929</a>] -         Deprecate optimize permissions in Java API
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10930'>CAM-10930</a>] -         Remove optimize permissions from Admin
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10936'>CAM-10936</a>] -         PR: changes to english translation
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10942'>CAM-10942</a>] -         Document maintenance policy for new environments
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10959'>CAM-10959</a>] -         Use new Endpoints to query for incidents
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10960'>CAM-10960</a>] -         Adjust Welcome Page to new layout in EE-Build
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10964'>CAM-10964</a>] -         Activate MDC logging output by default in Tomcat and Wildfly distros
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10967'>CAM-10967</a>] -         In welcome app, unbounded query is performed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10968'>CAM-10968</a>] -         In Admin, on user details view unbounded query is performed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10969'>CAM-10969</a>] -         In Cockpit, on process history view unbounded request is performed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10970'>CAM-10970</a>] -         In Cockpit, on process definition runtime view job suspension should be indicated earlier
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10980'>CAM-10980</a>] -         Fix Broken Frontend Tests after pagination merge
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10981'>CAM-10981</a>] -         In Cockpit, on decisions view I cannot jump to another page of the drd table
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10982'>CAM-10982</a>] -         In Cockpit, on decisions view I cannot sort decision definitions according to drd
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10984'>CAM-10984</a>] -         In Cockpit, on decisions view sorting of drds is not stored 
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10986'>CAM-10986</a>] -         In Cockpit, on process instance view, info box in activity instance tree does not contain limit
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10990'>CAM-10990</a>] -         Entity manager should not validate number of affected rows for INSERT statements
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10992'>CAM-10992</a>] -         I can sort decision definitions by decision requirements diagram key
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10993'>CAM-10993</a>] -         Document processDefinitionKeyIn filter for incident query
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11002'>CAM-11002</a>] -         Set up PR badge app on github
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11008'>CAM-11008</a>] -         Camunda BPM 7.12 is released
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11033'>CAM-11033</a>] -         Adjust the Unit Test Template after the 7.12 release
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11036'>CAM-11036</a>] -         Fix failing karma tests related to bugfix of welcome app login
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11037'>CAM-11037</a>] -         Adjust historic activity instances statistics to fetch number of instances
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11038'>CAM-11038</a>] -         In Admin, on adding a group on users details view translation string is not shown
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11045'>CAM-11045</a>] -         In Admin, on group details view request fails due to wrong url param value
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11046'>CAM-11046</a>] -         In welcome app, profile tile disappears
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11050'>CAM-11050</a>] -         In Cockpit, on migration page technical and meaningless value is shown under label
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11054'>CAM-11054</a>] -         In Cockpit, on process instance/definition history view in user operation log tab, remove frontend-side sorting
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11088'>CAM-11088</a>] -         Logging context parameters documentation have typo in keys
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11092'>CAM-11092</a>] -         Improve configuration docs of Spin DataFormats in Spring boot
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11097'>CAM-11097</a>] -         In blog posts, jira links with encoded filter queries are broken
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11099'>CAM-11099</a>] -         Link from examples repo to external task client examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11101'>CAM-11101</a>] -         Update License Book
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11112'>CAM-11112</a>] -         Improve JSON type name whitelisting documentation
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11115'>CAM-11115</a>] -         Document Documentation View and Case insensitive Queries
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11119'>CAM-11119</a>] -         Document minimum query max results limit for webapps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11125'>CAM-11125</a>] -         Add Nexus Repository links
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11128'>CAM-11128</a>] -         I can read documentation about the supported auto-config jackson modules
</li>
</ul>
                    
<h2>        Unteraufgabe
</h2>
<ul>
<li>[<a href='https://jira.camunda.com/browse/CAM-10118'>CAM-10118</a>] -         Update license terms in external task client js
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10119'>CAM-10119</a>] -         Add license headers to all javascript files
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10125'>CAM-10125</a>] -         Update license terms in get-started repos
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10375'>CAM-10375</a>] -         License header is added to javascript files in examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10376'>CAM-10376</a>] -         Add license headers to all javascript files in ee repos
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10389'>CAM-10389</a>] -         Add commercial license header in release-parent
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10559'>CAM-10559</a>] -         Add errorMessage to ErrorEndEvent
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10560'>CAM-10560</a>] -         Support errorMessage for error end event definitions in Model API
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10624'>CAM-10624</a>] -         Task query can filter by assignee list
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10625'>CAM-10625</a>] -         I can use the Task Rest endpoint to filter tasks by assignees
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10652'>CAM-10652</a>] -         In Cockpit, on user operation log I can set an annotation
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10664'>CAM-10664</a>] -         Introduce extra update statement to prevent updating the timestamp with mysql
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10665'>CAM-10665</a>] -         Using Java API, I can set an annotation to an operation log
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10666'>CAM-10666</a>] -         Using REST API, I can set an annotation to an operation log
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10668'>CAM-10668</a>] -         In Admin, I can grant permissions to update operation logs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10696'>CAM-10696</a>] -         Bump engine dependency: mybatis
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10698'>CAM-10698</a>] -         Bump engine dependency: gson
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10699'>CAM-10699</a>] -         Bump engine dependency: java-uuid-generator
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10702'>CAM-10702</a>] -         Bump engine dependency: slf4j-api
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10710'>CAM-10710</a>] -         Bump spin dependency: json-path
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10711'>CAM-10711</a>] -         Bump connect dependency: httpclient
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10712'>CAM-10712</a>] -         Bump engine dependency: h2
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10843'>CAM-10843</a>] -         In Webapps, I can change the csrf cookie name
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10845'>CAM-10845</a>] -         CSRF cookie name set by server can be changed
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10846'>CAM-10846</a>] -         I can read documentation how to change the csrf cookie name in webapps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10896'>CAM-10896</a>] -         In the Java API, I can search for process definitions without version tag
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-10897'>CAM-10897</a>] -         In the REST API, I can search for process definitions without version tag
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11009'>CAM-11009</a>] -         I can read an update guide for 7.12
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11010'>CAM-11010</a>] -         Update the Entity Relationship Diagrams in the docs
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11011'>CAM-11011</a>] -         Release all Camunda secondary projects
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11013'>CAM-11013</a>] -         I can read a blog post for 7.12.0
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11014'>CAM-11014</a>] -         Test standalone Webapps
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11015'>CAM-11015</a>] -         Adjust &amp; Migrate &quot;Spring Boot&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11016'>CAM-11016</a>] -         Adjust &amp; Migrate &quot;Misc&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11017'>CAM-11017</a>] -         Adjust &amp; Migrate &quot;Webapps&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11018'>CAM-11018</a>] -         Adjust &amp; Migrate &quot;Deployment &amp; Project Setup&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11019'>CAM-11019</a>] -         Adjust &amp; Migrate &quot;Plugin &amp; Model API&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11020'>CAM-11020</a>] -         Adjust &amp; Migrate &quot;BPMN 2.0&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11021'>CAM-11021</a>] -         Write tag for the adjusted examples repository
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11022'>CAM-11022</a>] -         Migrate Examples to 7.12.0
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11023'>CAM-11023</a>] -         Migrate Getting Started Guide (Java)
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11024'>CAM-11024</a>] -         Migrate the &quot;Spring Boot&quot; Getting Started Guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11025'>CAM-11025</a>] -         Migrate the &quot;Spring Framework&quot; Getting Started Guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11026'>CAM-11026</a>] -         Migrate the &quot;CMMN&quot; Getting Started Guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11027'>CAM-11027</a>] -         Migrate the &quot;DMN&quot; Getting Started Guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11028'>CAM-11028</a>] -         Migrate the &quot;JavaEE&quot; Getting Started Guide
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11029'>CAM-11029</a>] -         Migrate Getting Started Guide (Quickstart)
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11030'>CAM-11030</a>] -         Migrate Getting Started Guides
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11031'>CAM-11031</a>] -         Camunda 7.12 docs are released
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11078'>CAM-11078</a>] -         Adjust &amp; Migrate &quot;External Task&quot; Examples
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11098'>CAM-11098</a>] -         I can read a blog post for the side projects related to 7.12.0
</li>
<li>[<a href='https://jira.camunda.com/browse/CAM-11123'>CAM-11123</a>] -         Release all Camunda sideprojects
</li>
</ul>

