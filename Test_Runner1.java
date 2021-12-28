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

public class Test_Runner1 extends Base_Class {
	
	public static WebDriver driver=getBrowser("chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Login_Page login = new Login_Page(driver);
	public static Myaccount_Page MP = new Myaccount_Page(driver);
	public static Image_Page ip = new Image_Page(driver);
	public static Frame_Page fp = new Frame_Page(driver);
	public static Addtocart_Page Ap = new Addtocart_Page(driver);
	public static Proceed_page Pp= new Proceed_page(driver);
	public static Proceed_Page1 Pro = new Proceed_Page1(driver);
	public static Proceed_Page2 Pro2 = new Proceed_Page2(driver);
	public static Proceed_Page3 pro3 = new Proceed_Page3(driver);
	public static Terms_Page tp = new Terms_Page(driver);
	public static Paycheck_Page cp = new Paycheck_Page(driver);
	public static Confirm_Page Cp = new Confirm_Page(driver);
	public static Backorder_Page Bp = new Backorder_Page(driver);
	
	
	
	
	

public static void main(String[] args) throws InterruptedException, IOException  {
		

		
		url("http://automationpractice.com/index.php");

		//WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		clickOnElement(hp.getSignin());

		//WebElement emailbox = driver.findElement(By.id("email"));
		
		
		inputvalueElement(login.getEmailbox(), "suvedha97@gmail.com");

		//WebElement passwordbox = driver.findElement(By.id("passwd"));
		inputvalueElement(login.getPasswordbox(),"selenium@1");

		//WebElement signinbutton = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(login.getSigninbutton());

		//WebElement tshirtbutton = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		
	    clickOnElement(MP.getTshirt_btn());

		//WebElement image = driver.findElement(By.xpath("//img[@itemprop='image']"));
	   
		clickOnElement(ip.getImage()); 
		
		//WebElement sf = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		
		driver.switchTo().frame(fp.getFrame());
		
		//WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		
		clickOnElement(Ap.getAddtocart());
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
		clickOnElement(Pp.getAddtocart());
		Thread.sleep(3000);
		
		//WebElement proceedto = driver.findElement(By.xpath("//span[text( )='Proceed to checkout']"));
		
		clickOnElement(Pro.getProceedto());
		Thread.sleep(5000);
		
		//WebElement proceedtocheck = driver.findElement(By.xpath("//span[text( )='Proceed to checkout']"));
		
		clickOnElement(Pro2.getProceedto());
		Thread.sleep(5000);
		
		//WebElement checkout = driver.findElement(By.name("cgv"));
		
		clickOnElement(pro3.getCheckout());
		Thread.sleep(5000);
		
		//WebElement termsofservice = driver.findElement(By.name("processCarrier"));
		
		clickOnElement(tp.getTermscondition());
		Thread.sleep(5000);
		
		//WebElement paybycheck = driver.findElement(By.xpath("//a[@class='cheque']"));
		
		
		clickOnElement(cp.getPaycheck());
		Thread.sleep(5000);
		
		//WebElement confirmingorder = driver.findElement(By.xpath("//span[text( )='I confirm my order']"));
		
		clickOnElement(Cp.getConfirmorder());
		Thread.sleep(5000);
		
		//WebElement backorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Bp.getBackorder());
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(5000);
        
		TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(" C:\\Users\\User\\eclipse-workspace\\Selenium\\Screenshot\\image.png");
        FileUtils.copyFile(source, destination);
        
        
       
	}

}
