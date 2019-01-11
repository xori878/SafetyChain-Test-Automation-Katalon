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

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password)

CustomKeywords.'FormName.setData'()

not_run: WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

//WebUI.click(findTestObject('Form_Selection_Creation/DirectRelease'))
Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/selectQuestionaireForm'))

Thread.sleep(3000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_selectResource'), findTestObject('Form_Selection_Creation/Target_Res_Object'))

Thread.sleep(6000)

WebUI.click(findTestObject('Form_Selection_Creation/formCreation_NextToDesignForm'))

Thread.sleep(4000)

CustomKeywords.'FormName.createForm'(findTestObject('Form_Selection_Creation/formDesign_FormName'))

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectSection'), findTestObject('Form_Selection_Creation/default_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_SectionName_text'), 'This is Section ')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFieldgroup'), findTestObject('Form_Selection_Creation/section_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_FieldGroupName_text'), 'This is Field Group ')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFree Text'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_SingleLineName_Text'), 'This is Single Line Text')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectParagraphText'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_ParagraphName_Text'), 'This is Paragraph')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_Select_SelectOne'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_Select_OneName_text'), 'This is Select One')

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/button_AddNew1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1singleValue1'), 'SingleOption1')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/button_AddNew1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1singleValue2'), 'SingleOption2')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_Select_SelectMultiple'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_Select_MultipleName_text'), 'This is Select Multiple')

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/button_addNewMul1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1MultipleValue1'), 'MultipleOption1')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/button_addNewMul1'))

WebUI.setText(findTestObject('Form_Selection_Creation/add1MultipleValue2'), 'MultipleOption2')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectNumeric'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_NumericName_Text'), 'This is a Number')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectDate'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_DateName_Text'), 'This is a Date')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectTime'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_TimeName_text'), 'This is a Time')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectDateTime'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_DateTimeName_Text'), 'This is a Date-Time')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/formCreation_NextToDesignForm'))

Thread.sleep(7000)

WebUI.click(findTestObject('Form_Selection_Creation/div_Preview             Form1'))

Thread.sleep(5000)

WebUI.click(findTestObject('Form_Selection_Creation/button_Release'))

Thread.sleep(4000)

