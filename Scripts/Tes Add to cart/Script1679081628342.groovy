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

WebUI.navigateToUrl('https://shop.demoqa.com/product/playboy-x-missguided-plus-size-grey-lips-print-front-cropped-t-shirt/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/a_Dismiss'))

WebUI.scrollToPosition(0, 700)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an optionGrey'), 
    'grey', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an option404244'), 
    '44', true)

WebUI.click(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/button_QTY_qty-increase'))

WebUI.click(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/button_Add to cart'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Page_playboy x missguided plus size grey li_ba0ff0/a_View cart'))

WebUI.scrollToPosition(0, 500)

WebUI.delay(4)

WebUI.closeBrowser()

