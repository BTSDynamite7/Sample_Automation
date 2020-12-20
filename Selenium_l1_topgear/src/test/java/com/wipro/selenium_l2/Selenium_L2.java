package com.wipro.selenium_l2;

import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Selenium_L2 {
	static WebDriver dr;
	
	
	
/*	
	@Test
  public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 dr=new ChromeDriver();
		 dr.manage().window().maximize();
	     dr.get("https://book.spicejet.com");
	    Thread.sleep(1000);

	  WebElement date=dr.findElement(By.id("marketDate_1"));
	  String date1="30-05-2020";
	  datePicker(dr,date,date1);
	    
	  
	}
	  
	  public void datePicker(WebDriver dr,WebElement ele,String date) {
		  JavascriptExecutor js=((JavascriptExecutor) dr);
		  js.executeAsyncScript("arguments[0].setAttribute('value','"+date+"');",ele);
	}
	  
	  
	*/  
	
	

	
	
	  @Test
	  public void test2() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		  dr=new ChromeDriver();
		  dr.manage().window().maximize();
		  dr.get("https://yatra.com");
		 
		  Thread.sleep(1000);
		  
		  Actions actions = new Actions(dr);
		  WebElement target = dr.findElement(By.xpath("//*[@id='userLoginBlock']/a"));
		  actions.moveToElement(target).perform();
		/*
		  List<WebElement> list=dr.findElements(By.xpath("//div[@id='login_panel']/div/ul/li[2]/a"));
		int count=list.size();
		for(int i=0;i<count;i++){
			WebElement ele=list.get(i);
			String text=ele.getAttribute("innerHTML");
			if(text.equals("Sign Up"))
			{
				ele.click();
				break;
			}
		}
		*/
		  
		  dr.findElement(By.linkText("Sign Up")).click();
		  Thread.sleep(1000);
		  dr.findElement(By.xpath("//input[@id='login-input']")).sendKeys("111997kajalmuley@gmail.com");
		  
		  dr.findElement(By.xpath("//button[@id='login-continue-btn']")).click();
		  Thread.sleep(1000);
		  
		  dr.findElement(By.xpath("//input[@id='signup-mobile-number']")).sendKeys("1234567890");
		  
		  dr.findElement(By.xpath("//input[@id='signup-password']")).sendKeys("kajal@123");
		  
		  Select select=new Select(dr.findElement(By.xpath("//select[@id='signup-user-designation']")));
		  select.selectByValue("Ms.");
		  
		  dr.findElement(By.xpath("//input[@id='signup-user-first-name']")).sendKeys("kajal");
		  dr.findElement(By.xpath("//input[@id='signup-user-last-name']")).sendKeys("muley");
		  
		  dr.findElement(By.xpath("//input[@id='whatsAppNotif']")).click();
		  
		  dr.findElement(By.xpath("//button[@id='signup-form-continue-btn']")).click();
		  
		  System.out.println("Account creation defect so cant perform further operation");
		  
		}
		  
	
	

	/*
	@Test
	public void Test4(){
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		  dr=new ChromeDriver();
		  dr.get("https://hdfc.com");
		  dr.manage().window().maximize();
		  
		  dr.findElement(By.xpath("")).click();
		  dr.findElement(By.xpath("")).click();
		
		
		
		
	}
	
	*/
	
	
	
	
	
