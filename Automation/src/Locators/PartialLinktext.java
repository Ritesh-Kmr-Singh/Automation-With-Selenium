package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {
	public static void main(String[] args) throws InterruptedException {
		
		// to launch the browser 
		WebDriver driver = new ChromeDriver();
		
		//to maximize window
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("https://www.instagram.com/");
		
		// using thread
		Thread.sleep(3000);
		
		// click on forgotten password 
		driver.findElement(By.partialLinkText("Forgotten ")).click();
	}

}
