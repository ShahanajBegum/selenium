package Iframes_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_Actions_Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.get("https://www.myntra.com/");
		 driver.manage().window().maximize();
		WebElement e= driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).click().perform();
	    e.sendKeys("puma");
	    driver.findElement(By.xpath("//li[text()='Puma Men Shoes']")).click();
	    driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
		
	}

}
