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

Mobile.startApplication('C:\\Users\\Admin\\Katalon Studio\\testSample\\androidapp\\ColorNote Notepad.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout (1)'), 0)

Mobile.sendKeys(findTestObject('Object Repository/android.widget.EditText (2)'), 'Ghi chú món ăn')

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), 'Pizza: Một món ăn Ý được làm từ bột mì nướng, sốt cà chua và phủ đầy các loại topping như thịt, rau, phô mai.', 
    0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Ghi ch mn n'), 0)

