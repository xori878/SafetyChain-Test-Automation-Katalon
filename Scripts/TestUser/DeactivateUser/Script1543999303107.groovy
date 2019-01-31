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

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

not_run: CustomKeywords.'User.setNamePass'()

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/users'))

Thread.sleep(6000)

WebUI.setText(findTestObject('TestUser/filterUser'), findTestData('UserData').getValue('UserName', 1))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('TestUser/filterUser'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/moveToUser'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/openUserOptions'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/deactivateUserOption'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/confirmUserYes'))

WebUI.waitForElementClickable(findTestObject('TestUser/clickToCheck'), 30)

Thread.sleep(7000)

WebUI.click(findTestObject('TestUser/clickToCheck'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/logoutUser'))

Thread.sleep(2000)

