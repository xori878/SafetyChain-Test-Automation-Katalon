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

not_run: WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/login_Username'), findTestData('SupplierData').getValue('UserName', 1))

WebUI.setText(findTestObject('TestUserLocation/login_Password'), findTestData('SupplierData').getValue('NewPassword', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(6000)

WebUI.click(findTestObject('SupplierFlow/clickOnSuppReject'))

Thread.sleep(2000)

CustomKeywords.'Supplier.selectSupplierTask'()

Thread.sleep(4000)

driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div[2]/div/div/div[6]/div/field-template/div/div[2]/div/div/span[1]/span/input[1]')).sendKeys(
    '12')

WebUI.click(findTestObject('FormTab/fillForm_SubmitButton'))

Thread.sleep(2000)

WebUI.setText(findTestObject('SupplierFlow/formSubmissionNote'), 'Form is Finally submitted Correctly.')

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/fillForm_SubmissionOkButton'))

//Thread.sleep(4000)
Thread.sleep(6000)

WebUI.click(findTestObject('TestUser/clickToCheck'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUser/logoutUser'))

Thread.sleep(2000)

