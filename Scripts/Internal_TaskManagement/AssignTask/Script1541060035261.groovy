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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('FormTab/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('FormTab/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('FormTab/login_Button'))

Thread.sleep(8000)

WebUI.click(findTestObject('FormTab/form_Tab'))

CustomKeywords.'FormName.recogniseFormForTask'()

Thread.sleep(5000)

WebUI.click(findTestObject('FormTab/options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'FormName.filterFormName'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.mouseOver(findTestObject('mainmenu_Forms_Inbox/form_Over'))

Thread.sleep(2000)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/clickToOpenFormActions'))

Thread.sleep(2000)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Assign Tasks'))

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Task Name_scs-assign-tas'), 'MyTask')

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_AA'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_AK'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_NWG79956'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_WorkGroup24322'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Select Resource'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Select Resource'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_AK'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_AA'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_WorkGroup24322'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/div_Resource'))

WebUI.doubleClick(findTestObject('mainmenu_Forms_Inbox/span_Select Resource'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/body_STAGE        SuperAdmin U'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_WorkGroup24322'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_NWG79956'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Select Resource'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/div_Select Resource'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/body_STAGE        SuperAdmin U_1'))

WebUI.doubleClick(findTestObject('mainmenu_Forms_Inbox/body_STAGE        SuperAdmin U_2'))

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Due By_scs-assigntask-da'), 's')

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Due By_k-icon k-i-clock'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_0030'))

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Due By_scs-assigntask-da'), '11/01/2018 00:30')

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/textarea_Note_scs-assign-task-'), 'ss')

WebUI.click(findTestObject('mainmenu_Forms_Inbox/button_ASSIGN'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/use'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/div_Inbox'))

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Task Total_searchInput n'), 'asas')

WebUI.sendKeys(findTestObject('mainmenu_Forms_Inbox/input_Task Total_searchInput n'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/div_Task Total_k-grid-content'))

WebUI.closeBrowser()

