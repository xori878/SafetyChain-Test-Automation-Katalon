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

not_run: WebUI.waitForElementClickable(findTestObject('TestUserLocation/login_Username'), 45)

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName)

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password)

CustomKeywords.'AdminTool_Location.setSupplierName'()

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

not_run: Thread.sleep(4000)

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestUserLocation/adminTool'))

WebUI.click(findTestObject('TestUserLocation/mainMenuResourceDesigner'))

WebUI.waitForElementClickable(findTestObject('TestUserLocation/mainmenu_button'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/yesDelete'))

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestResource/SuppliersDesign'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/SuppliersDesign'))

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/testAttLoad'), 30)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/categories'), 30)

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/categories'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/defaultArea'))

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/hoverHeading'), 45)

WebUI.click(findTestObject('TestUserLocation/hoverHeading'))

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SuppliersName', 1))

//String s1 = WebUI.getText(findTestData('LocationData').getValue('CustomerName', 1)).toString()
Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveButton'))

WebUI.waitForElementClickable(findTestObject('TestUserLocation/mainmenu_button'), 30)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/mainMenu_resources'))

WebUI.waitForElementClickable(findTestObject('TestResource/suppliers'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/suppliers'))

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestResource/linksTab'), 30)

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.selectSupplier'()

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/addPlusIcon'), 45)

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubSuppliersName1', 
        1))

Thread.sleep(2000)

CustomKeywords.'Submission.createResource'()

Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('TestResource/setPhoneNumber'), '912378456')

WebUI.click(findTestObject('TestResource/saveDetailButton'))

WebUI.waitForElementClickable(findTestObject('TestResource/saveDetailButton'), 30)

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestResource/disableResource'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/disableResource'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/button2Yes'))

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestResource/saveDetailButton'), 30)

not_run: Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveDetailButton'))

WebUI.waitForElementClickable(findTestObject('TestResource/saveDetailButton'), 30)

WebUI.waitForElementClickable(findTestObject('TestResource/linksTab'), 30)

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/linksTab'))

WebUI.waitForElementClickable(findTestObject('TestResource/addLink'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/addLink'))

WebUI.waitForElementClickable(findTestObject('TestResource/selectSecondResourceToLink'), 30)

Thread.sleep(2000)

WebUI.check(findTestObject('TestResource/selectSecondResourceToLink'))

CustomKeywords.'AdminTool_Location.resourceLinkName'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/button2Save'))

WebUI.waitForElementClickable(findTestObject('TestResource/locationTab'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/locationTab'))

WebUI.waitForElementClickable(findTestObject('TestResource/firstLoc'), 30)

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.checkLocation'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveLocation'))

WebUI.waitForElementClickable(findTestObject('TestUserLocation/mainmenu_button'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/mainMenu_resources'))

WebUI.waitForElementClickable(findTestObject('TestResource/suppliers'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/suppliers'))

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestResource/linksTab'), 30)

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.selectSupplier'()

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestUserLocation/addPlusIcon'), 45)

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubSuppliersName2', 
        1))

Thread.sleep(2000)

CustomKeywords.'Submission.createResource'()

not_run: WebUI.setText(findTestObject('TestResource/setPhoneNumber'), '912378456')

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveDetailButton'))

WebUI.waitForElementClickable(findTestObject('TestResource/saveDetailButton'), 30)

CustomKeywords.'AdminTool_Location.moveCursor'()

Thread.sleep(2000)

WebUI.waitForElementClickable(findTestObject('TestResource/linksTab'), 30)

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/linksTab'))

WebUI.waitForElementClickable(findTestObject('TestResource/addLink'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/addLink'))

WebUI.waitForElementClickable(findTestObject('TestResource/selectSecondResourceToLink'), 30)

Thread.sleep(2000)

WebUI.check(findTestObject('TestResource/selectSecondResourceToLink'))

CustomKeywords.'AdminTool_Location.resourceLinkName'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/button2Save'))

WebUI.waitForElementClickable(findTestObject('TestResource/locationTab'), 30)

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/locationTab'))

WebUI.waitForElementClickable(findTestObject('TestResource/firstLoc'), 30)

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.checkLocation'()

Thread.sleep(2000)

WebUI.click(findTestObject('TestResource/saveLocation'))

WebUI.waitForElementClickable(findTestObject('TestResource/saveLocation'), 30)

Thread.sleep(2000)

