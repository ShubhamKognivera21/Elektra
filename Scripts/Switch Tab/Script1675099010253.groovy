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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.elektra.mx/')

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/img_Inicia sesin_elektra-elektra-components_7932e9'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/span_Entrar con e-mail y contrasea'))

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/a_No tiene una cuenta Regstrese'))

WebUI.setText(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Recibir cdigo de acceso por e-mail_email'), 
    'sjagtap@kognivera.com')

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/span_Enviar'))

String currentPage = WebUI.getUrl()

int currentTab = WebUI.getWindowIndex()

WebDriver driver = DriverFactory.getWebDriver()

JavascriptExecutor js = ((driver) as JavascriptExecutor)

js.executeScript('window.open();')

WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl('outlook.com')

WebUI.click(findTestObject('Object Repository/Page_Outlook  free personal email and calen_71aa16/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 'sjagtap@kognivera.com')

WebUI.click(findTestObject('Next_Button_Outlook'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to Outlook/input_Enter password_passwd'), Password)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Sign in to Outlook/input_Forgot my password_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to Outlook/input_Forgot my password_idSIButton9'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Mail - Shubham Ganesh Jagtap - Outlook/span_Clave de acceso Hola, sjagtap. Necesit_796adb'))

OTP = WebUI.getText(findTestObject('Object Repository/Page_Mail - Shubham Ganesh Jagtap - Outlook/strong_559036'))

println(currentTab)

WebUI.switchToWindowIndex(currentTab)

WebUI.setText(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Ingrese el cdigo que enviamos a sjagt_b14537'), 
    OTP)

WebUI.setText(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Ingrese el cdigo que enviamos a sjagt_e4422d'), 
    Create_Password)

WebUI.setText(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/input_Mnimo 8 caracteres_vtex-styleguide-9-_572b5b'), 
    Create_Password)

WebUI.click(findTestObject('Object Repository/Page_Elektra, Tu Familia Vive Mejor/span_Crear'))

