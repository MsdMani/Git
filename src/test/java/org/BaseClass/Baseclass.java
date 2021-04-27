package org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
 public static WebDriver driver;
 public void getDriver() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
 }
 public void launchUrl(String data) {
	 driver.get(data);
 }
 
 public void getsize(WebElement element) {
	 element.getSize();
	 
 }
 
 
 
}
