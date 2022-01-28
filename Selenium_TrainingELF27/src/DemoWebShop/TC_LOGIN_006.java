package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_LOGIN_006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		driver.manage().window().maximize();
		 driver.findElement(By.className("ico-login")).click();
		 driver.findElement(By.id("Email")).sendKeys("Shashushaik97@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("123456");
		 driver.findElement(By.cssSelector("input.button-1.login-button")).click();

	}

}
