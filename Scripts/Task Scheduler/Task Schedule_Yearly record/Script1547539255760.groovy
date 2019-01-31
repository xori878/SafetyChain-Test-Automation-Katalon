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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test2.stage.safetychain.com/#!/login')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/input_USER NAME_Username'), 'adit')

WebUI.setEncryptedText(findTestObject('Task YEARLY NA/Page_SafetyChain/input_PASSWORD_Password'), '8SQVv/p9jVQJB1dwUUG01g==')

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/button_LOGIN'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/use'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_Task Scheduler'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/button_Schedule Task'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_Select Form'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_BarcodeNazExpression'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_NEXT'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_Select Resource'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_123'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_Select Workgroup'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_DM NEW WG'))

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-'), 'm')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_1'), '')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_2'), 'y')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_3'), 'ye')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_4'), 'yea')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_5'), 'year')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_6'), 'yearl')

WebUI.setText(findTestObject('Task YEARLY NA/Page_SafetyChain/textarea_TASK DESCRIPTION_scs-_7'), 'yearly')

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_NEXT'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_One Time Only'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_Yearly'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_FIRST DUE DATE_k-icon k-i'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/a_9'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_Task DUE TIME_k-icon k-i-'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/li_0200'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_WEEKS_k-link k-link-incre'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/label_Task has end date'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_YEAR OF LAST TASK_k-icon'))

WebUI.doubleClick(findTestObject('Task YEARLY NA/Page_SafetyChain/span_YEAR OF LAST TASK_k-icon _1'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_YEAR OF LAST TASK_k-icon _2'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_SAVE'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/div_adit s'))

WebUI.click(findTestObject('Task YEARLY NA/Page_SafetyChain/span_Logout'))

