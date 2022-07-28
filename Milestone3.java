package com.mindtree.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Milestone3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/hovers']")).click();
		System.out.println("User1");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/checkboxes']")).click();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/inputs']")).click();
		driver.findElement(By.xpath("//*[@type=\"number\"]")).sendKeys("9876");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/dropdown']")).click();
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
		s.selectByVisibleText("Option 2");
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/upload']")).click();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/tables']")).click();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/key_presses']")).click();
		driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
		WebElement W=driver.findElement(By.xpath("//*[@class=\"example\"]"));
		  String Value=W.getText();
		  if(Value.equals(W))
		     {
		    	 System.out.println("False");
		     }
		  else
		  {
			  System.out.println("New window");
		  }
		  driver.get("http://the-internet.herokuapp.com/");
		  driver.findElement(By.xpath("//a[@href='/context_menu']")).click();
		  driver.findElement(By.xpath("//*[@id=\" hot-spot\"]")).click();
	}

}
