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

WebUI.click(findTestObject('Object Repository/Page_Handicrafts Online, Indian Handicraft _c8b31e/a_Outdoor Furniture'))

WebUI.click(findTestObject('Object Repository/Page_Outdoor furniture, Garden Outdoor Furn_2f112f/img_COD is not Available on Furniture Items_6c6d63'))

WebUI.rightClick(findTestObject('Object Repository/Page_Buy Wooden Bench Charpai with 4 Mudda _9684e2/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Buy Wooden Bench Charpai with 4 Mudda _9684e2/form_Wooden Bench Charpai with 4 Mudda Stoo_add36b'))

WebUI.click(findTestObject('Object Repository/Page_Buy Wooden Bench Charpai with 4 Mudda _9684e2/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Buy Wooden Bench Charpai with 4 Mudda _9684e2/a_View cart'))

WebUI.closeBrowser()

