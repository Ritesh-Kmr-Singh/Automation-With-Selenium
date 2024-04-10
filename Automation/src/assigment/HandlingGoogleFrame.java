package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingGoogleFrame {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();

		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@role='presentation'])[2]"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.linkText("Maps")).click();
		
		driver.findElement(By.name("q")).sendKeys("prayagraj U.P",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Directions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='gstl_50 sbib_a']")).sendKeys("Pune Maharastra",Keys.ENTER);
	}

}
