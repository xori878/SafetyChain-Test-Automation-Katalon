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

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName1)

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password1)

Thread.sleep(2000)

CustomKeywords.'Supplier.setSupplierName'()

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

not_run: Thread.sleep(6000)

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/requirements'))

Thread.sleep(4000)

WebUI.click(findTestObject('SupplierFlow/addSupplierPlus'))

Thread.sleep(2000)

WebUI.setText(findTestObject('SupplierFlow/setSupplierInRequirement'), findTestData('SupplierData').getValue('SupplierName', 
        1))

WebUI.sendKeys(findTestObject('SupplierFlow/setSupplierInRequirement'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

WebUI.click(findTestObject('SupplierFlow/optionToSelectNewRequirement'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/selectAckOption'))

WebUI.waitForElementNotPresent(findTestObject('SupplierFlow/testACK'), 45)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/testACK'), 45)

CustomKeywords.'Supplier.selectACK'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/nextButtonReqForm'))

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('SupplierFlow/bold'))

not_run: Thread.sleep(2000)

not_run: WebUI.sendKeys(findTestObject('SupplierFlow/ackMessage'), 'This is automatic acknowledment message.')

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/nextButtonReqForm'))

CustomKeywords.'Supplier.setACKTaskName'()

Thread.sleep(4000)

WebUI.setText(findTestObject('SupplierFlow/setTaskName'), findTestData('SupplierData').getValue('ACKTask', 1))

WebUI.click(findTestObject('SupplierFlow/approvedBy'))

Thread.sleep(2000)

CustomKeywords.'Supplier.selectWG'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/saveButtonTask'))

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/optionToSelectNewRequirement'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/selectCompleteForm'))

WebUI.waitForElementNotPresent(findTestObject('SupplierFlow/testForm'), 45)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/testForm'), 45)

not_run: WebUI.check(findTestObject('SupplierFlow/selectForm'))

CustomKeywords.'Supplier.selectForm'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/nextButtonReqForm'))

CustomKeywords.'Supplier.setFormTaskName'()

Thread.sleep(4000)

WebUI.setText(findTestObject('SupplierFlow/setTaskName'), findTestData('SupplierData').getValue('FormTask', 1))

WebUI.click(findTestObject('SupplierFlow/approvedBy'))

Thread.sleep(2000)

CustomKeywords.'Supplier.selectWG'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/saveButtonTask'))

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/optionToSelectNewRequirement'))

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/selectDocumentUploadOption'))

WebUI.waitForElementNotPresent(findTestObject('SupplierFlow/testDoc'), 45)

WebUI.waitForElementClickable(findTestObject('SupplierFlow/testDoc'), 45)

CustomKeywords.'Supplier.selectDocument'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/nextButtonReqForm'))

CustomKeywords.'Supplier.setDocTaskName'()

Thread.sleep(4000)

WebUI.setText(findTestObject('SupplierFlow/setTaskName'), findTestData('SupplierData').getValue('DocTask', 1))

WebUI.click(findTestObject('SupplierFlow/approvedBy'))

Thread.sleep(2000)

CustomKeywords.'Supplier.selectWG'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/saveButtonTask'))

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/supplierTabInRequirement'))

Thread.sleep(4000)

WebUI.click(findTestObject('SupplierFlow/selectNewSupplier'))

Thread.sleep(4000)

CustomKeywords.'Supplier.selectNewSupplier'()

Thread.sleep(2000)

WebUI.click(findTestObject('SupplierFlow/saveSupplierSelection'))

Thread.sleep(6000)

not_run: WebUI.click(findTestObject('TestUser/clickToCheck'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestUser/logoutUser'))

not_run: Thread.sleep(2000)

