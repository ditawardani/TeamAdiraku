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

WebUI.callTestCase(findTestCase('Login OrangeHRM/login'), [('username') : 'Admin', ('password') : 'admin123', ('failed') : 'admin1234'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Menu Recruitment/button_recruitment'))

WebUI.click(findTestObject('Menu Recruitment/button_recruitment'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Menu Recruitment/dropdown_jobTitle'))

WebUI.click(findTestObject('Menu Recruitment/dropdown_jobTitle'))

WebUI.click(findTestObject('Menu Recruitment/option_jobTitle'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Menu Recruitment/dropdown_vacancy'))

WebUI.click(findTestObject('Menu Recruitment/dropdown_jobTitle'))

WebUI.click(findTestObject('Menu Recruitment/option_vacancy', [('vacancy') : vacancy]))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Menu Recruitment/button_search'))

WebUI.click(findTestObject('Menu Recruitment/list_recordSeniorQALead'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Menu Recruitment/menu_vacancies'))

WebUI.click(findTestObject('Menu Recruitment/menu_vacancies'))

WebUI.takeScreenshot()

