package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_REGISTER_002 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("FirstName")).sendKeys("@!#$%^&*");
	driver.findElement(By.name("register-button")).click();
	}
}
