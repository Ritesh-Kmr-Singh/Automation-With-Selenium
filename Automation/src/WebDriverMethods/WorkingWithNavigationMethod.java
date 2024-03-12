package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigationMethod
{
public static void main(String[] args) throws InterruptedException
{
	// to lauch the browser
	WebDriver driver = new ChromeDriver();
	
	// to maximize
	driver.manage().window().maximize();
	
	// to launch the browser
	driver.get("https://www.zomato.com/india");
	
	// to navigate the application
	driver.navigate().to("https://www.swiggy.com/");
	
	// to go back
	Thread.sleep(5000);
	driver.navigate().back();
	
	// to go forward
	Thread.sleep(2000);
	driver.navigate().forward();
	
	// to go to refresh
	Thread.sleep(5000);
	driver.navigate().refresh();
	
	// to close the browser
	driver.quit();
	
}
}
