package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SHOPPING_CART_015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		driver.manage().window().maximize();
		 driver.findElement(By.className("ico-login")).click();
		 driver.findElement(By.id("Email")).sendKeys("shashushaik97@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("CIVIL@109");
		 driver.findElement(By.cssSelector("input.button-1.login-button")).click();
		
		 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		 driver.findElement(By.id("products-viewmode")).sendKeys("Grid");
		 
    }
	}


