package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15_Actions_Alert_DELETE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/delete_customer.php");
	     driver.manage().window().maximize();
	     driver.findElement(By.name("cusid")).sendKeys("960349");
	     driver.findElement(By.xpath("//input[@name='submit']")).click();
	     Alert a= driver.switchTo().alert();
	     a.accept();
	     a.accept();
	     driver.close();
	    
	   

	}

}
