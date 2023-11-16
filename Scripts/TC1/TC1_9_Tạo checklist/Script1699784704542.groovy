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

Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton (17)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Checklist (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (10)'), 'Checklist món ăn', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add Item (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (11)'), 'Cơm tấm', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (4)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Add Item (2)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (12)'), 'Cơm sườn', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK (5)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.TextView - Checklist mn n (2)'), 0)

