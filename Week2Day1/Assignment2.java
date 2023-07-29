package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		//To Maximize the window size
		driver.manage().window().maximize();
		//Enter UserName and Password Using Id Locator
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 Thread.sleep(2000);
		 //Click on Login Button using Class Locator
		 driver.findElement(By.className("decorativeSubmit")).click();
		 Thread.sleep(2000);
		 //Click on CRM/SFA Link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 //Click on Leads Button
		 driver.findElement(By.linkText("Leads")).click();
		 Thread.sleep(2000);
		 //Click on Create Lead
		 driver.findElement(By.linkText("Create Lead")).click();
		 Thread.sleep(2000);
		 //Enter CompanyName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		  //Enter FirstName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("KARTHIK");
		  //Enter LastName Field Using id Locator
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PRITHIVIRAJ");
		  //Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KP");
		  //Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		  //Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.name("description")).sendKeys("Working on Assignment 1");
		  //Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthikprithiviraj94@gmail.com");
		 Thread.sleep(2000);
		 //Click on Create Button
		 driver.findElement(By.name("submitButton")).click();
		 Thread.sleep(2000);
		 //Click on edit button
		 driver.findElement(By.linkText("Edit")).click();
		 Thread.sleep(2000);
        //Clear the Description Field using .clear()
		 driver.findElement(By.name("description")).clear();
		 Thread.sleep(2000);
		 //Fill ImportantNote Field with Any text
		 driver.findElement(By.name("importantNote")).sendKeys("Entering Assignment on Important Note");
		 Thread.sleep(2000);
		//Click on Update Button
		 driver.findElement(By.name("submitButton")).click();
		 Thread.sleep(2000);
		//Get the Title of Resulting Page. refer the video  using driver.getTitle()
		 String title = driver.getTitle();
	        System.out.println(title);

	}

}
