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

WebUI.click(findTestObject('Object Repository/Page_Handicrafts Online, Indian Handicraft _c8b31e/a_Home Decor  Items  Gifts'))

WebUI.click(findTestObject('Object Repository/Page_Buy Home Decor Items of Handicrafts an_da8078/img'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wall Decor  Wall Decor Items  Craferia/h1_Wall Decor'), 'Wall Decor')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wall Decor  Wall Decor Items  Craferia/h1_Wall Decor'), 'Wall Decor')

WebUI.click(findTestObject('Object Repository/Page_Wall Decor  Wall Decor Items  Craferia/img'))

WebUI.click(findTestObject('Object Repository/Page_Wall Art Decor, Home Decor Wall Art  Craferia/img_Add to cart_attachment-woocommerce_thum_569712'))

WebUI.click(findTestObject('Object Repository/Page_Buy Gold Metal Flowers Wall Art - Craferia/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Buy Gold Metal Flowers Wall Art - Craferia/a_View cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cart - Handicrafts Online, Indian Hand_f49c5a/h1_Cart'), 
    'Cart')

WebUI.closeBrowser()

