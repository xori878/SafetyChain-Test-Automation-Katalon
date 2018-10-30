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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('New_User_Latest/NewUserCreation_input_USER NAME_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('New_User_Latest/NewUserCreation_input_PASSWORD_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_button_LOGIN'))

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_use'))

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_div_Admin Tools'))

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_div_Users'))

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_div_ADD NEW'))

CustomKeywords.'RandomRoles.clickName'(findTestObject('New_User_Latest/NewUserCreation_input_User Name_txtUserName'))

not_run: WebUI.setText(findTestObject('New_User_Latest/NewUserCreation_input_User Name_txtUserName'), 'anan')

WebUI.setEncryptedText(findTestObject('New_User_Latest/NewUserCreation_input_Password_txtUserPassword'), 
    '8SQVv/p9jVQJB1dwUUG01g==')

WebUI.setText(findTestObject('New_User_Latest/NewUserCreation_input_First Name_ng-untouched'), 'anan')

WebUI.setText(findTestObject('New_User_Latest/NewUserCreation_input_Last Name_ng-valid ng-va'), 's')

WebUI.setText(findTestObject('New_User_Latest/NewUserCreation_input_Email_ng-valid ng-valid-'), 'aishwarya@email.com')

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_span_Afghanistan'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_li_Republic of India'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_div_Location(s)_k-multiselect-'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_li_DC'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_div_Role(s)'))

Thread.sleep(5000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_li_Adminrole'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/WorkGroupObject'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_li_NWG28153'))

Thread.sleep(3000)

WebUI.click(findTestObject('New_User_Latest/NewUserCreation_button_SAVE'))

Thread.sleep(3000)

WebUI.setText(findTestObject('SearchNewUser/input_ADD NEW_filterText'), 'anan')

Thread.sleep(3000)

WebUI.click(findTestObject('SearchNewUser/span_ADD NEW_fa fa-search'))

Thread.sleep(3000)

WebUI.closeBrowser()

