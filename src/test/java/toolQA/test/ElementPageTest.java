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

import pages.ToolQA.ElementPage;
import utility.ToolQA.Base;
import utility.ToolQA.CustomListener;
import utility.ToolQA.Utility;
@Listeners(CustomListener.class)
public class ElementPageTest extends Utility {
	ElementPage ep;
	
//	@BeforeSuite
	public void setup() throws IOException {
		initilization();
	}
	 
	@BeforeClass
	public void StartReport() throws IOException {
		initilization();
		ExtentHtmlReporter reports=new ExtentHtmlReporter("./Reports/ElementPageTest.html");
		extend=new ExtentReports();
		extend.attachReporter(reports);
		ep=new ElementPage();
		logger2=extend.createTest("TextBox");
		logger3=extend.createTest("CheckBox");
		logger4=extend.createTest("RadioButton");
		logger5=extend.createTest("WebTables");
		logger6=extend.createTest("WebTablesSearchAndEdit");
		logger7=extend.createTest("Button");
		logger8=extend.createTest("Links");
		logger9=extend.createTest("BrokenLinksAndImages");
		logger10=extend.createTest("Download");
		logger11=extend.createTest("UploadFile");
		logger12=extend.createTest("DynamicProperties");



		}
	
	@Test(priority=1)
	public void TextBoxValidation() throws InterruptedException {
		ep.TextBox();
	}
	
	@Test(priority=2)
	public void CheckBoxValidation() throws InterruptedException {
		ep.CheckBox();
	}
	
	@Test(priority=3)
	public void RadioButtonValidation() {
		ep.RadioButton();
	}
	
	@Test(priority=4)
	public void WebTablesValidation() {
		ep.WebTables();
		ep.WebTablesSearchAndEdit();
	}
		
	@Test(priority=5)
	public void ButtonValidation() throws InterruptedException {
		ep.Button();
	}
	
	@Test(priority=6)
	public void LinkValidation() throws InterruptedException {
		ep.Links();
	}
	
	@Test(priority=7)
	public void BrokenLinksAndImageVerification() {
		ep.BrokenLinksAndImages();
	}
	
	@Test(priority=8)
	public void UploadAndDownloadValidation() throws InterruptedException {
		ep.Download();
		ep.UploadFile();
	}
	
	@Test(priority=9)
	public void DynamicPropertiesValidation() throws Exception {
		ep.DynamicProperties();
	}
	
	@AfterClass
	public void EndReport() {
		CloseReport();
		driver.close();
		
	}
	//@AfterSuite
	public void teardown() {
		
		driver.close();
	}
	
}
