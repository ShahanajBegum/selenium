package Collebera1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9_CurrentIdFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://facebook.com/");
	    driver.manage().window().maximize();
	    
	    Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);

	}

}
