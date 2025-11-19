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

WebUI.navigateToUrl('https://test-automation.kartala.dev/login')

WebUI.setText(findTestObject('Object Repository/Log-001/Page_Login/input_Email_email-field'), 'nandito1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Log-001/Page_Login/input_Password_password-field'), 'nClRDAXnLFZ0nsQJoQp77g==')

WebUI.click(findTestObject('Object Repository/Log-001/Page_Login/button_Password_login-btn'))

WebUI.verifyMatch(WebUI.getUrl(), 'https://test-automation.kartala.dev/', false)

WebUI.verifyTextPresent('Registered Users', false)

WebUI.closeBrowser()

