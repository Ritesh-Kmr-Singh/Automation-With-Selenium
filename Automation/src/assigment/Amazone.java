package assigment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("running shoe for men",Keys.ENTER);
		driver.findElement(By.xpath("//button[@aria-label=\"12\"]")).click();
		 List<WebElement> productname = driver.findElements(By.xpath("//div[@class=\"sg-col-20-of-24 s-matching-dir sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16\"]"));
	     Thread.sleep(2000);
	     for(int i=0;i<productname.size();i++)
	    		 {
	    			 System.out.println(productname.get(i).getText());
	    		 }
	}

}
