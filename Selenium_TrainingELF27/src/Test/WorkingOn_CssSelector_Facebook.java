package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingOn_CssSelector_Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/reg/");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).sendKeys("shahanaj");
	    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("D");
	    driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("shashushaik97@gmail.com");
	    driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']")).sendKeys("shashushaik97@gmail.com");
	    driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("ameer1234");

	    

	   
	    driver.findElement(By.cssSelector("select#day")).sendKeys("22");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("select#month")).sendKeys("aug");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("select#year")).sendKeys("1999");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[type='radio']")).click();

	   
	    
	    
	   

	}

}
