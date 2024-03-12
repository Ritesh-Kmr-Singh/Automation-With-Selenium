package Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmFlight {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://paytm.com/");
		
	
		// CLICK on flight tickets
		driver.findElement(By.xpath("//div[2][@class=\"_2EGQY\"]")).click();
		
		// from 
		driver.findElement(By.className("_3xDDz")).click();
		driver.findElement(By.className("_3i2Wp")).click();
		driver.findElement(By.className("_1X2Sn")).sendKeys("PNQ");
		
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		
		// to 
		
		driver.findElement(By.id("to")).click();
		driver.findElement(By.className("_3i2Wp")).click();
        driver.findElement(By.className("_1X2Sn")).sendKeys("AYJ");
        driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();

        
        //date
        
        driver.findElement(By.id("departureDate")).click();
        driver.findElement(By.xpath("(//div[text()='11'])[2]")).click();
        
        
        //click on search flight 
        driver.findElement(By.id("flightSearch")).click();
        
        
          //to fetch single flight ticket price
        WebElement flightprice = driver.findElement(By.xpath("(//button[text()='Book Flight']/ancestor::div[@class='_5Cbbf']/descendant::div[@class='_2MkSl'])[1]"));
        String flight = flightprice.getText();
        WebElement flightname = driver.findElement(By.xpath("(//button[text()='Book Flight']/ancestor::div[@class='_5Cbbf']/descendant::span[@class='_2cP56'])[1]"));
        String flightsearch1 = flightname.getText();
        System.out.println(flightsearch1 + "  ticket price is ==  " +  flight);
        
      
        
        //to fetch all flight detail
        
        // List<WebElement> flightprice= driver.findElements(By.className("_1O_uQ"));
         
         //with the help of for loop we can fetch the multiple flight detail
         //for(int i=0;i<flightprice.size();i++)
         //{
        	//System.out.println(flightprice.get(i).getText());
        	//System.out.println("====================================");
         //}
	}
}

