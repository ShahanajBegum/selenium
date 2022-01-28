package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test6_Actions_Demo1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.className("email")).sendKeys("shashushaik97@gmail.com");
	    driver.findElement(By.className("password")).sendKeys("CIVIL@109");
	    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    
	    WebElement a=driver.findElement(By.linkText("Jewelry"));
	    Actions act=new Actions(driver);
	    act.moveToElement(a).click().build().perform();
	  
	    WebElement list=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	    list.click();
	    Select s3=new Select(list);
	     s3.selectByVisibleText("List");
	     
	     driver.findElement(By.xpath("(//input[contains(@value,'Add to cart')])[1]")).click();
	     Thread.sleep(1000);
	     
	     driver.findElement(By.xpath("(//input[contains(@data-productid,'71')])[1]")).click();
	    
	    
	}
}
