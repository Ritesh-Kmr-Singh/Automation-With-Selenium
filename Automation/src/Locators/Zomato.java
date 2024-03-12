package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/pune");
		
		driver.findElement(By.xpath("//p[text()='Blinkit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class=\"SearchBarContainer__Input-sc-hl8pft-3 irVxjq\"]")).sendKeys("sugar",Keys.ENTER);
	    Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"AddToCart__UpdatedButtonContainer-sc-17ig0e3-0 lmopxc\"])[1]")).click();
	    WebElement product = driver.findElement(By.xpath("//div[@class=\"AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ\"]"));
		for(int i=0;i<3;i++)
	    {
	    	product.click();
	    }
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"CartButton__Button-sc-1fuy2nj-5 joEvaa\"]")).click();
	}

}
