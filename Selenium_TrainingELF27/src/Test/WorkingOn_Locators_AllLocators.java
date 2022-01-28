package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_Locators_AllLocators {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys("D");
        driver.findElement(By.name("LastName")).sendKeys("Shahanaj");
        driver.findElement(By.id("Email")).sendKeys("shashushaik97@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("CIVIL@109");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("CIVIL@109");
        driver.findElement(By.id("register-button")).click();
        
        
	}

}










