package Collebera1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6_Title_Alphabetical {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
    WebDriver  driver=new ChromeDriver();
    driver.get("https://naukri.com/");
    driver.manage().window().maximize();
    
   /* Set<String> allWindowId = driver.getWindowHandles();
	
	

	for(String id:allWindowId) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());*/
//	}
}
}
