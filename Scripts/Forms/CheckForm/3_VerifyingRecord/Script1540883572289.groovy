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

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Record/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('Record/login_Password'), GlobalVariable.Password11)

not_run: WebUI.click(findTestObject('Record/login_Button'))

not_run: Thread.sleep(8000)

WebUI.click(findTestObject('Record/record_Tab'))

Thread.sleep(5000)

WebUI.click(findTestObject('FormTab/clickToViewMoreOption'))

Thread.sleep(4000)

WebUI.waitForElementNotVisible(findTestObject('FormTab/select500_Form'), 5)

WebUI.click(findTestObject('FormTab/select500_Form'))

Thread.sleep(7000)

CustomKeywords.'FormName.recordFormName'()

Thread.sleep(4000)

WebUI.click(findTestObject('Record/editForm'))

Thread.sleep(2000)

WebUI.setText(findTestObject('FormTab/fillForm_FreeSingleText'), 'MyTextEdited')

WebUI.setText(findTestObject('FormTab/fillForm_ParagraphText'), 'MyParagraphEdited')

Thread.sleep(2000)

WebUI.click(findTestObject('Record/submitButton'))

Thread.sleep(4000)

WebUI.setText(findTestObject('Record/commentText'), 'This form is edited in record.')

Thread.sleep(2000)

WebUI.click(findTestObject('Record/acceptSubmitButton'))

Thread.sleep(6000)

WebUI.click(findTestObject('Record/okButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('Record/record'))

Thread.sleep(5000)

CustomKeywords.'FormName.recordFormName'()

Thread.sleep(4000)

