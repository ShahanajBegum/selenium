package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11_Actions_Composite1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	    Actions action = new Actions(driver);
	    WebElement elect_link = driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
	    action.moveToElement(elect_link).build().perform();
	    
	    driver.findElement(By.xpath("//a[contains(text(),'Camera, photo')]")).click();
	    
	    Thread.sleep(1000);
	    driver.close();
	}
}
