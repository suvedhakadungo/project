package com.Mini_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import com.BaseClass.Base_Class;
import com.pom.Addtocart_Page;
import com.pom.Backorder_Page;
import com.pom.Confirm_Page;
import com.pom.Frame_Page;
import com.pom.Home_Page;
import com.pom.Image_Page;
import com.pom.Login_Page;
import com.pom.Myaccount_Page;
import com.pom.Paycheck_Page;
import com.pom.Proceed_Page1;
import com.pom.Proceed_Page2;
import com.pom.Proceed_Page3;
import com.pom.Proceed_page;
import com.pom.Terms_Page;
import com.sdp.Page_Object_Manager;

public class Test_Runner1 extends Base_Class {
	
	public static WebDriver driver=getBrowser("chrome");
public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	
	
	
	
	

public static void main(String[] args) throws InterruptedException, IOException  {
		

		
		url("http://automationpractice.com/index.php");

       clickOnElement(pom.getInstanceHP().getSignin());

	  inputvalueElement(pom.getInstanceLogin().getEmailbox(), "suvedha97@gmail.com");

	  inputvalueElement(pom.getInstanceLogin().getPasswordbox(),"selenium@1");

	 clickOnElement(pom.getInstanceLogin().getSigninbutton());

	clickOnElement(pom.getInstanceMP().getTshirt_btn());

	clickOnElement(pom.getInstanceip().getImage()); 
		
		driver.switchTo().frame(pom.getInstancefp().getFrame());
		
	clickOnElement(pom.getInstanceAp().getAddtocart());
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		clickOnElement(pom.getInstancePp().getAddtocart());
		Thread.sleep(3000);
		
		clickOnElement(pom.getInstancePro().getProceedto());
		Thread.sleep(5000);
		
	   clickOnElement(pom.getInstancePro2().getProceedto());
		Thread.sleep(5000);
		
		clickOnElement(pom.getInstancepro3().getCheckout());
		Thread.sleep(5000);
		
		clickOnElement(pom.getInstancetp().getTermscondition());
		Thread.sleep(5000);
		
		clickOnElement(pom.getInstancecp().getPaycheck());
		Thread.sleep(5000);
		
		clickOnElement(pom.getInstanceCp().getConfirmorder());
		Thread.sleep(5000);
		
	
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",pom.getInstanceBp().getBackorder());
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(5000);
        
		TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(" C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\image.png");
        FileUtils.copyFile(source, destination);
        
        
       
	}

}
