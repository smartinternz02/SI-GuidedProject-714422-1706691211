package custom_Package

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class IfElementPresentCheck {
	
	@Keyword
	def checkDropdownElementPresence(String dropdownLocator, String elementLocator) {
		// Wait for the dropdown to be visible and interactable
		WebUI.waitForElementVisible(dropdownLocator)
		WebUI.click(dropdownLocator)
	  
		// Wait for the dropdown options to be visible and interactable
		WebUI.waitForElementVisible(elementLocator)
	  
		// Create a Select object for the dropdown
		Select dropdown = new Select(findTestObject(dropdownLocator))
	  
		// Check if the dropdown contains the specified element
		dropdown.isOptionPresent(elementLocator)
	  }
	
}
