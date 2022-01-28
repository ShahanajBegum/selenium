package OwnPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_Cut {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
    WebDriver  driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    WebElement e=driver.findElement(By.name("email"));
    e.sendKeys("Ameer");
    e.sendKeys(Keys.CONTROL,"a");
    e.sendKeys(Keys.CONTROL,"x");
    WebElement e1=driver.findElement(By.name("pass"));
    e1.sendKeys(Keys.CONTROL,"v");
   // driver.close();
    
    

}

}



