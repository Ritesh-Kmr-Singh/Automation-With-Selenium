package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{
	public static void main(String[] args) throws InterruptedException
	{
		// to launch the browser 
		WebDriver driver = new ChromeDriver();
		
		// to maximize window
		driver.manage().window().maximize();
		
		// to launch the web application 
		driver.get("https://www.instagram.com/");
		
		// thread 
		Thread.sleep(3000);
		
		// click on forgot password 
		driver.findElement(By.linkText("Forgotten your password?")).click();
		}

}
