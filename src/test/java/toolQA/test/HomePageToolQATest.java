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


import pages.ToolQA.HomePageToolQA;
import utility.ToolQA.Base;
import utility.ToolQA.CustomListener;
@Listeners(CustomListener.class)

public class HomePageToolQATest extends Base {
	HomePageToolQA HM;
	@BeforeSuite
	public void setup() throws IOException {
		initilization();
	}
	 
	@BeforeClass
	public void StartReport() throws IOException {
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./Reports/HomePageToolQATest.html");
		extend=new ExtentReports();
		extend.attachReporter(reports);
		HM=new HomePageToolQA();
	}
	
	
	@Test(priority=1)
	public void HomePageValidation() {
		HM.ValidateHomePage();
	}
	
	@Test(priority=2)
	public void Test1() {
		System.out.println("test is passed");
	}
	
	@AfterClass
	public void EndReport() {
		CloseReport();
		
	}
	@AfterSuite
	public void teardown() {
		
		driver.close();
	}

}
