package Iframes_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test5_Syn_ExplictWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='ico-register']")))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='gender-female']")))).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("SHAHANAJ");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("SHAHANAJ123@GMAIL.COM");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("SHAHANAJ");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("SHAHANAJ");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='register-button']")))).click();
		
		
		

	}

}
