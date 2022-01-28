package testNg_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest2_DemoShop {
	@Test
	public void LaunchTest() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com//");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computers");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.close();
}
}
