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

WebUI.setText(findTestObject('Task_scheduler Weekly/input_USER NAME_Username'), 'adit')

WebUI.setEncryptedText(findTestObject('Task_scheduler Weekly/input_PASSWORD_Password'), '8SQVv/p9jVQJB1dwUUG01g==')

WebUI.click(findTestObject('Task_scheduler Weekly/button_LOGIN'))

WebUI.click(findTestObject('Task_scheduler Weekly/svg_STAGE_scsIcon scs-hamburge'))

Thread.sleep(5000)

CustomKeywords.'Weekly.taskname'()

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/div_Task Scheduler'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/button_Schedule Task'))

Thread.sleep(5000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_Select Form'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/div_MyForm'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/div_NEXT'))

Thread.sleep(5000)

WebUI.setText(findTestObject('Task_scheduler Weekly/input_TASK NAME_scs-new-form-i'), findTestData('TaskWeekly').getValue(
        1, 2))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/AddResource'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/Select_Resource'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_Select Workgroup'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/div_WG26696636'))

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Weekly/textarea_TASK DESCRIPTION_scs-'), 'this is a weekly task!!')

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_NEXT'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_One Time Only'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/div_Weekly'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/label_Mon'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/label_Tue'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/label_Wed'))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task_scheduler Weekly/span_FIRST DUE DATE_k-icon k-i'))

Thread.sleep(3000)

DateTimeFormatter dtf = DateTimeFormatter.ofPattern('MM/dd/yyyy')

LocalDateTime now = LocalDateTime.now()

Thread.sleep(3000)

WebUI.setText(findTestObject('Task_scheduler Weekly/a_19'), dtf.format(now))

Thread.sleep(8000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_Task DUE TIME_k-icon k-i-'))

Thread.sleep(5000)

WebUI.click(findTestObject('Task_scheduler Weekly/li_0200'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/Assign before task is due -Hour'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/label_Task has end date'))

not_run: CustomKeywords.'DailyTask.getHtmlTableRows'(findTestObject(null), '')

Thread.sleep(5000)

DateFormat dateFormat = new SimpleDateFormat('MM/dd/yyyy')

Calendar c = Calendar.getInstance()

c.add(Calendar.DATE, 23)

String dateAfterToday = dateFormat.format(c.getTime())

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Task_scheduler Weekly/span_Task has end date_k-icon'))

Thread.sleep(6000)

WebUI.setText(findTestObject('Task_scheduler Weekly/a_6'), dateAfterToday)

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_SAVE'))

WebUI.click(findTestObject('Task_scheduler Weekly/svg_STAGE_scsIcon scs-hamburge'))

WebUI.click(findTestObject('Task_scheduler Weekly/div_Inbox'))

WebUI.click(findTestObject('Task_scheduler Weekly/div_Loading..._k-loading-image'))

Thread.sleep(8000)

WebUI.setText(findTestObject('Task_scheduler Weekly/input_Task Total_searchInput n'), findTestData('TaskWeekly').getValue(
        1, 2))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/span_Task Total_fa fa-search'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/div_adit s_scs-user-icon'))

Thread.sleep(3000)

WebUI.click(findTestObject('Task_scheduler Weekly/li_Logout'))

WebUI.closeBrowser()

