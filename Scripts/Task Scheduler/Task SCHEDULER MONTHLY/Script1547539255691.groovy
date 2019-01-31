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

WebUI.navigateToUrl('https://test2.stage.safetychain.com/#!/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Task_scheduler Monthly/input_USER NAME_Username'), 'adit')

WebUI.setEncryptedText(findTestObject('Task_scheduler Monthly/input_PASSWORD_Password'), 
    '8SQVv/p9jVQJB1dwUUG01g==')

WebUI.click(findTestObject('Task Scheduler Daily/button_LOGIN'))

WebUI.click(findTestObject('Task_scheduler Monthly/svg_STAGE_scsIcon scs-hamburge'))

Thread.sleep(3000)

CustomKeywords.'MonthlyTask.taskname1'()

WebUI.click(findTestObject('Task_scheduler Monthly/div_Task Scheduler'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/button_Schedule Task'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Select Form'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/div_AUTO_TEST_FORM_ON_17122018'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_NEXT'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Monthly/input_TASK NAME_scs-new-form-i'), findTestData('TaskMonthly').getValue(
        1, 1))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Select Resource'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/div_Instace32351'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Select Workgroup'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/div_DM NEW WG'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Monthly/textarea_TASK DESCRIPTION_scs-'), 
    'This i s  monthly task!!')

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_NEXT - page2'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_One Time Only'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/div_Monthly'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_DAY OF MONTH TASK IS DUE_'))

Thread.sleep(3000)

DateTimeFormatter dtf = DateTimeFormatter.ofPattern('MM/dd/yyyy')

LocalDateTime now = LocalDateTime.now()

WebUI.setText(findTestObject('Task Scheduler Daily/a_14'), dtf.format(now))

//DateTimeFormatter dtf = DateTimeFormatter.ofPattern('MM/dd/yyyy')
//LocalDateTime now = LocalDateTime.now()
//WebUI.setText(findTestObject('Task scheduler Monthly/Page_SafetyChain/a_27'), dtf.format(now))
//WebUI.setText(findTestObject('Task Scheduler Monthly/Page_SafetyChain/a_14'), dtf.format(now))
Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/clickAnywhere'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Task DUE TIME_k-icon k-i-'))

Thread.sleep(5000)

WebUI.click(findTestObject('Task_scheduler Monthly/li_0200'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_DAYS_k-icon k-i-arrow-60-'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/label_Task has end date'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Task has end date_k-icon'))

Thread.sleep(3000)

DateFormat dateFormat = new SimpleDateFormat('MM/dd/yyyy')

Calendar c = Calendar.getInstance()

c.add(Calendar.DATE, 90)

String dateAfterToday = dateFormat.format(c.getTime())

WebUI.setText(findTestObject('Task Scheduler Daily/a_17'), dateAfterToday)

//WebUI.click(findTestObject('Task_scheduler Monthly/a_27_1'))
Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_SAVE'))

Thread.sleep(8000)

WebUI.click(findTestObject('Task_scheduler Monthly/use'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/div_Inbox'))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task_scheduler Monthly/b_AUTO_TEST_FORM_ON_17122018-1'))

not_run: WebUI.click(findTestObject('Task_scheduler Monthly/td_AUTO_TEST_FORM_ON_17122018-'))

not_run: WebUI.click(findTestObject('Task_scheduler Monthly/b_AUTO_TEST_FORM_ON_17122018-1'))

WebUI.setText(findTestObject('Task_scheduler Monthly/input_Task Total_searchInput n'), 
    findTestData('TaskMonthly').getValue(1, 1))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Task Total_fa fa-search'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/div_adit s_scs-user-icon'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Monthly/span_Logout'))

