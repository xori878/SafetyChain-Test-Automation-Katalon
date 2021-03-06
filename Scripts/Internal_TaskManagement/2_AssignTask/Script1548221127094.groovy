import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By

not_run: WebUI.openBrowser(GlobalVariable.URL)

not_run: WebUI.maximizeWindow()

not_run: WebDriver driver = DriverFactory.getWebDriver()

not_run: WebUI.setText(findTestObject('FormTab/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('FormTab/login_Password'), GlobalVariable.Password)

not_run: WebUI.click(findTestObject('FormTab/login_Button'))

WebUI.waitForElementClickable(findTestObject('DocumentTab/wait'), 20)

Thread.sleep(2000)

WebUI.refresh()

WebUI.waitForElementClickable(findTestObject('FormTab/form_Tab'), 45)

Thread.sleep(6000)

WebUI.click(findTestObject('FormTab/form_Tab'))

CustomKeywords.'FormName.setTaskName'()

Thread.sleep(7000)

CustomKeywords.'AdminTool_Location.moveCursor'()

WebUI.waitForElementClickable(findTestObject('FormTab/selectForm'), 45)

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/openResTypeInBrowser'))

Thread.sleep(2000)

WebUI.click(findTestObject('Form_Selection_Creation/selectItem'))

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('FormTab/filterOption'))

Thread.sleep(3000)

CustomKeywords.'FormName.filterFormName'()

Thread.sleep(2000)

WebUI.click(findTestObject('FormTab/filterButton'))

Thread.sleep(4000)

WebUI.mouseOver(findTestObject('mainmenu_Forms_Inbox/form_Over'))

Thread.sleep(2000)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/clickToOpenFormActions'))

Thread.sleep(2000)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Assign Tasks'))

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Task Name_scs-assign-tas'), findTestData('FormData').getValue('TaskName', 
        1))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/open_Location'))

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/select_4_Location'))

not_run: Thread.sleep(4000)

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_NWG79956'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_WorkGroup24322'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/select_1 Resource'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/select_1 Resource'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_AK'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_AA'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_WorkGroup24322'))

not_run: WebUI.doubleClick(findTestObject('mainmenu_Forms_Inbox/select_1 Resource'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/body_STAGE        SuperAdmin U'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_WorkGroup24322'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_NWG79956'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/open_Resource'))

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/select_1 Resource'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/Inbox'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/body_STAGE        SuperAdmin U_1'))

not_run: WebUI.doubleClick(findTestObject('mainmenu_Forms_Inbox/body_STAGE        SuperAdmin U_2'))

not_run: WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Due By_scs-assigntask-da'), 's')

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/span_Due By_k-icon k-i-clock'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/li_0030'))

CustomKeywords.'TaskMGMT.setData'()

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/input_Due By_scs-assigntask-da'), '11/01/2018 06:30')

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/textarea_Note_scs-assign-task-'), 'My Note')

WebUI.click(findTestObject('mainmenu_Forms_Inbox/button_ASSIGN'))

Thread.sleep(3000)

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/use'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/div_Inbox'))

not_run: WebUI.click(findTestObject('mainmenu_Forms_Inbox/Submit'))

not_run: WebUI.sendKeys(findTestObject('mainmenu_Forms_Inbox/search_Task'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form_Selection_Creation/mainMenu_Button'))

WebUI.click(findTestObject('mainmenu_Forms_Inbox/Inbox'))

Thread.sleep(7000)

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/search_Task'), findTestData('FormData').getValue('TaskName', 1))

Thread.sleep(3000)

WebUI.sendKeys(findTestObject('mainmenu_Forms_Inbox/search_Task'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotPresent(findTestObject('FormTab/selectForm2'), 45)

WebUI.waitForElementClickable(findTestObject('FormTab/selectForm'), 45)

Thread.sleep(6000)

WebUI.doubleClick(findTestObject('mainmenu_Forms_Inbox/selectTask'))

Thread.sleep(4000)

CustomKeywords.'Submission.formSubmission'()

//WebUI.click(findTestObject('Object Repository/FormTab/Page_SafetyChain/selectRes'))
//WebUI.setText(findTestObject('Form_Selection_Creation/sendResourceName'), 'rest1')
//driver.findElement(By.xpath('//*[@id=\'resrcDrpdown-list\']/span/input')).sendKeys(Keys.ENTER)
//WebUI.click(findTestObject('Form_Selection_Creation/sendResourceName'),Keys.ENTER)
//Thread.sleep(4000)
not_run: WebUI.setText(findTestObject('FormTab/fillForm_FreeSingleText'), 'MyText')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_ParagraphText'), 'MyParagraph')

not_run: Thread.sleep(3000)

not_run: WebUI.setText(findTestObject('FormTab/fillForm_SelectOneOption'), 'Select Option1')

not_run: Thread.sleep(3000)

not_run: driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div/div/div/div[4]/div/field-template/div/div/div/div/span/span/input')).sendKeys(
    Keys.ENTER)

not_run: Thread.sleep(3000)

not_run: WebUI.setText(findTestObject('FormTab/fillForm_SelectMultipleOption'), 'Multiple Option1')

not_run: Thread.sleep(3000)

not_run: driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div/div/div/div[5]/div/field-template/div/div/div/div/div/div/input')).sendKeys(
    Keys.ENTER)

not_run: Thread.sleep(3000)

not_run: WebUI.click(findTestObject('FormTab/fillForm_SelectMultipleOption'))

not_run: Thread.sleep(4000)

not_run: driver.findElement(By.xpath('//*[@id=\'scs-form-level\']/div/div/div/div[2]/div/div/div[6]/div/field-template/div/div[2]/div/div/span[1]/span/input[1]')).sendKeys(
    '9')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_DateText'), '10/18/2018')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_TimeText'), '9:00 AM')

not_run: WebUI.setText(findTestObject('FormTab/fillForm_DateTimeText'), '10/18/2018 9:00 AM')

not_run: WebUI.click(findTestObject('FormTab/fillForm_SubmitButton'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('FormTab/fillForm_SubmissionOkButton'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('mainmenu_Forms_Inbox/home'), 45)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/home'))

Thread.sleep(6000)

not_run: WebUI.closeBrowser()

WebUI.click(findTestObject('mainmenu_Forms_Inbox/task_Tab'))

Thread.sleep(3000)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/task_Options'))

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('mainmenu_Forms_Inbox/task_FilterOption'))

Thread.sleep(3000)

WebUI.setText(findTestObject('mainmenu_Forms_Inbox/filter_Task_Name'), findTestData('FormData').getValue('TaskName', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('mainmenu_Forms_Inbox/task_FilterButton'))

Thread.sleep(4000)

WebUI.verifyElementNotPresent(findTestObject('mainmenu_Forms_Inbox/task_Over'), 5)

Thread.sleep(4000)

