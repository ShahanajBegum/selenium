package OwnPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8_WithoutClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement e=driver.findElement(By.name("email"));
        e.sendKeys("Ameer");
        e.sendKeys(Keys.CONTROL,"a");
        Thread.sleep(1000);
        e.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        e.sendKeys("Shahanaj");
        Thread.sleep(1000);
        e.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        driver.close();

	}

}
