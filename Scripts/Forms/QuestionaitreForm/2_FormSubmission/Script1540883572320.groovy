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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('FormTab/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('FormTab/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('FormTab/login_Button'))

Thread.sleep(8000)

WebUI.click(findTestObject('FormTab/form_Tab'))

not_run: Thread.sleep(4000)

not_run: WebUI.click(findTestObject('FormTab/clickToViewMoreOption'))

not_run: WebUI.waitForElementNotVisible(findTestObject('FormTab/select500_Form'), 5)

not_run: WebUI.click(findTestObject('FormTab/select500_Form'))

Thread.sleep(3000)

WebUI.click(findTestObject('FormTab/options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'FormName.filterFormName'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/selectForm'))

Thread.sleep(4000)

//WebUI.click(driver.findElement(By.xpath("//*[@id='scs-forms-grid']/div[2]/table/tbody/tr/td[1 and contains(text(),'"+fo"'))))
not_run: CustomKeywords.'FormName.fillFormName'()

not_run: Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/fillForm_OpenLocationOption'))

Thread.sleep(2000)

not_run: WebUI.delay(3000)

WebUI.waitForElementNotVisible(findTestObject('FormTab/fillForm_SelectLocation'), 5)

WebUI.click(findTestObject('FormTab/fillForm_SelectLocation'))

Thread.sleep(3000)

WebUI.click(findTestObject('FormTab/fillForm_OpenResourceOption'))

Thread.sleep(2000)

not_run: WebUI.delay(4000)

WebUI.waitForElementNotVisible(findTestObject('FormTab/fillForm_SelectResource'), 5)

WebUI.click(findTestObject('FormTab/fillForm_SelectResource'))

Thread.sleep(3000)

//WebUI.click(findTestObject('Object Repository/FormTab/Page_SafetyChain/selectRes'))
//WebUI.setText(findTestObject('Form_Selection_Creation/sendResourceName'), 'rest1')
//driver.findElement(By.xpath('//*[@id=\'resrcDrpdown-list\']/span/input')).sendKeys(Keys.ENTER)
//WebUI.click(findTestObject('Form_Selection_Creation/sendResourceName'),Keys.ENTER)
//Thread.sleep(4000)
WebUI.setText(findTestObject('FormTab/fillForm_FreeSingleText'), 'MyText')

WebUI.setText(findTestObject('FormTab/fillForm_ParagraphText'), 'MyParagraph')

Thread.sleep(3000)

WebUI.setText(findTestObject('FormTab/fillForm_SelectOneOption'), 'SingleOption1')

Thread.sleep(3000)

driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div/div/div/div[4]/div/field-template/div/div/div/div/span/span/input')).sendKeys(
		Keys.ENTER)

Thread.sleep(3000)

WebUI.setText(findTestObject('FormTab/fillForm_SelectMultipleOption'), 'MultipleOption1')

Thread.sleep(3000)

driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div/div/div/div[5]/div/field-template/div/div/div/div/div/div/input')).sendKeys(
		Keys.ENTER)

WebUI.click(findTestObject('FormTab/fillForm_SelectMultipleOption'))

Thread.sleep(4000)

driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div[2]/div/div/div[6]/div/field-template/div/div[2]/div/div/span[1]/span/input[1]')).sendKeys(
		'9')

WebUI.setText(findTestObject('FormTab/fillForm_DateText'), '10/18/2018')

WebUI.setText(findTestObject('FormTab/fillForm_TimeText'), '9:00 AM')

WebUI.setText(findTestObject('FormTab/fillForm_DateTimeText'), '10/18/2018 9:00 AM')

WebUI.click(findTestObject('FormTab/fillForm_SubmitButton'))

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/fillForm_SubmissionOkButton'))

Thread.sleep(3000)

