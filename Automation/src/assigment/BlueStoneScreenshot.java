package assigment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStoneScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	
    WebDriver driver  = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.get("https://www.bluestone.com/");
    driver.findElement(By.xpath("//span[text() ='Allow']")).click();
    
    WebElement coins = driver.findElement(By.xpath("//a[text()='Gold Coins ']"));
    Actions act = new Actions(driver);
    act.moveToElement(coins).perform();
    
    driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']")).click();
    
    WebElement coin2 = driver.findElement(By.xpath("//h1[text()=' 2 Gram 24 KT Gold Coins ']"));
    
    Thread.sleep(2000);
    File src = coin2.getScreenshotAs(OutputType.FILE);
    File dest = new File("./Screenshotpng/coins.png");
    Files.copy(src, dest);
    
    WebElement subscribe = driver.findElement(By.xpath("//input[@placeholder='Enter email for our newsletter']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(false)",subscribe);
    
    js.executeScript("document.getElementById('newsletter_subscriber').value='ritesh@gmail.com';");
    driver.findElement(By.xpath("//input[@value='SUBSCRIBE']")).click();
}
}
