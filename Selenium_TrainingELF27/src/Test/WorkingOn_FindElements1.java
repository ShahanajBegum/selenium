package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_FindElements1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("shashushaik97@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("CIVIL@109");
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();
        driver.findElement(By.partialLinkText("Book")).click();
      
        List<WebElement>a1=driver.findElements(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
        int i=1;
        for(WebElement a2:a1) {
        	if(i<3) {
        	a2.click();
        	Thread.sleep(1000);
        	i++;
        	}	
        	}
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='cart-label']")).click();
        Thread.sleep(1000);
        List<WebElement> a3=driver.findElements(By.xpath("//input[@name='removefromcart']"));
        int z=1;
        for(WebElement a4:a3) {
        	if(z<=1) {
        		a4.click();
        		Thread.sleep(1000);
        		z++;
        	}
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='updatecart']")).click();
        }
	}


