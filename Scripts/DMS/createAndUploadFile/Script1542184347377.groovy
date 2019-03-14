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

WebUI.callTestCase(findTestCase('DMS/5_CreateWG'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('DMS_Forms/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('DMS_Forms/login_Password'), GlobalVariable.Password)

String path = PathUtil.relativeToAbsolutePath('../SafetyChain-Test-Automation-Katalon/SCTestData', RunConfiguration.getProjectDir())

CustomKeywords.'FormName.setDocumentName'()

not_run: WebUI.click(findTestObject('DMS_Forms/login_Button'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS_Forms/mainmenu_button'))

WebUI.click(findTestObject('DMS_Forms/mainmenu_Document'))

Thread.sleep(4000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

WebUI.sendKeys(findTestObject('DMS/uploadFile'), path + '/Desert.jpg')

Thread.sleep(21000)

WebUI.sendKeys(findTestObject('DMS/uploadFile'), path + '/Lighthouse.jpg')

Thread.sleep(18000)

WebUI.sendKeys(findTestObject('DMS/uploadFile'), path + '/Penguins.jpg')

Thread.sleep(24000)

WebUI.click(findTestObject('DMS/selectInDocument'))

WebUI.click(findTestObject('DMS/viewDocument'))

Thread.sleep(24000)

WebUI.back()

Thread.sleep(6000)

WebUI.click(findTestObject('DMS/selectInDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/editDetail'))

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/setDocumentNameText'), findTestData('FormData').getValue('DocumentName1', 1))

WebUI.setText(findTestObject('DMS/descriptionField'), 'This is a document file')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmButton'))

Thread.sleep(6000)

WebUI.click(findTestObject('DMS/selectInDocument1'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/editDetail'))

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/setDocumentNameText'), findTestData('FormData').getValue('DocumentName2', 1))

WebUI.setText(findTestObject('DMS/descriptionField'), 'This is a document file')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS/selectInDocument3'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/editDetail'))

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/setDocumentNameText'), findTestData('FormData').getValue('DocumentName3', 1))

WebUI.setText(findTestObject('DMS/descriptionField'), 'This is a document file used for assigning task operation')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmButton'))

Thread.sleep(6000)

CustomKeywords.'FormName.getDocumentName'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/manageLinks'))

WebUI.check(findTestObject('DMS/selectLinkToResource'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmButton'))

Thread.sleep(4000)

CustomKeywords.'FormName.getDocumentName'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/uploadNew'))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/browsePath'), path + '/Tulips.jpg')

WebUI.setText(findTestObject('DMS/commentBox'), 'This is uploaded Document')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/uploadNewButton'))

Thread.sleep(24000)

CustomKeywords.'FormName.getDocumentName'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/download'))

Thread.sleep(8000)

CustomKeywords.'FormName.getDocumentName'()

WebUI.click(findTestObject('DMS/deleteDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmDeleteYes'))

Thread.sleep(8000)

CustomKeywords.'FormName.getDocumentName1'()

WebUI.click(findTestObject('DMS/deleteDocument'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmDeleteYes'))

Thread.sleep(8000)

WebUI.click(findTestObject('DMS/selectDocument'))

Thread.sleep(3000)

WebUI.click(findTestObject('DMS/deleteDocumentDMS'))

Thread.sleep(2000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'FormName.getDocumentName1'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/restoreButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('DMS/selectDocument'))

Thread.sleep(3000)

WebUI.click(findTestObject('DMS/documentTypes'))

WebUI.refresh()

Thread.sleep(3000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'FormName.getDocumentName1'()

Thread.sleep(3000)

CustomKeywords.'FormName.getDocumentName3'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/assign_Task'))

Thread.sleep(7000)

WebUI.setText(findTestObject('DMS/setTaskName'), findTestData('FormData').getValue('TaskNameDMS', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/openWG'))

Thread.sleep(2000)

CustomKeywords.'FormName.selectWGInDMS'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/confirmButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('DMS_Forms/mainmenu_button'))

WebUI.click(findTestObject('DMS/inbox'))

Thread.sleep(7000)

WebUI.setText(findTestObject('DMS/search_Task'), findTestData('FormData').getValue('TaskNameDMS', 1))

Thread.sleep(3000)

WebUI.sendKeys(findTestObject('DMS/search_Task'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

WebUI.doubleClick(findTestObject('DMS/selectTask'))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/browsePath'), path + '/Chrysanthemum.jpg')

WebUI.setText(findTestObject('DMS/commentBox'), 'This is uploaded Document after assigning task')

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/uploadNewButton'))

Thread.sleep(10000)

WebUI.click(findTestObject('DMS_Forms/mainmenu_button'))

WebUI.click(findTestObject('DMS_Forms/mainmenu_Document'))

Thread.sleep(18000)

WebUI.setText(findTestObject('DMS/searchDocument'), GlobalVariable.DocumentName)

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.DOWN))

Thread.sleep(2000)

WebUI.sendKeys(findTestObject('DMS/searchDocument'), Keys.chord(Keys.ENTER))

Thread.sleep(4000)

CustomKeywords.'FormName.getDocumentName3'()

Thread.sleep(2000)

WebUI.click(findTestObject('DMS/viewDocument'))

