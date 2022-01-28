package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_CssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        WebElement w=driver.findElement(By.className("ico-register"));
        String st1=w.getCssValue("color");
        System.out.println(st1);
        
        String st2=driver.findElement(By.partialLinkText("Book")).getCssValue("display");
        System.out.println(st2);
        
        String st3=driver.findElement(By.partialLinkText("Com")).getCssValue("font-size");
        System.out.println(st3);
        
        String st4=driver.findElement(By.partialLinkText("Sho")).getCssValue("background-color");
        System.out.println(st4);
        
        String st5=driver.findElement(By.className("cart-label")).getCssValue("border-bottom-color");
        System.out.println(st5);
        
        
        
	}

}
