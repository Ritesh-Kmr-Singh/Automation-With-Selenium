package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNewWindow {

public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://www.flipkart.com/");
	 
	 driver.findElement(By.name("q")).sendKeys("WaterBottle",Keys.ENTER);
	 
	  driver.findElement(By.xpath("//img[@alt='iVBOX BOOSTER Hot & Cold Double-Wall Vacuum Thermos Flask Water 1000 ml Flask']")).click();
      
}

}
