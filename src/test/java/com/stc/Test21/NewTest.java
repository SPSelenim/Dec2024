package com.stc.Test21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
 
	public WebDriver driver=null;
	@BeforeSuite
	public void tearUp()
	{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
driver.manage().window().maximize();		
	}
	
	
@Test
  public void f() {
System.out.println("Test");
try
{
	POMSearch ss=new POMSearch(driver);
	ss.SendDataF("hm1");
	ss.SendDataL("dd1");
	ss.ClickQA();
}
catch(Exception e)
{
	System.out.println( e.getMessage());
}
}

@AfterSuite
public void tearDown()
{
	driver.quit();	
}

}
