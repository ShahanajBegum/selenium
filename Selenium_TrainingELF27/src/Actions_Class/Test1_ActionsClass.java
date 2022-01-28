package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
       WebElement men_link= driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
       Actions a1=new Actions(driver);
       a1.moveToElement(men_link).build().perform();
       Thread.sleep(1000);
       WebElement casual_shirts=driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
      a1.moveToElement(casual_shirts).click().perform();
       
	}

}
