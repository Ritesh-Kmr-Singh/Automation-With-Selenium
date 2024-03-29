package com.javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		WebElement jamshedpur = driver.findElement(By.xpath("//h5[text()='Jamshedpur Restaurants']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//  if we use (true) then it will show in the top of the web page 
		//js.executeScript("arguments[0].scrollIntoView(true)", jamshedpur);
		
		//		//  if we use (false) then it will show in the top of the web page 
		js.executeScript("arguments[0].scrollIntoView(false)", jamshedpur);

	}

}
