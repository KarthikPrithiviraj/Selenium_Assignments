package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		//to store
		 driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		 Thread.sleep(2000);
		 driver.findElement(By.id("Login")).click();
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 Thread.sleep(2000);
		 driver.findElement(By.className("uiImage")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.className("profile-link-label logout uiOutputURL")).click();
		 Thread.sleep(2000);
		 
		 
		 //driver.close();

}
}