import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
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
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Form_Selection_Creation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('Form_Selection_Creation/login_Password'), GlobalVariable.Password11)

CustomKeywords.'FormName.setData'()

WebUI.click(findTestObject('Form_Selection_Creation/login_Button'))

Thread.sleep(3000)

WebDriver driver = DriverFactory.getWebDriver()

CustomKeywords.'MyTest.find'()

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

not_run: WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

//WebUI.click(findTestObject('Form_Selection_Creation/DirectRelease'))
//Thread.sleep(2000)
not_run: WebUI.click(findTestObject('Form_Selection_Creation/selectCheckForm'))

not_run: Thread.sleep(3000)

not_run: WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_selectResource'), findTestObject('Form_Selection_Creation/Target_Res_Object'))

not_run: Thread.sleep(6000)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/formCreation_NextToDesignForm'))

not_run: Thread.sleep(4000)

not_run: CustomKeywords.'FormName.createForm'(findTestObject('Form_Selection_Creation/formDesign_FormName'))

not_run: Thread.sleep(2000)

not_run: WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectSection'), findTestObject('Form_Selection_Creation/default_area'))

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_SectionName'), 'Section1')

not_run: Thread.sleep(2000)

not_run: WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFieldgroup'), findTestObject(
        'Form_Selection_Creation/section_area'))

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_FieldGroupName'), 'Group1')

not_run: Thread.sleep(2000)

not_run: WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFree Text'), findTestObject(
        'Form_Selection_Creation/group_area'))

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_FreetextName'), 'Name')

not_run: Thread.sleep(2000)

not_run: WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_Select_SelectOne'), findTestObject(
        'Form_Selection_Creation/group_area'))

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_Select_OneName'), 'Gender')

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/button_Add New'))

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/addSingleValue1'), 'Male')

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('Form_Selection_Creation/button_Add New'))

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/addSingleValue2'), 'Female')

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('RuleBuilder/advance_Button'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/addnew_Button_DependencyRule'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), 'Name')

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), Keys.chord(Keys.ENTER))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

not_run: WebElement source = driver.findElement(By.xpath('//*[@id=\'scs-rule-builder-right-header-container\']/div[13]'))

not_run: Actions Actions = new Actions(driver)

not_run: Actions.moveToElement(source, 660, 230)

not_run: Actions.clickAndHold()

not_run: Actions.release()

not_run: Actions.perform()

not_run: CustomKeywords.'FormName.getSize'()

not_run: WebUI.dragAndDropByOffset(findTestObject('RuleBuilder/value_Button'), 660, 230)

not_run: WebUI.dragAndDropToObject(findTestObject('RuleBuilder/value_Button'), findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/value_Field'), 'Person')

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/saveClose_Button'))

not_run: Thread.sleep(3000)

not_run: WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectNumeric'), findTestObject('Form_Selection_Creation/group_area'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('Form_Selection_Creation/formDesignt_NumericName'), 'Age')

not_run: WebUI.click(findTestObject('RuleBuilder/advance_Button'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/addnew_Button_DependencyRule'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), 'Gender')

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), Keys.chord(Keys.ENTER))

not_run: Thread.sleep(2000)

not_run: WebUI.dragAndDropByOffset(findTestObject('RuleBuilder/value_Button'), 580, 230)

not_run: WebUI.dragAndDropToObject(findTestObject('RuleBuilder/value_Button'), findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/compare_Button'))

not_run: WebUI.sendKeys(findTestObject('RuleBuilder/compare_Button'), Keys.chord(Keys.DOWN))

not_run: WebUI.setText(findTestObject('RuleBuilder/value_Field1'), 'null')

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/saveClose_Button'))

not_run: WebUI.click(findTestObject('RuleBuilder/addnew_Button_Expressions'))

not_run: WebUI.dragAndDropToObject(findTestObject('RuleBuilder/if_Button'), findTestObject('RuleBuilder/expression_Area'))

not_run: WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), 'Gender')

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), Keys.chord(Keys.ENTER))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

not_run: WebUI.dragAndDropToObject(findTestObject('RuleBuilder/value_Button'), findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

