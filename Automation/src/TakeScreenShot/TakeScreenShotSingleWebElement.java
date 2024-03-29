package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotSingleWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Lord Ram",Keys.ENTER);
		
		driver.findElement(By.linkText("Images")).click();
		
		Thread.sleep(2000);
		
		WebElement LordRam = driver.findElement(By.xpath("//img[@id='dimg_27']"));
		
		Thread.sleep(5000);
		
		File src = LordRam.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshotpng/LordRam.png");
		
		Files.copy(src,dest);
	}

}
