package com.wipro.selenium_l1_topgear;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Testcase1 {
  @Test
  public void testCase1() throws InterruptedException, BiffException, IOException {
      WebDriver dr;
	  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	  dr=new ChromeDriver();
	  
	  dr.get("https://demo.opencart.com/");
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
	         
	         //logout
	    	 Thread.sleep(1000);
	         dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/account')]")).click();
	         Thread.sleep(1000);
	         dr.findElement(By.xpath("//a[contains(@href,'https://demo.opencart.com/index.php?route=account/logout')]")).click();
	         Thread.sleep(1000);
	  
	  
	  
  }
}
