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

import pages.ToolQA.FormsPage;
import utility.ToolQA.CustomListener;
import utility.ToolQA.Utility;
@Listeners(CustomListener.class)

public class FormsPageTest extends Utility {
	FormsPage fp;
	
	
//	@BeforeSuite
	public void setup() throws IOException {
		initilization();
	}
	 
	@BeforeClass
	public void StartReport() throws IOException {
		initilization();
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./Reports/FormsPageTest.html");
		extend=new ExtentReports();
		extend.attachReporter(reports);
		fp=new FormsPage();
		logger1=extend.createTest("PracticeForm");
		
		}

	@Test(priority=1)
	public void PracticeFormValidation() throws Exception {
		fp.PracticeForm();
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