package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsselected {
	public static void main(String[] args) throws InterruptedException {
		
     WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
     driver.get("http://127.0.0.1/login.do");
     Thread.sleep(2000);
      WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
      
     checkbox.click();
     
     if(checkbox.isSelected()) {
    	 System.out.println("checkbox is selected");
     }
     else 
     {
    	 checkbox.click();
     }
      
	}

}
