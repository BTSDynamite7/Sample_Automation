package com.wipro.selenium_l1_topgear;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestCase3 {
	static WebDriver dr;
	
  
  
  
  @Test
  public void testCase3() throws BiffException, IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 dr=new ChromeDriver();
	  dr.get("https://demo.opencart.com/");
	  dr.manage().window().maximize();
	  Thread.sleep(3000);
	//step2 click on MyAccount
      dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/account')]")).click();;
     //click on login
      Thread.sleep(1000);
      dr.findElement(By.linkText("Login")).click();
      
      //enter login details
    //create RegistrationDetails.xls file add path of that file
		 File f=new File("C:\\Users\\DELL\\workspace\\Selenium_l1_topgear\\Resources\\login.xls");
		// workbook reference is created
		 Workbook w=Workbook.getWorkbook(f);
         //creating an instance to call specify sheet
         Sheet s1=w.getSheet(0);
         
         int rows=s1.getRows();
         int col=s1.getColumns();
         String array[]=new String[col];
         for(int r=0;r<rows;r++){
        	 for(int c=0;c<col;c++){
        		 Cell c1=s1.getCell(c,r);
        	     array[c]=c1.getContents();
        	 }
        	 
        	 dr.findElement(By.id("input-email")).sendKeys(array[0]);
        	 dr.findElement(By.id("input-password")).sendKeys(array[1]);
        	 dr.findElement(By.xpath("//input[@type='submit']")).click();
        
         }
         
         
         //enter keyword in search box
         dr.findElement(By.xpath("//*[@id='search']/input")).sendKeys("apple");
         //press enter
         WebElement textbox = dr.findElement(By.xpath("//*[@id='search']/input"));
         textbox.sendKeys(Keys.ENTER);
         
         Thread.sleep(1000);
         //click on monitors unser component 
       dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=product/category&path=25')]")).click();
       dr.findElement(By.linkText("Monitors (2)")).click();
         Thread.sleep(1000);
       //is monitors page displayed
       boolean visible=dr.findElement(By.xpath("//div[@id='product-category']/div/div")).isDisplayed();
       System.out.println("is monitors page displayed"+visible);
      
       Thread.sleep(1000);
       //click on phones & pdas
       dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=product/category&path=24')]")).click();
        Thread.sleep(1000);
       //sort by high to low
       Select select=new Select(dr.findElement(By.id("input-sort")));
       select.selectByVisibleText("Price (High > Low)");
       
       
       
       
       Thread.sleep(1000);
       //add to cart three items
        dr.findElement(By.xpath("//div[@id='content']/div[2]/div/div/div[2]/div[2]/button[3]/i")).click();
        Thread.sleep(1000);
        dr.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[3]")).click();
        Thread.sleep(1000);
        dr.findElement(By.xpath("//div[@id='content']/div[2]/div[3]/div/div[2]/div[2]/button[3]/i")).click();
        Thread.sleep(1000);
       
       
       
       //product compare
        WebDriverWait wait = new WebDriverWait(dr, 15);
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=product/compare')]")));

       dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=product/compare')]")).click();
       
       Thread.sleep(1000);
       //click on first element in table
       dr.findElement(By.linkText("Palm Treo Pro")).click();
       Thread.sleep(1000);
       //fifth feature
       String fiftehfeature=dr.findElement(By.xpath("//*[@id='tab-description']/ul/li[5]")).getText();
       System.out.println("feature "+fiftehfeature);
       
       //click on add to cart 
       dr.findElement(By.id("button-cart")).click();
       
       Thread.sleep(1000);
       //click on shopping cart on ribbon msg
       dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=checkout/cart')]")).click();
       
       //click on checkout
       dr.findElement(By.linkText("Checkout")).click();
       
       
       //checkout option is not workinh se performing logout
       //this is a defect
       
       
       
   
         //logout
    	 Thread.sleep(1000);
         dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/account')]")).click();
         Thread.sleep(1000);
         dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/logout')]")).click();
         Thread.sleep(1000);
       
         
         
  }
  
  
  
  
  
  
  
}
