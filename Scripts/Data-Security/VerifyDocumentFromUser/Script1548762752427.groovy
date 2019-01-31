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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Username'), findTestData('UserData').getValue('UserName', 
        1))

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), findTestData('UserData').getValue('NewPassword', 
        1))

not_run: String path = PathUtil.relativeToAbsolutePath('../SafetyChain-Test-Automation-Katalon/SCTestData', RunConfiguration.getProjectDir())

not_run: WebUI.click(findTestObject('DMS_Forms/login_Button'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS_Forms/mainmenu_button'))

WebUI.click(findTestObject('DMS_Forms/mainmenu_Document'))

Thread.sleep(4000)

CustomKeywords.'Submission.docUploadAdmin'()

Thread.sleep(4000)

WebUI.setText(findTestObject('DMS/searchDocument'), findTestData('LocationData').getValue(8, 1))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'Submission.verifyDocInUSer'()

Thread.sleep(4000)

