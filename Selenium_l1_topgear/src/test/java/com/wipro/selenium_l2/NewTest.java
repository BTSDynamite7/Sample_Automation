package com.wipro.selenium_l2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  WebDriver dr;
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  dr=new ChromeDriver();
	  
	  dr.get("https://demo.opencart.com/");
		//step2 click on MyAccount
	    
	  dr.findElement(By.cssSelector("div.product-layout:nth-child(3) button:nth-child(1)")).click();
	  
	  
	  /*
	  
	  dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/account')]")).click();;
	     //click on login
	      Thread.sleep(1000);
         //dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/login')]")).click();
         //dr.findElement(By.xpath("//div[@class='list-group']/a")).click();
      
         //Thread.sleep(1000);
         dr.findElement(By.cssSelector("a[href$='account/login']")).click();
         Thread.sleep(1000);
         
         
       dr.findElement(By.cssSelector("a.list-group-item:nth-child(1)")).click();
         
       Thread.sleep(1000);
         String label=dr.findElement(By.cssSelector("label.control-label")).getText();
         System.out.println(label);
         dr.findElement(By.cssSelector("input#input-email")).sendKeys("kajal1@gmail.com");         
         dr.findElement(By.id("input-password")).sendKeys("kajal123");
         
         dr.findElement(By.cssSelector("input[value=Login]")).click();
         
         dr.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
         Thread.sleep(1000);
         dr.findElement(By.cssSelector("li:nth-child(5)")).click();
         
         
         
         //dr.findElement(By.xpath("//*[@id='form-currency']/div/button")).click();
         //dr.findElement(By.cssSelector("button[name=EUR]")).click();
         
         
         
         
         //dr.findElement(By.cssSelector("a[href$='account/edit']")).click();
         //dr.findElement(By.cssSelector("a[href$='account/address']")).click();
         //dr.findElement(By.cssSelector("a[href$='account/newsletter']")).click();
         
        
        // dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/logout')]")).click();
       //  dr.findElement(By.cssSelector("a:cotains(logout)]")).click();
         
         
         
       /*  dr.findElement(By.id("input-email")).sendKeys("kajal1@gmail.com");
         Thread.sleep(1000);
    	 dr.findElement(By.id("input-password")).sendKeys("kajal123");
    	 dr.findElement(By.xpath("//input[@type='submit']")).click();
    	 
    	 
    	 //currency buttons xpath
    	 dr.findElement(By.xpath("//strong[contains(text(),'$')]")).click();
    	
    	 dr.findElement(By.xpath("//button[contains(text(),'€ Euro')]")).click();
    	 
    	 */
  }
}
