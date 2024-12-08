package com.stc.Test21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

public WebDriver driver=null;
public String fName="fname";
public String lName="lname";
public String QA="//a[@Name='QA']";

	POMSearch  (WebDriver driver)
	{
	this.driver=driver;
	}

	public WebElement getF()
	{
		WebElement ee=null;
		ee=driver.findElement(By.id(fName));
		return ee;
	}

	public WebElement getL()
	{
		WebElement ee=null;
		ee=driver.findElement(By.id(lName));
		return ee;
	}
	
	public WebElement getQA()
	{
		WebElement ee=null;
		ee=driver.findElement(By.xpath(QA));
		return ee;
	}
	
	public void SendDataF(String aa)
	{
		try
		{
			getF().sendKeys(aa);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void SendDataL(String aa)
	{
		try
		{
			getL().sendKeys(aa);
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void ClickQA()
	{
		try
		{
getQA().click();
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
