package Collebera1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5_TitlesAllWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://naukri.com/");
        driver.manage().window().maximize();
     
        
        Set<String> AllWindowId = driver.getWindowHandles();

     		for(String id:AllWindowId) {
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());

		}
	}

}
