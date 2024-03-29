package com.javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteScriptLeftRight {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//moving towards the right side
		
		for(int i = 0;i <2;i++)
		{
			js.executeScript("window.scrollBy(2000,0);");
		}
		
		Thread.sleep(2000);
		
		// moving towards the left side 
		
		for(int i = 0;i <2;i++)
		{
		js.executeScript("window.scrollBy(-2000,0);");
		}
	}

}
