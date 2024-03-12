package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoshop {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys("ritesh7300161360@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("Ritesh@123");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/ancestor::div[@data-productid=\"13\"]/descendant::input[@value=\"Add to cart\"]")).click();
		
		driver.findElement(By.xpath("(//a[@class=\"ico-cart\"])[1]")).click();
		
	
		
		WebElement country = driver.findElement(By.id("CountryId"));
		
		Select s = new Select(country);
		
		s.selectByVisibleText("India");
		
		driver.findElement(By.id("termsofservice")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.xpath("//div[@id=\"billing-buttons-container\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]")).click();
		Thread.sleep(2000);

		
	driver.findElement(By.xpath("//input[@onclick=\"ConfirmOrder.save()\"]")).click();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//input[@class=\"button-2 order-completed-continue-button\"]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Click here for order details.']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.linkText("PDF Invoice")).click();
	
	driver.findElement(By.linkText("Log out")).click();
	
   driver.close();
		
		
	}

}
