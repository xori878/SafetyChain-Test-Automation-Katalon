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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

CustomKeywords.'FormName.setTaskName'()

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/requirements'))

Thread.sleep(4000)

WebUI.click(findTestObject('SupplierFlow/addSupplierPlus'))

Thread.sleep(2000)

WebUI.setText(findTestObject('SupplierFlow/setSupplierInRequirement'), 'SupplierTST14')

WebUI.sendKeys(findTestObject('SupplierFlow/setSupplierInRequirement'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

WebUI.click(findTestObject('SupplierFlow/optionToSelectNewRequirement'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/selectCompleteForm'))

Thread.sleep(10000)

not_run: WebUI.check(findTestObject('SupplierFlow/selectForm'))

CustomKeywords.'Supplier.selectForm'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/nextButtonReqForm'))

Thread.sleep(4000)

WebUI.setText(findTestObject('SupplierFlow/setTaskName'), findTestData('FormData').getValue('TaskName', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/saveButtonTask'))

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/supplierTabInRequirement'))

