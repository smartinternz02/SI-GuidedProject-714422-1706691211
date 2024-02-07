import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/th_Subtotal'), 
    'Subtotal')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/th_Shipping'), 
    'Shipping')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/th_Total'), 
    'Total')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/a_Proceed to checkout'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_first_name'), 
    'XYZ')

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_last_name'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_last_name'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_last_name'), 
    'ABC')

WebUI.click(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/span_India'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_address_1'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input_(optional)_billing_address_2'), 
    '456')

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_city'), 
    'ABC')

WebUI.click(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/span_Delhi'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_postcode'), 
    '1200000')

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_phone'), 
    '9885555555')

WebUI.setText(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/input__billing_email'), 
    'abc@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Checkout - Handicrafts Online, Indian _dcf088/button_Place order'))

WebUI.closeBrowser()