/*	
	@Test
	private void Test5() throws BiffException, IOException {
		
		//create RegistrationDetails.xls file add path of that file
		 File f=new File("C:\\selenium\\userdetails.xls");
		// workbook reference is created
		 Workbook w=Workbook.getWorkbook(f);
      //creating an instance to call specify sheet
      Sheet s=w.getSheet(0);
      
      
      int row=s.getRows();
      int col=s.getColumns();
      
       String array[]=new String[col];
      
		
			
		 // for loop to get each row of xls file
			for(int r=0;r<row;r++) {
				for(int c=0;c<col;c++) {
					 Cell c1=s.getCell(c, r);
		                
		                array[c]=c1.getContents();
		                System.out.print(array[c]+" ");
				}
				System.out.println();
			}

	}
	
	*/
	
	
	/*
	@Test
	public void test9() throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 dr=new ChromeDriver();
	  dr.get("https://www.hdfcbank.com/");
	  
	  dr.findElement(By.id("popupBoxClose")).click();
	  
	  WebElement element=dr.findElement(By.xpath("//a[contains(text(),'Select Product Type')]"));
	  ((JavascriptExecutor)dr).executeScript("arguments[0].click();", element);
	  dr.findElement(By.xpath("//li[@value='1']")).click();
		Thread.sleep(1000);
		
		
		
		WebElement element1=dr.findElement(By.xpath("//a[contains(text(),'Select Product')]"));
		  ((JavascriptExecutor)dr).executeScript("arguments[0].click();", element1);
		
		  
		  
		  
		  List<WebElement> list=dr.findElements(By.xpath("//ul[contains(@class,'dropdown2 dropdown-menu')]"));
			int count=list.size();
			for(int i=0;i<count;i++){
				WebElement ele=list.get(i);
				String text =ele.getText();
				if(text.equals("Credit Cards"))
				{
					ele.click();
					break;
				}
		  
			}
		 		
		
	}
	*/
	
	
	
	
	
	
	/*
	@Test
	public void test8(){
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		 dr=new ChromeDriver();
	  dr.get("https://www.google.com");
	  dr.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("random");
	   List<WebElement> list=dr.findElements(By.xpath("//ul[contains(@class,'erkvQe')]"));
			int count=list.size();
			for(int i=0;i<count;i++){
				WebElement ele=list.get(i);
				  System.out.println(ele.getText()) ;
			}
		  
	}
	
	
	*/
	
	
	
	
	
	/*
	  @Test
	  public void test10() throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
			 dr=new ChromeDriver();
		  dr.get("http://www.echoecho.com/htmlforms10.htm");
		
		  WebElement radio9=dr.findElement(By.xpath("//input[@name='radio1']"));
			 if(radio9.isSelected()){
				 System.out.println("radio button 3 is selected");
			 }
			 else{
				 System.out.println("radio button 3 is not selected");
			 }
			  
			 WebElement radio8=dr.findElement(By.xpath("//input[@name='group1']"));
			 if(radio8.isSelected()){
				 System.out.println("radio button 2 is selected");
			 }
			 else{
				 System.out.println("radio button 2 is not selected");
			 }
			 
			 WebElement radio7=dr.findElement(By.xpath("(//input[@name='group1'])[2]"));
			 if(radio7.isSelected()){
				 System.out.println("radio button 1 is selected");
			 }
			 else{
				 System.out.println("radio button 1 is not selected");
			 }
		  
		  
		  
		  WebElement radio1=dr.findElement(By.xpath("//input[@type='radio' and @name='group1' and @value='Milk']"));
		 if(radio1.isSelected()){
			 System.out.println("radio button milk is selected");
		 }
		 else{
			 System.out.println("radio button milk is not selected");
		 }
		  
		 Thread.sleep(1000); 
		 
		 WebElement radio2=dr.findElement(By.xpath("//input[@type='radio' and @name='group1' and @value='Butter']"));
		 if(radio2.isSelected()){
			 System.out.println("radio button Butter is selected");
		 }
		 else{
			 System.out.println("radio button Butter is not selected");
		 }
		 
		 
		 Thread.sleep(1000);
		 
		 WebElement radio3=dr.findElement(By.xpath("//input[@type='radio' and @name='group1' and @value='Cheese']"));
		 if(radio3.isSelected()){
			 System.out.println("radio button cheese is selected");
		 }
		 else{
			 System.out.println("radio button cheese is not selected");
		 }
		 
		 Thread.sleep(1000);
		 WebElement radio4=dr.findElement(By.xpath("//input[@type='radio' and @name='group2' and @value='Water']"));
		 if(radio4.isSelected()){
			 System.out.println("radio button water is selected");
		 }
		 else{
			 System.out.println("radio button water is not selected");
		 }
		 
		 Thread.sleep(1000);
		 WebElement radio5=dr.findElement(By.xpath("//input[@type='radio' and @name='group2' and @value='Beer']"));
		 if(radio5.isSelected()){
			 System.out.println("radio button Beer is selected");
		 }
		 else{
			 System.out.println("radio button Beer is not selected");
		 }
		 
		 Thread.sleep(1000);
		 WebElement radio6=dr.findElement(By.xpath("//input[@type='radio' and @name='group2' and @value='Wine']"));
		 if(radio6.isSelected()){
			 System.out.println("radio button Wine is selected");
		 }
		 else{
			 System.out.println("radio button Wine is not selected");
		 }
		 
	  }*/
	  
  
}
