package assigment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import TakeScreenShot.TakeScreenShotSingleWebElement;
import TakeScreenShot.TakeScreenshotWay1;

public class DemoBlaze {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("loginusername")).sendKeys("rks",Keys.ENTER);
		driver.findElement(By.id("loginpassword")).sendKeys("R123",Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("(//a[@href='prod.html?idp_=1'])[1]"));
		phone.click();
		
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
        driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
		Thread.sleep(2000);

		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		
		driver.findElement(By.id("cartur")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		driver.findElement(By.id("name")).sendKeys("ritesh",Keys.ENTER);
		driver.findElement(By.id("country")).sendKeys("india",Keys.ENTER);

		driver.findElement(By.id("city")).sendKeys("prayagraj",Keys.ENTER);
		driver.findElement(By.id("card")).sendKeys("987654123159",Keys.ENTER);
		driver.findElement(By.id("month")).sendKeys("April",Keys.ENTER);
		driver.findElement(By.id("year")).sendKeys("2024",Keys.ENTER);
		
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshotpng/Demoblaze.png");
		
		Files.copy(src, dest);
		

		
	}

}
