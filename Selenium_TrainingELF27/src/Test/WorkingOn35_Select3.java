package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOn35_Select3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("BOOKS")).click();
	   
	     WebElement dp1=driver.findElement(By.xpath("//select[contains(@id,'products-orderby')]"));
	    Select s1=new Select(dp1);
	    s1.selectByIndex(1);
	    Thread.sleep(1000);
	    
	    WebElement dp2=driver.findElement(By.xpath("//select[contains(@id,'products-orderby')]"));
	    Select s2=new Select(dp2);
	    Thread.sleep(1000);
	    s2.selectByIndex(2);
	    
	    WebElement dp3=driver.findElement(By.xpath("//select[contains(@id,'products-orderby')]"));
	    Select s3=new Select(dp3);
	    Thread.sleep(1000);
	    s3.selectByIndex(3);
	    
	    WebElement dp4=driver.findElement(By.xpath("//select[contains(@id,'products-orderby')]"));
	    Select s4=new Select(dp4);
	    Thread.sleep(1000);
	    s4.selectByIndex(4);
	    
	    WebElement dp5=driver.findElement(By.xpath("//select[contains(@id,'products-orderby')]"));
	    Select s5=new Select(dp5);
	    Thread.sleep(1000);
	    s5.selectByIndex(5);
	    
	


	}

}
