package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
	public static void main(String[] args) throws InterruptedException {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize 
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://demowebshop.tricentis.com/");
		
		// thread
		Thread.sleep(3000);
		
		// click on the register
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[1]/a")).click();
		}

}
