package com.Mini_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Runner {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("suvedha97@gmail.com");

		WebElement passwordbox = driver.findElement(By.id("passwd"));
		passwordbox.sendKeys("selenium@1");

		WebElement signinbutton = driver.findElement(By.id("SubmitLogin"));
		signinbutton.click();

		WebElement tshirtbutton = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
	    tshirtbutton.click();

		WebElement image = driver.findElement(By.xpath("//img[@itemprop='image']"));
		image.click(); 
		
		WebElement sf = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(sf);
		
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='exclusive']"));
		addtocart.click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed.click();
		Thread.sleep(3000);
		
		WebElement proceedto = driver.findElement(By.xpath("//span[text( )='Proceed to checkout']"));
		proceedto.click();
		Thread.sleep(5000);
		
		WebElement proceedtocheck = driver.findElement(By.xpath("//span[text( )='Proceed to checkout']"));
		proceedtocheck.click();
		Thread.sleep(5000);
		
		WebElement checkout = driver.findElement(By.name("cgv"));
		checkout.click();
		Thread.sleep(5000);
		
		WebElement termsofservice = driver.findElement(By.name("processCarrier"));
		termsofservice.click();
		Thread.sleep(5000);
		
		WebElement paybycheck = driver.findElement(By.xpath("//a[@class='cheque']"));
		paybycheck.click();
		Thread.sleep(5000);
		
		WebElement confirmingorder = driver.findElement(By.xpath("//span[text( )='I confirm my order']"));
		confirmingorder.click();
		Thread.sleep(5000);
		
		WebElement backorder = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",backorder);
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(5000);
        
		TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File(" C:\\Users\\User\\eclipse-workspace\\Mini_Project\\screenshots\\image.png");
        FileUtils.copyFile(source, destination);
        
        
       
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


