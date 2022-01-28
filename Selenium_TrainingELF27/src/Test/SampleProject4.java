package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleProject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
      driver.get("http://demowebshop.tricentis.com/");
     // driver.findElement(By.tagName("a"));
     driver.findElement(By.className("ico-register")).click();
	}

}
