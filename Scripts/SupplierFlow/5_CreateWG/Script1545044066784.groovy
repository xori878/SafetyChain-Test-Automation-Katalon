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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password11)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.click(findTestObject('SupplierFlow/workgroup'))

Thread.sleep(5000)

WebUI.click(findTestObject('SupplierFlow/addButtonWG'))

WebUI.setText(findTestObject('SupplierFlow/setWGText'), findTestData('SupplierData').getValue('WorkGroupName', 1))

WebUI.sendKeys(findTestObject('SupplierFlow/setWGText'), Keys.chord(Keys.ENTER))

Thread.sleep(6000)

WebUI.setText(findTestObject('SupplierFlow/searchUserInWG'), 'Superadmin')

WebUI.sendKeys(findTestObject('SupplierFlow/searchUserInWG'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

WebUI.check(findTestObject('SupplierFlow/checkUserinWG'))

Thread.sleep(3000)

WebUI.click(findTestObject('SupplierFlow/saveInWG'))

