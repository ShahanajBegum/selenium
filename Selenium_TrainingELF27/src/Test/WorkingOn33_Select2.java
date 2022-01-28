package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOn33_Select2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/ameer/Downloads/demo.html");
	    driver.manage().window().maximize();
	    WebElement dp1=driver.findElement(By.xpath("//select[contains(@id,'standard_cars')]"));
	   
	    Select s1=new Select(dp1);
	    s1.selectByIndex(1);
	    Thread.sleep(1000);
	    s1.deselectByIndex(1);
	    //Thread.sleep(1000);


	}

}
