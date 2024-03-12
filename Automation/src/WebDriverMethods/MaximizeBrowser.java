package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser 
{
public static void main(String[] args)
{
 // to launch the browser
	WebDriver driver = new ChromeDriver();
	
// to maximise the browser
	driver.manage().window().maximize();

// to open web application
	driver.get("https://www.amazon.in/");
	
// to fetch the current url
	String url = driver.getCurrentUrl();
	if (url.equals("https://www.amazon.in/"))
	{
	 System.out.println("test case pass");	
	}
	else
	{
		System.out.println("test case fail");	
	}
}
}
