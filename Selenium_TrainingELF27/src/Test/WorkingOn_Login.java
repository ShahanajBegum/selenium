package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        WebElement w=driver.findElement(By.className("ico-login"));
        boolean s=w.isDisplayed();
        System.out.println(s);
        w.click();
        driver.findElement(By.name("Email")).sendKeys("shashushaik97@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("CIVIL@109");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();
       // b.click();
        driver.findElement(By.id("small-searchterms")).sendKeys("Books");
        driver.findElement(By.cssSelector("input.button-1.search-box-button")).click();
      
        
	}

}
