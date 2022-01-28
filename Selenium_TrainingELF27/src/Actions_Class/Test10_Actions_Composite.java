package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_Actions_Composite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    
	    Actions action = new Actions(driver);
	    
	    action.sendKeys(driver.findElement(By.xpath("//input[@id='small-searchterms']")),"computer").perform();
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    Thread.sleep(2000);
	    driver.close();
	}
}

	


