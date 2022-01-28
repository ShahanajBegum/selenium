package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_BILLING_023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("shashushaik97@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("CIVIL@109");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("computer");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
        driver.findElement(By.cssSelector("input[name='giftcardcouponcode']")).sendKeys("yeshfg");
        driver.close();

	}

}
