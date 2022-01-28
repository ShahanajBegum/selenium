package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOn37_Actions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    Actions a=new Actions(driver);
	    a.moveToElement(driver.findElement(By.linkText("COMPUTERS")));
	    Thread.sleep(1000);
	    a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"))).click().build().perform();
	   
	    Thread.sleep(2000);
	
	    driver.close();

	}

}
