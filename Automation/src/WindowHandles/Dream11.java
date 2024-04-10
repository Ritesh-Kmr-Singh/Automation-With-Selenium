package WindowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.dream11.com/");
	/**
		//switch the controller into frame by using index
		//driver.switchTo().frame(0);
		
		//switch the control into frame by using id or name attribute value
		//driver.switchTo().frame("send-sms-iframe");
		
	**/
		
		//switch the control into frame by using webElement 

		WebElement Frame1 = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));

		driver.switchTo().frame(Frame1);
		
		driver.findElement(By.id("regEmail")).sendKeys("7020976736");
	}

}
