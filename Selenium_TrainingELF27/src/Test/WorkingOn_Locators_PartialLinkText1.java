package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_Locators_PartialLinkText1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Reg")).click();
        driver.findElement(By.id("FirstName")).sendKeys("D");
        driver.findElement(By.id("LastName")).sendKeys("Shahanaj");
        driver.close();
        
	}

}
