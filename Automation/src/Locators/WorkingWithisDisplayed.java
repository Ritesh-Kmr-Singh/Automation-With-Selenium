package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithisDisplayed {
	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("http://127.0.0.1/login.do");
          WebElement text = driver.findElement(By.xpath("//a[text()='Actimind Inc.']"));
          
          System.out.println(text.isDisplayed());
	}

}
