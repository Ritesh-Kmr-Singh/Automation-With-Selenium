package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathRelative {
	public static void main(String[] args) throws InterruptedException {
     // to launch the browser
		WebDriver driver = new ChromeDriver();

	// to maximize the window 
		driver.manage().window().maximize();
		
	// to launch web browser
	  driver.get("https://demowebshop.tricentis.com/");
		
	// thread 
		Thread.sleep(3000);
		
	// click on search store 
		driver.findElement(By.xpath("//input [ @ type = 'text']")).sendKeys("Fiction");
		
	// click on search button
		driver.findElement(By.xpath("//input [ @ type = 'submit']")).click();
		
	}

}
