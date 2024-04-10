package assigment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class SwagLab {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
		driver.findElement(By.xpath("//div[@class='shopping_cart_container']")).click();
		
		WebElement name = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		System.out.println(name.getText());
		
		WebElement price = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']"));
		String actualPrice=price.getText();
		System.out.println(actualPrice);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ritesh kumar",Keys.ENTER);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("singh",Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("211003",Keys.ENTER);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		
		
		String expectedPrice="$29.99";
		
		if(expectedPrice==actualPrice)
		{
			System.out.println("The price is correct");
		}
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='finish']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshotpng/swaglab.png");
		
		Files.copy(src, dest);
		
		driver.findElement(By.xpath("//button[@name='back-to-products']")).click();
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		driver.findElement(By.linkText("Logout")).click();

	}

}
