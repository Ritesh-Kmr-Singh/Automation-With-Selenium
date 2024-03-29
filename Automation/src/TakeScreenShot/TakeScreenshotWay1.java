package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshotWay1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Lord Ram image",Keys.ENTER);
		driver.findElement(By.linkText("Images")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshotpng/image.png");
		Files.copy(src, dest);
		
	
	}
}
