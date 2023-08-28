package toolQA.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.ToolQA.WidgetsPage;
import utility.ToolQA.Utility;

public class WidgetsPageTest extends Utility {
	
	WidgetsPage wp;

	 
	@BeforeClass
	public void StartReport() throws IOException {
		initilization();
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./Reports/WidgetsPageTest.html");
		extend=new ExtentReports();
		extend.attachReporter(reports);
		wp=new WidgetsPage();
		logger1=extend.createTest("PracticeForm");
		}

	//@Test(priority=1)
	public void select_date() throws Exception {
		wp.selectDate();
	}
	
	@Test(priority=2)
	public void Slider_Bar_test() throws Exception {
		wp.slider();
	}
	
	
	@AfterClass
	public void EndReport() {
		CloseReport();
		driver.close();
		
	}
}
