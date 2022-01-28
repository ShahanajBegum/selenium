package test_Address;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST2_SignIn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://a.testaddressbook.com/sign_up");
	    driver.manage().window().maximize();
	    //no need =driver.findElement(By.xpath("//a[@id='sign-in']")).click();
	    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("shashushaik97@gmail.com");
	    driver.findElement(By.xpath("//input[@name='user[password]']")).sendKeys("CIVIL@109");
	  //  driver.findElement(By.cssSelector("input[name='commit']")).click();
	    driver.findElement(By.xpath("//a[@id='sign-in']")).click();
	    //driver.close();
	}

}
