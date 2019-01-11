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

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

CustomKeywords.'AdminTool_Location.setItemName'()

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

not_run: Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestUserLocation/adminTool'))

WebUI.click(findTestObject('TestUserLocation/mainMenuResourceDesigner'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/yesDelete'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/items'))

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/categories'), 45)

WebUI.click(findTestObject('TestUserLocation/categories'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/defaultArea'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/hoverHeading'))

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('ItemsName', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveButton'))

Thread.sleep(4000)

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/mainMenu_resources'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/items'))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.selectItem'()

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/addPlusIcon'), 45)

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubItemsName1', 1))

not_run: WebUI.setText(findTestObject('TestResource/setPhoneNumber'), '912378456')

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveDetailButton'))

Thread.sleep(7000)

WebUI.click(findTestObject('TestResource/disableResource'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/button2Yes'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveDetailButton'))

Thread.sleep(7000)

WebUI.click(findTestObject('TestResource/linksTab'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/addLink'))

Thread.sleep(5000)

WebUI.check(findTestObject('TestResource/selectSecondResourceToLink'))

CustomKeywords.'AdminTool_Location.resourceLinkName'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/button2Save'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/locationTab'))

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

Thread.sleep(5000)

CustomKeywords.'AdminTool_Location.checkLocation'()

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/saveLocation'))

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/mainMenu_resources'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/items'))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.selectItem'()

Thread.sleep(4000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/addPlusIcon'), 45)

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubItemsName2', 1))

not_run: WebUI.setText(findTestObject('TestResource/setPhoneNumber'), '912378456')

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveDetailButton'))

Thread.sleep(7000)

WebUI.click(findTestObject('TestResource/linksTab'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/addLink'))

Thread.sleep(5000)

WebUI.check(findTestObject('TestResource/selectSecondResourceToLink'))

CustomKeywords.'AdminTool_Location.resourceLinkName'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/button2Save'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/locationTab'))

Thread.sleep(5000)

CustomKeywords.'AdminTool_Location.checkLocation'()

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/saveLocation'))

