package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2_Action_DemoWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computer')]"));
        Actions act=new Actions(driver);
        act.moveToElement(computer).build().perform();
        WebElement desktop=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
        act.moveToElement(desktop).click().build().perform();
        Thread.sleep(1000);
        WebElement electronics=driver.findElement(By.xpath("//a[contains(text(),'Electronics')]"));
        act.moveToElement(electronics).build().perform();
        Thread.sleep(1000);
        WebElement camera=driver.findElement(By.xpath("//a[contains(text(),'Camera, photo')]"));
        act.moveToElement(camera).click().perform();
        Thread.sleep(1000);
        driver.close();
        
        
        

	}

}
