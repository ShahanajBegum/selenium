package OwnPrepare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_DeleteAllCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.myntra.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    System.out.println("all cookies are deleted");
        driver.close();
        }

}
