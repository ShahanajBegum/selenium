package Collebera1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8_ClosechildOnly {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://naukri.com/");
	    driver.manage().window().maximize();
	    String pwh=driver.getWindowHandle();
	    Set<String> allwh=driver.getWindowHandles();
	    for(String s:allwh) {
	    	driver.switchTo().window(s);
	    if(pwh.equals(s)) {
	    	}
	    else
	    driver.close();
	    }

	}

}
