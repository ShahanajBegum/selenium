package Collebera1;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_3rdWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://naukri.com/");
	    driver.manage().window().maximize();
	   
	    String WindowId = driver.getWindowHandle();

		Set<String> AllWindowId = driver.getWindowHandles();
		AllWindowId.remove(WindowId);

		String expectedUrl="https://company.naukri.com/popups/techmahindra/13dec2021/index.html";
		
		for(String Window:AllWindowId) {
			driver.switchTo().window(Window);
			String actualUrl=driver.getCurrentUrl();
		    if(expectedUrl.equals(actualUrl)) 
		    System.out.println("true");
		    
		    else 
		    System.out.println("false");
		    
		    
			//	driver.close();
		}
		driver.close();
	}
}