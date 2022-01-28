package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        
        boolean register_link=driver.findElement(By.linkText("Register")).isDisplayed();
        System.out.println(register_link);
        
        WebElement sel= driver.findElement(By.id("pollanswers-1"));
        sel.click();
        boolean selec=sel.isSelected();
        System.out.println(selec);
        
        
       WebElement en=driver.findElement(By.className("ico-login"));
       boolean b=en.isEnabled();
       System.out.println(b);
       
       boolean be=driver.findElement(By.className("ico-login")).isEnabled();
       System.out.println(be);
     
	}
	}

