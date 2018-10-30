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

WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

CustomKeywords.'FormName.setData'()

WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

//WebUI.click(findTestObject('Form_Selection_Creation/DirectRelease'))
Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/selectAuditForm'))

Thread.sleep(3000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_selectResource'), findTestObject('Form_Selection_Creation/Target_Res_Object'))

Thread.sleep(5000)

WebUI.click(findTestObject('Form_Selection_Creation/formCreation_NextToDesignForm'))

Thread.sleep(3000)

CustomKeywords.'FormName.createForm'(findTestObject('Form_Selection_Creation/formDesign_FormName'))

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectSection'), findTestObject('Form_Selection_Creation/default_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_SectionName'), 'This is a Section')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFieldgroup'), findTestObject('Form_Selection_Creation/section_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_questionGroupName_Text'), 'This is Field Group')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFree Text'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_SingleLineName'), 'This is Free Text')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectParagraphText'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_ParagraphName'), 'This is Paragraph')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_Select_SelectOne'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_Select_OneName'), 'This is Select One')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/button_AddNew1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1singleValue1'), 'Single Option1')

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/button_AddNew1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1singleValue2'), 'Single Option2')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_Select_SelectMultiple'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_Select_MultipleName'), 'This is Select Multiple')

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/button_addNewMul1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1MultipleValue1'), 'Multiple Option1')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/button_addNewMul1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1MultipleValue2'), 'Multiple Option2')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectNumeric'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesignt_NumericName'), 'This is Numeric Field')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectDate'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_DateName'), 'This is Date')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectTime'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_TimeName'), 'This is Time')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectDateTime'), findTestObject('Form_Selection_Creation/questionGroupArea'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_DateTimeName'), 'This is Date-Time')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/formCreation_NextToDesignForm'))

Thread.sleep(7000)

WebUI.click(findTestObject('Form_Selection_Creation/div_Preview             Form1'))

Thread.sleep(4000)

WebUI.click(findTestObject('Form_Selection_Creation/button_Release'))

Thread.sleep(4000)

