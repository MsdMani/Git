package org.test;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGWork {
	 static WebDriver driver;
	@BeforeClass
public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MMPL 1\\eclipse-workspace\\SeleniumDay\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

}
@AfterClass
public static void afterclasss() {
	driver.quit();

}
@BeforeMethod
public static void beforemethod() {
	Date date= new Date();
	System.out.println(date);
	}
@AfterMethod
public static void aftermethod() {
	Date date =new Date();
	System.out.println(date);
}
@Test
public static void test() throws InterruptedException {
	WebElement txtname = driver.findElement(By.id("username"));
	txtname.sendKeys("hello");
	Thread.sleep(9000);
	WebElement txtpass = driver.findElement(By.id("password"));
    txtpass.sendKeys("vinithpanda");
    Thread.sleep(2000);
    WebElement btnlogin = driver.findElement(By.name("login"));
    btnlogin.click();
}
		
	}


