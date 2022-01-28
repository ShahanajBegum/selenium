package OwnPrepare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_BackForwardRefresh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.myntra.com/");
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.close();

	}

}
