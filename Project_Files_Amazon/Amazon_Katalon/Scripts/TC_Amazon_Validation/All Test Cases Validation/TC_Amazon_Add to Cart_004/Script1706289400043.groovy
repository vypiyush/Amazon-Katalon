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

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com. Spend less. Smile more/select_All Departments        Arts  Crafts _135c92'), 
    'search-alias=electronics-intl-ship', true)

WebUI.setText(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com. Spend less. Smile more/input_field-keywords'), 
    'Mouse')

WebUI.click(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com. Spend less. Smile more/inputnav-search-submit-button'))

WebUI.click(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com  Mouse/span_Amazon Basics 2.4 Ghz Wireless Optical_dbf87c'))

WebUI.click(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com Amazon Basics 2.4 Ghz Wirel_3fd674/span_Quantity1'))

WebUI.click(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com Amazon Basics 2.4 Ghz Wirel_3fd674/a_5'))

WebUI.click(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com Amazon Basics 2.4 Ghz Wirel_3fd674/input_gift-wrap'))

WebUI.click(findTestObject('Object Repository/Amazon_Add to Cart_OR/Page_Amazon.com Amazon Basics 2.4 Ghz Wirel_3fd674/input_submit.add-to-cart'))

WebUI.closeBrowser()

