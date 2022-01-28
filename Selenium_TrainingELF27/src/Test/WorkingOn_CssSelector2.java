package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_CssSelector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("a.ico-login")).click(); 
	    driver.findElement(By.cssSelector("input#Email")).sendKeys("shashushaik97@gmail.com");
	    driver.findElement(By.cssSelector("input.password")).sendKeys("CIVIL@109");
	    driver.findElement(By.cssSelector("input.button-1.login-button")).click();
	    driver.close();
	}

}
