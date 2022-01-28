package Collebera1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11_SpecificTitleWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://naukri.com/");
	    driver.manage().window().maximize();
	    

	}

}
