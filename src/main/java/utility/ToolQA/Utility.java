package utility.ToolQA;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Utility extends Base {
	public static Xls_Reader reader=new Xls_Reader("C:\\eclipse\\ToolQA\\Documents\\PersonsAddress.xlsx");

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void windowhandle(WebElement ElementToClick) {
		sleep(3000);
		String parentWindow = driver.getWindowHandle();
		ElementToClick.click();
		sleep(5000);
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
		        
		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
	}
	

	
	public static void isImageBroken(WebElement image)
	{
	    if (image.getAttribute("naturalWidth").equals("0"))
	    {
	        System.out.println(image.getAttribute("outerHTML") + " is broken.");
	    }
	    else {
	    	System.out.println(image.getAttribute("outerHTML") + " is not broken.");
	    }
	}

	public static boolean getResponseCode(String urlString) {
        boolean isValid = false;
        try {
            URL u = new URL(urlString);
            HttpURLConnection h = (HttpURLConnection) u.openConnection();
            h.setRequestMethod("GET");
            h.connect();
            System.out.println(h.getResponseCode());
            if (h.getResponseCode() != 404 || h.getResponseCode() != 500) {
                isValid = true;
            }
        } catch (Exception e) {

        }
        return isValid;
    }
	
	public static void LinkVerification(WebElement Link) {
		
		boolean isValid = false;
		    
			String nextHref = Link.getAttribute("href");
		    isValid = getResponseCode(nextHref);
		    System.out.println("Is valid" + isValid);
		    if (isValid) {
		        System.out.println("Valid Link:" + nextHref);

		    }
		    else {
		        System.out.println("INVALID Link:" + nextHref);

		    }
	}
	
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		boolean flag = false;
	    File dir = new File(downloadPath);
	    File[] dir_contents = dir.listFiles();
	  	    
	    for (int i = 0; i < dir_contents.length; i++) {
	        if (dir_contents[i].getName().equals(fileName))
	            return flag=true;
	            }

	    return flag;
	}
	
	public void scrollToElement(WebElement element) throws InterruptedException 
	{
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
        
	}
	
	public void scrollToPixcel() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
}
