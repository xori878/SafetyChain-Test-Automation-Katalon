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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Task_scheduler Yearly/input_USER NAME_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Task_scheduler Yearly/input_PASSWORD_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Task Scheduler Daily/button_LOGIN'))

WebUI.click(findTestObject('Task_scheduler Yearly/svg_STAGE_scsIcon scs-hamburge'))

Thread.sleep(5000)

CustomKeywords.'YearlyTask.taskname1'()

WebUI.click(findTestObject('Task_scheduler Yearly/div_Task Scheduler'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/button_Schedule Task'))

Thread.sleep(3000)

WebUI.waitForElementClickable(findTestObject('Task_scheduler Yearly/span_Select Form'), 30)

WebUI.click(findTestObject('Task_scheduler Yearly/span_Select Form'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/div_AUTO_TEST_FORM_ON_17122018'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_NEXT'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Yearly/input_TASK NAME_scs-new-form-i'), findTestData('TaskScheduler').getValue(
        4, 1))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task_scheduler Yearly/span_Select Resource'))

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task_scheduler Yearly/div_Instace32351'))

not_run: Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_Select Workgroup'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/div_DM NEW WG'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Yearly/textarea_TASK DESCRIPTION_scs-'), 'This is Yearly task!!')

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_NEXT - page2'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_One Time Only'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/div_Yearly'))

Thread.sleep(3000)

WebUI.click(findTestObject('NATaskScheduler_Yearly/Page_SafetyChain/span_FIRST DUE DATE_k-icon k-i'))

Thread.sleep(3000)

DateTimeFormatter dtf = DateTimeFormatter.ofPattern('MM/dd/yyyy')

LocalDateTime now = LocalDateTime.now()

WebUI.setText(findTestObject('Task Scheduler Daily/a_14'), dtf.format(now))

//DateTimeFormatter dtf = DateTimeFormatter.ofPattern('MM/dd/yyyy')
//LocalDateTime now = LocalDateTime.now()
//WebUI.setText(findTestObject('Task scheduler Yearly/Page_SafetyChain/a_27'), dtf.format(now))
//WebUI.setText(findTestObject('Task Scheduler Yearly/Page_SafetyChain/a_14'), dtf.format(now))
Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/clickAnywhere'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_Task DUE TIME_k-icon k-i-'))

Thread.sleep(7000)

WebUI.click(findTestObject('Task_scheduler Yearly/li_0200'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/label_Task has end date'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_YEAR OF LAST TASK_k-icon'))

WebUI.doubleClick(findTestObject('Task YEARLY NA/Page_SafetyChain/span_YEAR OF LAST TASK_k-icon _1'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_YEAR OF LAST TASK_k-icon _2'))

WebUI.click(findTestObject('Task_scheduler Yearly/span_SAVE'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/use'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/div_Inbox'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Yearly/input_Task Total_searchInput n'), findTestData('TaskScheduler').getValue(
        4, 1))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_Task Total_fa fa-search'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/div_adit s_scs-user-icon'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Yearly/span_Logout'))

WebUI.closeBrowser()

