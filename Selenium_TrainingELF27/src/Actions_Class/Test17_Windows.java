package Actions_Class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
        driver.manage().window().maximize();
	    String parent_window = driver.getWindowHandle();
	    System.out.println(parent_window);
	    
	    driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
	    
	    Set<String> child_windows = driver.getWindowHandles();
	    System.out.println(child_windows);
	    
	    for(String windows:child_windows) {
	    	driver.switchTo().window(windows);
	    	driver.close();
	    }
	     

	}

}
