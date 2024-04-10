package com.javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;

public class DisableButtonSubmit {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");
		
		//driver.findElement(By.xpath("//button[text()='Submit']"));
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("")
		
}
}