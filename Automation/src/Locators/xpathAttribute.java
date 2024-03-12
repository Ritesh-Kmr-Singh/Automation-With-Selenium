package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAttribute {
	public static void main(String[] args) throws InterruptedException {
		
		//to launch the Browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window 
		driver.manage().window().maximize();
		
		// to launch the webpage 
		
		driver.get("https://www.google.com/");
		
		//thread
		Thread.sleep(2000);
		
		// to search the object
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		
		driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();
		
	}

}
