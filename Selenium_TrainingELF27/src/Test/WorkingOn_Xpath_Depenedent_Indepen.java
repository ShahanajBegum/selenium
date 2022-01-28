package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_Xpath_Depenedent_Indepen{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    WebElement s=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	    s.sendKeys("laptop");
	    Thread.sleep(1000);
	    s.click();
	    
	    driver.findElement(By.xpath("//div[contains(text(),'MSI Creator Z16')]/../..//div[text()='₹2,13,414']"));
        driver.close();
	}

}
