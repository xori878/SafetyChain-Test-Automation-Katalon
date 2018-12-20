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

not_run: WebUI.acceptAlert()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools'))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_AdminTools_FormDesigner'))

//WebUI.click(findTestObject('Form_Selection_Creation/DirectRelease'))
//Thread.sleep(2000)
WebUI.click(findTestObject('Form_Selection_Creation/selectCheckForm'))

Thread.sleep(3000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_selectResource'), findTestObject('Form_Selection_Creation/Target_Res_Object'))

Thread.sleep(6000)

WebUI.click(findTestObject('Form_Selection_Creation/formCreation_NextToDesignForm'))

Thread.sleep(4000)

CustomKeywords.'FormName.createForm'(findTestObject('Form_Selection_Creation/formDesign_FormName'))

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectSection'), findTestObject('Form_Selection_Creation/default_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_SectionName'), 'Section1')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFieldgroup'), findTestObject('Form_Selection_Creation/section_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_FieldGroupName'), 'Group1')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectFree Text'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_FreetextName'), 'Name')

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_Select_SelectOne'), findTestObject('Form_Selection_Creation/group_area'))

WebUI.setText(findTestObject('Form_Selection_Creation/formDesign_Select_OneName'), 'Gender')

Thread.sleep(3000)

WebUI.click(findTestObject('Form_Selection_Creation/button_Add New'))

WebUI.setText(findTestObject('Form_Selection_Creation/addSingleValue1'), 'Male')

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/button_Add New'))

WebUI.setText(findTestObject('Form_Selection_Creation/addSingleValue2'), 'Female')

not_run: Thread.sleep(3000)

WebUI.click(findTestObject('RuleBuilder/advance_Button'))

Thread.sleep(2000)

WebUI.click(findTestObject('RuleBuilder/addnew_Button_DependencyRule'))

Thread.sleep(2000)

WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), 'Name')

Thread.sleep(2000)

WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), Keys.chord(Keys.ENTER))

Thread.sleep(3000)

println('Start')

not_run: WebUI.click(findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

not_run: WebElement source = driver.findElement(By.xpath('//*[@id=\'scs-rule-builder-right-header-container\']/div[13]'))

Actions actions = new Actions(driver)

//actions.clickAndHold(driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[13]"))).pause(1000).moveToElement(driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[1]/div[2]"))).pause(2000).moveByOffset(300, 1).build().perform()
//actions.clickAndHold(driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[13]"))).pause(1000).moveToElement(driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[1]/div[2]")),300, 1).click().build().perform()
//-actions.clickAndHold(driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[13]"))).moveToElement(driver.findElement(By.xpath("//*[@id='scs-rule-builder-container']/div/div/div[1]/div[2]")),300, 1).release().build().perform()
//WebElement e = actions.moveToElement(driver.findElement(By.xpath('//*[@id=\'scs-rule-builder-container\']/div/div/div[1]/div[2]')), 
  //  300, 1)

//actions.clickAndHold(driver.findElement(By.xpath('//*[@id=\'scs-rule-builder-right-header-container\']/div[13]'))).pause(
    //1000).moveByOffset(730, 230).click(e).build().perform()

actions.dragAndDropBy(driver.findElement(By.xpath("//*[@id='scs-rule-builder-right-header-container']/div[13]")), 1000, 240).build().perform()
//Thread.sleep(2000)
//Actions.moveByOffset(730, 230)
//
//Actions.release()
//
//Actions.perform()
not_run: CustomKeywords.'MyTest.clickDrag'()

not_run: WebUI.click(findTestObject('RuleBuilder/value_Button'))

not_run: WebUI.dragAndDropByOffset(findTestObject('RuleBuilder/value_Button'), 730, 230)

not_run: WebUI.click

Thread.sleep(4000)

not_run: WebUI.dragAndDropToObject(findTestObject('RuleBuilder/value_Button'), findTestObject('RuleBuilder/ifStatementArea'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('RuleBuilder/value_Field'), 'Person')

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('RuleBuilder/saveClose_Button'))

not_run: Thread.sleep(3000)

WebUI.dragAndDropToObject(findTestObject('Form_Selection_Creation/formDesign_SelectNumeric'), findTestObject('Form_Selection_Creation/group_area'))

Thread.sleep(2000)

WebUI.setText(findTestObject('Form_Selection_Creation/formDesignt_NumericName'), 'Age')

WebUI.click(findTestObject('RuleBuilder/advance_Button'))

Thread.sleep(2000)

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

WebUI.click(findTestObject('RuleBuilder/addnew_Button_Expressions'))

WebUI.dragAndDropToObject(findTestObject('RuleBuilder/if_Button'), findTestObject('RuleBuilder/expression_Area'))

WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), 'Gender')

Thread.sleep(2000)

WebUI.setText(findTestObject('RuleBuilder/attrubute_Field_input'), Keys.chord(Keys.ENTER))

Thread.sleep(2000)

WebUI.click(findTestObject('RuleBuilder/ifStatementArea'))

Thread.sleep(2000)

WebUI.dragAndDropToObject(findTestObject('RuleBuilder/value_Button'), findTestObject('RuleBuilder/ifStatementArea'))

Thread.sleep(2000)

