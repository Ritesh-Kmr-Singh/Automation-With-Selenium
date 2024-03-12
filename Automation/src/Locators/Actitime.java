package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
	public static void main(String[] args) throws InterruptedException {
		
		// to launcht the browser
		WebDriver driver = new ChromeDriver();
		
		// to maximize the window 
		driver.manage().window().maximize();
		
		// to launch the web page 
		driver.get("http://127.0.0.1/login.do");
		
		// thread 
		Thread.sleep(2000);
		
		// to enter the username 
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(2000);

        
		//to enter the password
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("manager");
		
		//to enter the login
		driver.findElement(By.linkText("Login")).click();
		
		// to enter the users
		driver.findElement(By.linkText("Users")).click();				
		
		//thread is used for time 
		Thread.sleep(2000);
		
		//to enter the create user button 
		driver.findElement(By.xpath("//input[@value=\"Create New User\"]")).click();
		Thread.sleep(2000);

		
		//to enter the user name 
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Rite");
		
		//to enter the password 
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Ritesh@1234");
		
		//to enter the retype password
		driver.findElement(By.xpath("//input[@name=\"passwordTextRetype\"]")).sendKeys("Ritesh@1234");
		
		//to enter the first name 
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys(" kumar ");
		
		// to enter the last name
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("singh");
		Thread.sleep(2000);

		
		//to click on create user button
		driver.findElement(By.xpath("//input[@value=\"   Create User   \"]")).click();
		Thread.sleep(2000);

		
		
		//to click on logout 
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
	}

}
