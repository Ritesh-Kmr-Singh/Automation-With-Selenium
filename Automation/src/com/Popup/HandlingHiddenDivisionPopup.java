package com.Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']")).sendKeys("ritesh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='w-full m-2 h-10 px-4 border-2 border-stone-600 rounded-md']")).sendKeys("ritesh@gmai.com",Keys.ENTER);
	}

}
