package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Search_java {
	WebDriver driver;
	By Search=By.id("s");
	public void url() {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	public void loginpage() {
		driver.get("http://practice.automationtesting.in/my-account/");

	}
	
	public void typeinsearch() {
		
		driver.findElement(Search).sendKeys("Selenium Ruby");
	
	}
	public void clicking() {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}
	 public void close()
	 {
		 driver.close();
	 }



}
