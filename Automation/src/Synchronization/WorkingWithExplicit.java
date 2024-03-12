package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicit {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']")).click();
		
		driver.findElement(By.xpath("//input[@id=\"Check Delivery\"]")).sendKeys("123456");
		WebElement checkbutton = driver.findElement(By.id("check"));
		
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		Wait.until(ExpectedConditions.elementToBeClickable(checkbutton));
		checkbutton.click();

	}
}
