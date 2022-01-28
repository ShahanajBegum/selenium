package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SHOPPING_CART_020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.className("ico-login")).click();
	    driver.findElement(By.name("Email")).sendKeys("shashushaik97@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("CIVIL@109");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();
        driver.findElement(By.cssSelector("input.button-2.product-box-add-to-cart-button")).click();
        driver.findElement(By.className("ico-cart")).click();
        driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("shahanaj");
        driver.findElement(By.name("giftcard_2.RecipientEmail")).sendKeys("shashushaik97@gmail.com");
        driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
        WebElement a=driver.findElement(By.id("addtocart_2_EnteredQuantity"));
        a.clear();
        a.sendKeys("1");
        
        driver.findElement(By.id("add-to-cart-button-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Shopping cart")).click();
        driver.findElement(By.name("removefromcart")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("updatecart")).click();
        driver.findElement(By.linkText("Shopping cart")).click();
        driver.close();
        
	}

}
