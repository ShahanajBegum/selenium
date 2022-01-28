package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        
        WebElement register_link=driver.findElement(By.linkText("Register"));
        String value1=register_link.getAttribute("class");
        System.out.println(value1);

        WebElement search=driver.findElement(By.id("small-searchterms"));
        String value2=search.getAttribute("name");
        System.out.println(value2);
        
        String book=driver.findElement(By.className("inactive")).getAttribute("class");
        System.out.println(book);
        
        String computer=driver.findElement(By.partialLinkText("Comp")).getAttribute("href");
        System.out.println(computer);
        
       driver.findElement(By.id("small-searchterms")).sendKeys("computers");
       String search1=driver.findElement(By.name("q")).getAttribute("value");
        System.out.println(search1);
        
        
	}

}
