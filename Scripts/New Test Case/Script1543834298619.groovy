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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebDriver driver = DriverFactory.getWebDriver()

WebUI.setText(findTestObject('FormTab/login_Username'), GlobalVariable.UserName)

Thread.sleep(5000)

WebUI.setText(findTestObject('FormTab/login_Password'), GlobalVariable.Password)

WebUI.click(findTestObject('FormTab/login_Button'))

Thread.sleep(8000)

WebUI.click(findTestObject('FormTab/form_Tab'))

WebUI.click(findTestObject('FormTab/options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(2000)

CustomKeywords.'FormName.filterFormName1'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/selectForm'))

not_run: WebUI.click(findTestObject('FormTab/clickToViewMoreOption'))

not_run: Thread.sleep(4000)

not_run: WebUI.waitForElementNotVisible(findTestObject('FormTab/select500_Form'), 5)

not_run: WebUI.click(findTestObject('FormTab/select500_Form'), FailureHandling.STOP_ON_FAILURE)

not_run: Thread.sleep(7000)

//WebUI.click(driver.findElement(By.xpath("//*[@id='scs-forms-grid']/div[2]/table/tbody/tr/td[1 and contains(text(),'"+fo"'))))
not_run: CustomKeywords.'FormName.fillFormName'()

Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/fillForm_OpenLocationOption'))

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/fillForm_SelectLocation'))

Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/fillForm_OpenResourceOption'))

Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/fillForm_SelectResource'))

Thread.sleep(4000)

CustomKeywords.'AnyForm.searchDocument1'()

WebUI.click(findTestObject('FormTab/fillForm_SubmitButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('FormTab/fillForm_SubmissionOkButton'))

Thread.sleep(6000)

