package test_Address;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Dresses for girls");
	    driver.findElement(By.xpath("//button[contains(@class,'L0Z3Pu')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Clothing and Accessories')]")).click();
	    driver.close();
	}

}
