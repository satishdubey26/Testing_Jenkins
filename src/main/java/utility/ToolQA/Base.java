package utility.ToolQA;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports extend;
	public static ExtentHtmlReporter reports;
	public static ExtentTest logger1,logger2,logger3,logger4,logger5,logger6,logger7,logger8,logger9,logger10,logger11,logger12,logger13,logger14,logger15,logger16,logger17;
	
	public Base() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public static void initilization() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(getObject("url"));
		
		
	}
	
	public static String getObject(String Data) throws IOException {
		prop=new Properties();
		InputStream input= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\utility\\ToolQA\\config.properties");
		prop.load(input);
		String data=prop.getProperty(Data);		
		return data;	
	}
	
	public static String Screenshot(String ImgName) throws IOException
	{
		
		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String Destination = System.getProperty("user.dir")+"/Screenshot/"+ImgName+".png";
		File FinalDestination = new File(Destination);
		FileUtils.copyFile(SrcFile, FinalDestination);
		return Destination;
		
	}
	public void ExtendReportPass(String TestName, String GetName, Throwable throwable) throws IOException {
		
		ExtentTest logger1 = extend.createTest(TestName);
		
		logger1.log(Status.PASS, " Test Case " +GetName+"  is passed");
		
		extend.flush();
	
	}
	
	public void ExtendReportFail(String TestName, String GetName, String throwable) throws IOException {
		ExtentTest logger = extend.createTest(TestName);
		logger.log(Status.FAIL, " Test Case Failed is " +GetName);
		logger.log(Status.FAIL, " Test Case Failed is " +throwable);
		logger.addScreenCaptureFromPath("C:\\eclipse\\ToolQA\\Screenshot\\"+TestName+".png");
		extend.flush();
	
	}
	

	public void CloseReport() {
		extend.flush();
		extend.close();
	}
	


}
