package assigment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findcoordinate {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		 WebElement privacy = driver.findElement(By.linkText("Privacy"));
		 
		 Rectangle rect = privacy.getRect();
		 
		 int x = rect.getX();
		 System.out.println(x);
		 
		 int y = rect.getY();
		 System.out.println(y);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy("+ x +"," + y +");");
		 
		 
		 
		
		
	}

}
