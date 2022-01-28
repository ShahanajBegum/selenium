package OwnPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11_WithoutEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    
	    driver.get("https://demo.actitime.com/");
	    driver.manage().window().maximize();
	    WebElement e=driver.findElement(By.name("username"));
	    e.sendKeys("admin");
	    WebElement e1=driver.findElement(By.name("pwd"));
	    e1.sendKeys("manager");
	    e1.sendKeys(Keys.RETURN);
	    

	}

}
