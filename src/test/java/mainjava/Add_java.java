package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_java {

		WebDriver driver;
		 By selenium=By.xpath("//*[@id=\"post-160\"]/div/div/h2/a");
		 By SeleniumRuby=By.xpath("//*[@id=\"product-160\"]/div[2]/form/button");
		 public void url() {
				System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome driver\\chromedriver.exe");
				driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			}
			public void loginpage() {
				driver.get("http://practice.automationtesting.in/?s=Selenium+Ruby");

			}
		 public void clickproduct() {
			 driver.findElement(selenium).click();
		 }
		 public void clickaddbasket() {
			 driver.findElement(SeleniumRuby).click();
		 }
		 public void close()
		 {
			 driver.close();
		 }
}
