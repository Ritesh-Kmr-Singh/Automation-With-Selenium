package assigment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoWithHandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		String ParentwindowID = driver.getWindowHandle();
		System.out.println(ParentwindowID);
		
		driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();

		Thread.sleep(2000);
		
		Set<String> Allwindows = driver.getWindowHandles();
		System.out.println(Allwindows);

				
			for(String id:Allwindows)
			{
				driver.switchTo().window(id);
				if(driver.getTitle().contains("Zomato (@zomato) • Instagram photos and videos") || driver.getTitle().contains("Best Restaurants in India - Zomato"))
				{
					continue;
				}
				driver.close();
			}
	}

}
