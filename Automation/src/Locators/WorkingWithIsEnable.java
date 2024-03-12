package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnable {
	public static void main(String[] args)  {
		
     WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      //synchronizatoin is used to wait we use it only 1 time in whole program 
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
      driver.get("https://demoapps.qspiders.com/ui?scenario=1");
     
     driver.findElement(By.xpath("//li[text()='Disabled']")).click();
      WebElement loginbutton=driver.findElement(By.id("name"));
      
      System.out.println(loginbutton.isEnabled());
      
	}

}
