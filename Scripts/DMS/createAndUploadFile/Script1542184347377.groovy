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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('DMS_Forms/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('DMS_Forms/login_Password'), GlobalVariable.Password)

CustomKeywords.'FormName.setDocumentName'()

WebUI.click(findTestObject('DMS_Forms/login_Button'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS_Forms/mainmenu_button'))

WebUI.click(findTestObject('DMS_Forms/mainmenu_Document'))

Thread.sleep(4000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('DMS/addDocumentButton'))

not_run: Thread.sleep(4000)

not_run: WebUI.setText(findTestObject('DMS/newDocumentField'), 'MyDoc')

not_run: Thread.sleep(2000)

not_run: WebUI.sendKeys(findTestObject('DMS/newDocumentField'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

WebUI.sendKeys(findTestObject('DMS/uploadFile'), 'C:\\Users\\pashine_a\\Desert.jpg')

Thread.sleep(18000)

WebUI.sendKeys(findTestObject('DMS/uploadFile'), 'C:\\Users\\pashine_a\\Lighthouse.jpg')

Thread.sleep(15000)

WebUI.click(findTestObject('DMS/selectInDocument'))

WebUI.click(findTestObject('DMS/viewDocument'))

Thread.sleep(21000)

not_run: WebUI.sendKeys(findTestObject('DMS/uploadFile'), Keys.chord(Keys.ENTER))

WebUI.back()

Thread.sleep(4000)

WebUI.click(findTestObject('DMS/selectInDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/editDetail'))

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/setDocumentNameText'), findTestData('FormData').getValue('DocumentName1', 1))

WebUI.setText(findTestObject('DMS/descriptionField'), 'This is a document file')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/saveButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS/selectInDocument1'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/editDetail'))

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/setDocumentNameText'), findTestData('FormData').getValue('DocumentName2', 1))

WebUI.setText(findTestObject('DMS/descriptionField'), 'This is a document file')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/saveButton'))

Thread.sleep(2000)

CustomKeywords.'FormName.getDocumentName'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/manageLinks'))

WebUI.check(findTestObject('DMS/selectLinkToResource'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/saveButton'))

Thread.sleep(2000)

CustomKeywords.'FormName.getDocumentName'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/uploadNew'))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/browsePath'), 'C:\\Users\\pashine_a\\Tulips.jpg')

WebUI.setText(findTestObject('DMS/commentBox'), 'This is uploaded Document')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/uploadNewButton'))

Thread.sleep(10000)

CustomKeywords.'FormName.getDocumentName'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/download'))

Thread.sleep(8000)

CustomKeywords.'FormName.getDocumentName'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument'))

WebUI.click(findTestObject('DMS/deleteDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmDeleteYes'))

Thread.sleep(8000)

CustomKeywords.'FormName.getDocumentName1'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument1'))

WebUI.click(findTestObject('DMS/deleteDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmDeleteYes'))

Thread.sleep(8000)

WebUI.click(findTestObject('DMS/selectDocument'))

Thread.sleep(3000)

WebUI.click(findTestObject('DMS/deleteDocumentDMS'))

Thread.sleep(2000)

not_run: WebUI.click(findTestObject('DMS/viewdeletedDocument'))

not_run: Thread.sleep(4000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'FormName.getDocumentName1'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument1'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/restoreButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/saveButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/selectDocument'))

Thread.sleep(3000)

WebUI.click(findTestObject('DMS/documentTypes'))

WebUI.refresh()

Thread.sleep(3000)

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'FormName.getDocumentName1'()

not_run: WebUI.click(findTestObject('DMS/selectInDocument1'))

