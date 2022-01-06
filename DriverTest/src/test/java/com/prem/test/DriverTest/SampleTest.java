package com.prem.test.DriverTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SampleTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("Hello");
	
	String driver_path ="";
	if (File.separator.contains("\\"))
			driver_path ="C:\\Users\\PPALUGUL\\ChromerDrivers\\v96\\win_v96\\chromedriver.exe";
	else 
		driver_path ="/usr/bin/chromedriver";
	System.setProperty("webdriver.chrome.driver", driver_path);
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	Thread.sleep(4000);
	System.out.println("Title of the Page is : "+title);
	driver.findElement(By.name("q")).sendKeys("I am Prem . Find me");
	System.out.println("Entered Text : I am Prem . Find me ");
	//Thread.sleep(2000);
	/*driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	System.out.println("Clicked on Search button");*/
	Thread.sleep(2000);
	
	driver.close();
	System.out.println("Closed the driver");
	driver.quit();
	System.out.println("Quit the driver..\n..Test Completed");
	
	}

}
