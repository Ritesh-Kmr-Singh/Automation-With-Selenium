package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiocinema {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jiocinema.com/");
		
		driver.findElement(By.xpath("//div[@aria-label='RCB vs KKR']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Change Language']")).click();
	}

}
