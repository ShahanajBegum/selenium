package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_BILLING_021 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.className("ico-login")).click();
	    driver.findElement(By.name("Email")).sendKeys("shashushaik97@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("CIVIL@109");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();
        driver.findElement(By.id("small-searchterms")).sendKeys("jewelry");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
        Thread.sleep(1000);
     
        driver.findElement(By.id("add-to-cart-button-74")).click();
        driver.findElement(By.linkText("Shopping cart")).click();

	}

}
