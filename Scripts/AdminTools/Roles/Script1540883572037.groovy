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

WebUI.setText(findTestObject('Role-Latest/ManageRoles_input_USER NAME_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Role-Latest/ManageRoles_input_PASSWORD_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('Role-Latest/ManageRoles_button_LOGIN'))

WebUI.click(findTestObject('Role-Latest/ManageRoles_svg_STAGE_scsIcon scs-hamburge'))

WebUI.click(findTestObject('Role-Latest/ManageRoles_div_Admin Tools'))

WebUI.click(findTestObject('Role-Latest/ManageRoles_div_Roles'))

WebUI.click(findTestObject('Role-Latest/ManageRoles_i_UserAdmin_fa fa-plus-circle'))

CustomKeywords.'RandomRoles.clickElement'(findTestObject('Role-Latest/ManageRoles_input_UserAdmin_scs-list-view-'))

WebUI.click(findTestObject('Role-Latest/ManageRoles_div_SAVE'))

Thread.sleep(6000)

WebUI.click(findTestObject('User_role Attachment-Latest/UserRoleLink_span_Users'))

Thread.sleep(4000)

WebUI.setText(findTestObject('User_role Attachment-Latest/UserRoleLink_input_SAVE_scs-manage-roles-se'), 'Superadmin')

Thread.sleep(4000)

WebUI.click(findTestObject('User_role Attachment-Latest/UserRoleLink_span_SAVE_fa fa-search'))

Thread.sleep(4000)

WebUI.click(findTestObject('User_role Attachment-Latest/UserRoleLink_input_select_scs-grid-row-chec'))

Thread.sleep(4000)

WebUI.click(findTestObject('User_role Attachment-Latest/UserRoleLink_div_SAVE'))

Thread.sleep(4000)

WebUI.click(findTestObject('Role-Latest/ManageRoles_div_adit s_scs-user-icon'))

Thread.sleep(5000)

WebUI.verifyElementChecked(findTestObject('User_role Attachment-Latest/Page_SafetyChain/Page_SafetyChain/ToCheckElementIsTicked'), 
    5)

WebUI.click(findTestObject('Role-Latest/ManageRoles_li_Logout'))

WebUI.closeBrowser()

