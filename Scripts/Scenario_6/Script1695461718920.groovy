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

WebUI.callTestCase(findTestCase('Authorization_Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Add Data Todo')

Mobile.tap(findTestObject('AddTodo/android.widget.TextView - Add Todo_Input'), 0)

Mobile.setText(findTestObject('Object Repository/AddTodo/android.widget.EditText - Input Name'), 'MST QA Test', 0)

Mobile.comment('Select Date')

Mobile.tap(findTestObject('Object Repository/AddTodo/android.view.IconCalendar'), 0)

Mobile.tap(findTestObject('AddTodo/android.widget.SelectDate1'), 0)

Mobile.tap(findTestObject('AddTodo/android.widget.TextView - OK'), 0)

Mobile.comment('Select dropdown list type')

Mobile.tap(findTestObject('Object Repository/AddTodo/android.widget.EditText - Choose Type'), 0)

Mobile.tap(findTestObject('AddTodo/android.widget.TextView - Other'), 0)

Mobile.comment('Input Description')

Mobile.setText(findTestObject('Object Repository/AddTodo/android.widget.EditText - Input Description'), 'Testing', 0)

Mobile.comment('Upload Pic')

Mobile.switchToNative()

Mobile.tap(findTestObject('AddTodo/android.widget.iconUploadPic'), 0)

Mobile.tap(findTestObject('Object Repository/AddTodo/android.view.SelectPic'), 0)

Mobile.tap(findTestObject('AddTodo/android.widget.TextView - button_AddTodo_ok'), 0)

Mobile.comment('Data should be successfully added')

Mobile.comment('View Data Group')

Mobile.tap(findTestObject('AddTodo/android.widget.ViewDataDetail'), 0)

Mobile.verifyElementText(findTestObject('AddTodo/android.widget.GetNameDetail'), 'MST QA Test')

Mobile.verifyElementText(findTestObject('AddTodo/android.widget.GetDateDetail'), '01 September 2023')

Mobile.verifyElementText(findTestObject('AddTodo/android.widget.GetTypeDetail'), 'Other', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('AddTodo/android.widget.GetDescDetail'), 'Testing')

Mobile.comment('Verify data Passed')

Mobile.closeApplication()

