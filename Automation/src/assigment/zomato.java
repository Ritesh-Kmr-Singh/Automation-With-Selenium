package assigment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato 
{
public static void main(String[] args)
{
 // to launch the browser
	WebDriver driver = new ChromeDriver();
	
// to maximise the browser
	driver.manage().window().maximize();

// to open web application
	driver.get("https://www.zomato.com/pune/collections");
	
// to fetch the title 
	String title = driver.getTitle();
	System.out.println(title);
	
// to fetch the current url
	String url = driver.getCurrentUrl();
	System.out.println(url);
}
}
