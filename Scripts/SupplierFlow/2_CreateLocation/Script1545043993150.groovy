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

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password11)

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.setLocationName'()

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.setLocationNameInLocation'()

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

not_run: WebUI.click(findTestObject('TestUserLocation/adminTool'))

WebUI.click(findTestObject('TestUserLocation/mainMenuResourceDesigner'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/locations'))

Thread.sleep(4000)

not_run: WebUI.refresh()

not_run: Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/categories'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/defaultArea'))

WebUI.click(findTestObject('TestUserLocation/hoverHeading'))

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('LocationName', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

WebUI.click(findTestObject('TestUserLocation/mainMenuLocation'))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.selectLocation'()

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubLocationName', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveLocationDetailButton'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/customerSelect'))

Thread.sleep(4000)

WebUI.check(findTestObject('TestUserLocation/select4ResouceInCustomer'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveLocationDetailButton'))

Thread.sleep(6000)

