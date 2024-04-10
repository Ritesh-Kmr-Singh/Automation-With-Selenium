package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swag2 {
	public static void main(String[] args) throws InterruptedException {
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
	}

}
