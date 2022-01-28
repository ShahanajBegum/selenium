package Iframes_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_Iframe_Bydefaultcontent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ameer/Downloads/iframe.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='frame1']")));
		
		driver.findElement(By.xpath("//a[@class='allow']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='gavtab-3']")).click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Google']")).click();

	}

}
