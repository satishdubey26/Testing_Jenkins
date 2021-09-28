package toolQA.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.ToolQA.AlertsFrameAndWindows;
import utility.ToolQA.CustomListener;
import utility.ToolQA.Utility;
@Listeners(CustomListener.class)

public class AlertsFrameWindowsPageTest extends Utility {
	AlertsFrameAndWindows aw;
//	@BeforeSuite
	public void setup() throws IOException {
		initilization();
	}
	 
	@BeforeClass
	public void StartReport() throws IOException {
		initilization();
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./Reports/AlertsFrameWindowsPageTest.html");
		extend=new ExtentReports();
		extend.attachReporter(reports);
		aw=new AlertsFrameAndWindows();
		logger13=extend.createTest("BrowserWindows");
		logger14=extend.createTest("Alerts");
		logger15=extend.createTest("Frames");
		logger16=extend.createTest("NestedFrames");
		logger17=extend.createTest("ModalDailog");
		}

	@Test(priority=1)
	public void BrowserWindowsValidation() throws Exception {
		aw.BrowserWindows();
	}
	
	@Test(priority=2)
	public void AlertsValidationa() throws Exception {
		aw.Alerts();
	}
	
	@Test(priority=3)
	public void FramesValidation() throws Exception {
		aw.Frames();
	}
	
	@Test(priority=4)
	public void NestedFramesValidation() throws Exception {
		aw.NestedFrames();
	}
	
	@Test(priority=5)
	public void ModalDialogValidation() throws Exception {
		aw.ModalDailog();
	}
	
	@AfterClass
	public void EndReport() {
		CloseReport();
		driver.close();
		
	}
//	@AfterSuite
	public void teardown() {
		driver.close();
	}
}
