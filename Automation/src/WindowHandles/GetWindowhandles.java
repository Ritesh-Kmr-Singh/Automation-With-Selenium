package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowhandles {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("WaterBottle",Keys.ENTER);
		 
		  driver.findElement(By.xpath("//img[@alt='iVBOX BOOSTER Hot & Cold Double-Wall Vacuum Thermos Flask Water 1000 ml Flask']")).click();
	      
		  String ParentWindowId = driver.getWindowHandle();
		  System.out.println("ParentWindowId");
		  
		  Set<String> allId = driver.getWindowHandles();
		  
		  for(String id:allId)
		  {
			  driver.switchTo().window(id);
			  
			 if(driver.getTitle().contains("iVBOX BOOSTER Hot & Cold Double-Wall Vacuum Thermos Flask Water 1000 ml "))
			 {
				 break;
			 }
		  }
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		  
		  driver.switchTo().window(ParentWindowId);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//span[text()='Cart']")).click();
		  
		  
		  
	}

}
