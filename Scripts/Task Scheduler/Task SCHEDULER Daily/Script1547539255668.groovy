import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.time.LocalDateTime as LocalDateTime
import java.time.format.DateTimeFormatter as DateTimeFormatter
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.openBrowser('https://test2.stage.safetychain.com/#!/login')

//WebUI.navigateToUrl()
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Task Scheduler Daily/input_USER NAME_Username'), 'adit')

WebUI.setEncryptedText(findTestObject('null'), '8SQVv/p9jVQJB1dwUUG01g==')

WebUI.click(findTestObject('Task Scheduler Daily/button_LOGIN'))

Thread.sleep(3000)

CustomKeywords.'DailyTask.taskname'()

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/use'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/div_Task Scheduler'))

Thread.sleep(7000)

WebUI.click(findTestObject('Task Scheduler Daily/button_Schedule Task'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/span_Select Form'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/div_MyForm'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/span_NEXT'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task Scheduler Daily/input_TASK NAME_scs-new-form-i'), findTestData('Tasksdaily').getValue(
        1, 2))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/AddResource'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/Select_Resource'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/span_Select Workgroup'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/div_NWG28153'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task Scheduler Daily/textarea_TASK DESCRIPTION_scs-'), 'this is daily task!!')

Thread.sleep(5000)

WebUI.click(findTestObject('Task Scheduler Daily/span_NEXT - page2'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/span_One Time Only'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/div_Daily'))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task Scheduler Daily/span_FIRST DUE DATE_k-select'))

Thread.sleep(3000)

DateTimeFormatter dtf = DateTimeFormatter.ofPattern('MM/dd/yyyy')

LocalDateTime now = LocalDateTime.now()

WebUI.setText(findTestObject('Task Scheduler Daily/a_14'), dtf.format(now))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/span_Task DUE TIME_k-icon k-i-'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/li_0200'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/Assign before task is due -Hour'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Task Scheduler Daily/Assign before task is due -Hour'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/label_Task has end date'))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task Scheduler Daily/span_Task has end date_k-selec'))

Thread.sleep(5000)

DateFormat dateFormat = new SimpleDateFormat('MM/dd/yyyy')

Calendar c = Calendar.getInstance()

c.add(Calendar.DATE, 3)

String dateAfterToday = dateFormat.format(c.getTime())

WebUI.setText(findTestObject('Task Scheduler Daily/a_17'), dateAfterToday)

Thread.sleep(3000)

WebUI.click(findTestObject('Task Scheduler Daily/span_SAVE'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/svg_STAGE_scsIcon scs-hamburge'))

Thread.sleep(4000)

WebUI.click(findTestObject('TaskScheduler-One time/inbox'))

Thread.sleep(3000)

not_run: WebUI.refresh()

WebUI.setText(findTestObject('TaskScheduler-One time/InputSearchTaskIn_inbox'), findTestData('Tasksdaily').getValue(
        1, 2))

Thread.sleep(10000)

WebUI.click(findTestObject('TaskScheduler-One time/Search_taskButton'), FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/div_adit s'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_Logout'))

WebUI.closeBrowser()

