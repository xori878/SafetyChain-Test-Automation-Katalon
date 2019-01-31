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

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Username'), GlobalVariable.UserName1)

not_run: WebUI.setText(findTestObject('TestUserLocation/login_Password'), GlobalVariable.Password111)

Thread.sleep(2000)

CustomKeywords.'AdminTool_Location.setSupplierName'()

not_run: WebUI.click(findTestObject('TestUserLocation/login_Button'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

not_run: WebUI.click(findTestObject('TestUserLocation/adminTool'))

WebUI.click(findTestObject('TestUserLocation/mainMenuResourceDesigner'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/SuppliersDesign'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/categories'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/defaultArea'))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/hoverHeading'))

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SuppliersName', 1))

Thread.sleep(2000)

WebUI.click(findTestObject('TestUserLocation/saveButton'))

Thread.sleep(4000)

Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

WebUI.click(findTestObject('TestResource/mainMenu_resources'))

Thread.sleep(4000)

WebUI.click(findTestObject('TestResource/suppliers'))

Thread.sleep(4000)

CustomKeywords.'AdminTool_Location.selectSupplier'()

Thread.sleep(4000)

not_run: WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

not_run: Thread.sleep(2000)

not_run: WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubSuppliersName1', 
        1))

not_run: WebUI.setText(findTestObject('TestResource/setPhoneNumber'), '912378456')

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestResource/saveDetailButton'))

not_run: Thread.sleep(7000)

not_run: WebUI.click(findTestObject('TestResource/disableResource'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestResource/button2Yes'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestResource/saveDetailButton'))

not_run: Thread.sleep(7000)

not_run: WebUI.click(findTestObject('TestResource/linksTab'))

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestResource/addLink'))

not_run: Thread.sleep(5000)

not_run: WebUI.check(findTestObject('TestResource/selectSecondResourceToLink'))

not_run: CustomKeywords.'AdminTool_Location.resourceLinkName'()

not_run: Thread.sleep(2000)

not_run: WebUI.click(findTestObject('TestResource/button2Save'))

not_run: Thread.sleep(4000)

not_run: WebUI.click(findTestObject('TestResource/locationTab'))

not_run: Thread.sleep(5000)

not_run: CustomKeywords.'AdminTool_Location.checkLocation'()

not_run: Thread.sleep(4000)

not_run: WebUI.click(findTestObject('TestResource/saveLocation'))

not_run: WebUI.click(findTestObject('TestUserLocation/mainmenu_button'))

not_run: WebUI.click(findTestObject('TestResource/mainMenu_resources'))

not_run: Thread.sleep(4000)

not_run: WebUI.click(findTestObject('TestResource/suppliers'))

not_run: Thread.sleep(4000)

not_run: CustomKeywords.'AdminTool_Location.selectSupplier'()

not_run: Thread.sleep(4000)

WebUI.click(findTestObject('TestUserLocation/addPlusIcon'))

Thread.sleep(2000)

WebUI.setText(findTestObject('TestUserLocation/setNewName'), findTestData('LocationData').getValue('SubSuppliersName2', 
        1))

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

Thread.sleep(6000)

