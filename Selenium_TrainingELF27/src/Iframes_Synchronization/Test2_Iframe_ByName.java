package Iframes_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_Iframe_ByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ameer/Downloads/iframe.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//a[@id='gavtab-3']")).click();

	}

}
