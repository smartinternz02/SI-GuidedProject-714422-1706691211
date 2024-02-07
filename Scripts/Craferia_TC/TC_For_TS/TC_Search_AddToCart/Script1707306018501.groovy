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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://craferia.com/')

WebUI.click(findTestObject('Object Repository/Page_Handicrafts Online, Indian Handicraft _c8b31e/a_Cane Furniture'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Buy - Cane Furniture of chair sofa set_e6ddd0/h1_Cane Furniture'), 
    'Cane Furniture')

WebUI.click(findTestObject('Object Repository/Page_Buy - Cane Furniture of chair sofa set_e6ddd0/img_Add to cart_attachment-woocommerce_thum_569712'))

WebUI.click(findTestObject('Object Repository/Page_Buy Bamboo Cane Chair for home office _009d68/button_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Buy Bamboo Cane Chair for home office _009d68/a_View cart'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Buy Bamboo Cane Chair for home office _009d68/a_View cart'))

