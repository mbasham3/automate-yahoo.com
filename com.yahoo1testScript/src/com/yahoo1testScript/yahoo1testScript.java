package com.yahoo1testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yahoo1testScript {

	
	@Test 
	public void credentials() 
	{
		WebDriver driver = new ChromeDriver();  // initiate web browser   

		driver.manage().window().maximize();	 // maximize screen
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);  
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login-username")).sendKeys("mail@yahoo.com"); // add your Email ID 
		driver.findElement(By.id("login-signin")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("login-passwd")).sendKeys("password"); // Add your password 
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("header-mail-button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("document.getElementsByClassName(\"H_A hd_n p_a L_0 R_0\")[2].firstElementChild.click();");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div[3]/div[1]/div/label/span")).click();
		driver.findElement(By.linkText("Sign out")).click();
	  //  driver.close();
	}	
}
