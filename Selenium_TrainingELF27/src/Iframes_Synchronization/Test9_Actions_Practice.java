package Iframes_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9_Actions_Practice {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 WebElement e=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(e).click().perform();
		 e.sendKeys("Ind");
		 driver.findElement(By.xpath("(//div[text()='India'])[1]")).click();
		
		 
		 
		 driver.close();

	}

}
