package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_REGISTER_002 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.className("ico-register"))).click().perform();
	act.moveToElement(driver.findElement(By.xpath("//input[@id='FirstName']"))).click().sendKeys("@#$$#&*").perform();		
	act.moveToElement(driver.findElement(By.id("register-button"))).click().perform();
	driver.close();
	}


}
