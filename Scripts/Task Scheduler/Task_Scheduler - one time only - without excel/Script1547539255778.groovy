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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test2.stage.safetychain.com/#!/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('TaskScheduler-One time/input_USER NAME_Username'), 'adit')

WebUI.setEncryptedText(findTestObject('TaskScheduler-One time/input_PASSWORD_Password'), 
    '8SQVv/p9jVTr42PP0SyOXg==')

WebUI.click(findTestObject('TaskScheduler-One time/button_LOGIN'))

WebUI.click(findTestObject('TaskScheduler-One time/svg_STAGE_scsIcon scs-hamburge'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/div_Task Scheduler'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/button_Schedule Task'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_Select Form'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/div_MyForm'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_NEXT'))

Thread.sleep(3000)

WebUI.setText(findTestObject('TaskScheduler-One time/input_TASK NAME_scs-new-form-i'), 
    'MyForm- One time 14 Nov')

Thread.sleep(5000)

WebUI.click(findTestObject('TaskScheduler-One time/span_Select Workgroup'))

Thread.sleep(5000)

WebUI.click(findTestObject('TaskScheduler-One time/div_NWG28153'))

Thread.sleep(5000)

WebUI.setText(findTestObject('TaskScheduler-One time/textarea_TASK DESCRIPTION_scs-'), 
    'This is one time task!!')

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_NEXT'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_DUE DATE  TIME_k-icon k-i'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/li_0200'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_SAVE'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/div_adit s'))

Thread.sleep(3000)

WebUI.click(findTestObject('TaskScheduler-One time/span_Logout'))

WebUI.closeBrowser()

