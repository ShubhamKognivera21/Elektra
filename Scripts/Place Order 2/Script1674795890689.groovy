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

WebUI.setText(findTestObject('Object Repository/Page_Iniciar sesin  Liverpool/input_Correo electrnico_username'), findTestData(
        'Login Liverpool').getValue(findTestData('Login Liverpool'), findTestData('Login Liverpool')))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Iniciar sesin  Liverpool/input_Contrasea_password'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

WebUI.click(findTestObject('Object Repository/Page_Iniciar sesin  Liverpool/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool es parte de Mi vida/span_Categoras'))

WebUI.click(findTestObject('Object Repository/Page_Liverpool es parte de Mi vida/span_Hombre'))

WebUI.click(findTestObject('Object Repository/Page_Ropa para hombre  Liverpool.com.mx/a_Ropa'))

WebUI.click(findTestObject('Object Repository/Page_Ropa de moda para hombre  Liverpool.com.mx/a_Ver todo'))

WebUI.click(findTestObject('Object Repository/Page_Ropa de moda para hombre  Liverpool.com.mx/h5_Playera tipo polo Aropostale para hombre'))

WebUI.delay(5)

/*
 * String Size = 'XCH'
 * 
 * String CheckSize = WebUI.check(findTestObject('Object Repository/Page_Playera
 * tipo polo Aropostale para homb_ccfaf0/button_XCH'))
 * 
 * WebUI.acceptAlert()
 */
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Size1_PDP'), 0) == true) {
    WebUI.click(findTestObject('Object Repository/Size1_PDP'))

    WebUI.click(findTestObject('Object Repository/Page_Playera tipo polo Aropostale para homb_ccfaf0/button_Agregar a mi bolsa'))

    WebUI.click(findTestObject('Object Repository/Page_Playera tipo polo Aropostale para homb_ccfaf0/button_Comprar'))

    WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/label_Cambiar'))

    WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Efectivo y Transferencias'))

    WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Continuar'))

    WebUI.click(findTestObject('Object Repository/Page_Liverpool Mxico/button_Finalizar compra'))

    WebUI.delay(5)

    String ActuaConfirmationUrl = WebUI.getUrl()

    String expectedUrl = 'https://www.liverpool.com.mx/tienda/checkoutOrderConfirmation'

    expectedUrl.equalsIgnoreCase(ActuaConfirmationUrl)

    WebUI.delay(5)
} 
else {
    System.out.printIn('Condition is Not True')
}

WebUI.delay(5)

WebUI.closeBrowser()

