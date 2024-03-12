package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//INPUT[contains(@class,'desktop-searchBar')]")).sendKeys("pant",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> productname= driver.findElements(By.xpath("//DIV[contains(@class,'search-searchProductsContainer row-base')]"));
		
		for(WebElement name:productname)
		{
			System.out.println(name.getText());
		}
			
	}

}
