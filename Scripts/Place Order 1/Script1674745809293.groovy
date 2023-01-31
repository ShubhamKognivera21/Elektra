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

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.click(findTestObject('Object Repository/Page_Liverpool es parte de Mi vida/span_Iniciar sesin'))

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin  Liverpool/input_Correo electrnico_username'), 'sudha.addepalli6662@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin  Liverpool/input_Contrasea_password'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin  Liverpool/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool es parte de Mi vida/span_Categoras'))

WebUI.click(findTestObject('Object Repository/Page_Ropa tallas extra para hombre  Liverpo_7caadb/span_Hombre'))

WebUI.click(findTestObject('Object Repository/Page_Ropa para hombre  Liverpool.com.mx/li_BOTAS'))

WebUI.click(findTestObject('Object Repository/Page_Botas para hombre  Liverpool.com.mx/h5_Bota Caterpillar de piel para hombre'))

WebUI.click(findTestObject('Object Repository/Page_Bota Caterpillar de piel para hombre  _45b693/button_27 cm'))

WebUI.click(findTestObject('Object Repository/Page_Bota Caterpillar de piel para hombre  _45b693/button_Comprar ahora'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Liverpool Mxico/p_Bota Caterpillar de piel para hombre'), 
    0)

WebUI.delay(5)

String ActuaConfirmationUrl = WebUI.getUrl()

String expectedUrl = 'https://www.liverpool.com.mx/tienda/checkoutOrderConfirmation'

expectedUrl.equalsIgnoreCase(ActuaConfirmationUrl)

WebUI.delay(5)

WebUI.closeBrowser()

