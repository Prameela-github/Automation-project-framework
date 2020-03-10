package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Loginpage {
WebDriver driver;

By MyAccount=By.xpath("//*[@id=\"menu-item-50\"]/a");
By Email=By.id("username");
By Password=By.id("password");
By Login=By.name("login");


public void url() {
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJars\\Chrome driver\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}
public void loginpage() {
	driver.get("http://practice.automationtesting.in/");

}
public void MyAccount() {
	driver.findElement(MyAccount).click();
}
public void logindetails() {
	/*WebElement link=driver.findElement(MyAccount);
	Actions action =new Actions(driver);
	action.click().perform();*/
	driver.findElement(Email).sendKeys("koradabhanu@gmail.com");
	driver.findElement(Password).sendKeys("koradabhanu");
}
public void submit() {
	driver.findElement(Login).click();
}
	
public void close()
{
	 driver.close();
}
	
}
