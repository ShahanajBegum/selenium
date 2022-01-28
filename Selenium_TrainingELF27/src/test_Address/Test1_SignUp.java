package test_Address;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://a.testaddressbook.com/sign_up");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("shashushaik97@gmail.com");
	    driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("CIVIL@109");
	    driver.findElement(By.cssSelector("input[name='commit']")).click();
	    
	    
	    
	    //driver.close();
	    
	    

	}

}
