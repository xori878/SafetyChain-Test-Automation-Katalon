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

WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

CustomKeywords.'AdminTool_Location.setLocationName'()

WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.setLocationNameInLocation'()

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/adminTool'))

Thread.sleep(2000)

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

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

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

CustomKeywords.'AdminTool_Location.selectLocation2'()

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubLocationName', 2))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveLocationDetailButton'))

not_run: WebUI.click(findTestObject('TestUserLocation/customerSelect'))

not_run: Thread.sleep(4000)

not_run: WebUI.check(findTestObject('TestUserLocation/select4ResouceInCustomer'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestUserLocation/saveLocationDetailButton'))
