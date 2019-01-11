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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

not_run: WebUI.openBrowser(GlobalVariable.URL)

Thread.sleep(2000)

not_run: WebUI.maximizeWindow()

not_run: Thread.sleep(2000)

WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('TestUserLocation/login_Username'), findTestData('SupplierData').getValue('UserName', 1))

WebUI.setText(findTestObject('TestUserLocation/login_Password'), findTestData('SupplierData').getValue('Password', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

WebUI.setText(findTestObject('TestUser/newPassword'), findTestData('SupplierData').getValue('NewPassword', 1))

WebUI.setText(findTestObject('TestUser/confirmPassword'), findTestData('SupplierData').getValue('NewPassword', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/createPasswordButton'))

Thread.sleep(4000)

WebUI.setText(findTestObject('TestUserLocation/login_Username'), findTestData('SupplierData').getValue('UserName', 1))

WebUI.setText(findTestObject('TestUserLocation/login_Password'), findTestData('SupplierData').getValue('NewPassword', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

CustomKeywords.'Submission.supplierPortalSubmission'()

not_run: CustomKeywords.'Supplier.selectSupplierTask'()

not_run: Thread.sleep(4000)

//WebUI.click(findTestObject('Object Repository/FormTab/Page_SafetyChain/selectRes'))
//WebUI.setText(findTestObject('Form_Selection_Creation/sendResourceName'), 'rest1')
//driver.findElement(By.xpath('//*[@id=\'resrcDrpdown-list\']/span/input')).sendKeys(Keys.ENTER)
//WebUI.click(findTestObject('Form_Selection_Creation/sendResourceName'),Keys.ENTER)
//Thread.sleep(4000)
not_run: WebUI.setText(findTestObject('FormTab/fillForm_FreeSingleText'), 'MyText')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_ParagraphText'), 'MyParagraph')

not_run: Thread.sleep(3000)

not_run: WebUI.setText(findTestObject('FormTab/fillForm_SelectOneOption'), 'SingleOption1')

not_run: Thread.sleep(3000)

not_run: driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div/div/div/div[4]/div/field-template/div/div/div/div/span/span/input')).sendKeys(
    Keys.chord(Keys.ENTER))

not_run: Thread.sleep(3000)

not_run: WebUI.setText(findTestObject('FormTab/fillForm_SelectMultipleOption'), 'MultipleOption1')

not_run: Thread.sleep(3000)

not_run: driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div/div/div/div[5]/div/field-template/div/div/div/div/div/div/input')).sendKeys(
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('FormTab/fillForm_SelectMultipleOption'))

not_run: Thread.sleep(4000)

not_run: driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div[2]/div/div/div[6]/div/field-template/div/div[2]/div/div/span[1]/span/input[1]')).sendKeys(
    '9')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_DateText'), '10/18/2018')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_TimeText'), '9:00 AM')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_DateTimeText'), '10/18/2018 9:00 AM')

not_run: WebUI.click(findTestObject('FormTab/fillForm_SubmitButton'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('SupplierFlow/formSubmissionNote'), 'Form may require correction.')

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('FormTab/fillForm_SubmissionOkButton'))

not_run: Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('TestUser/clickToCheck'), 45)

WebUI.click(findTestObject('TestUser/clickToCheck'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/logoutUser'))

Thread.sleep(2000)

