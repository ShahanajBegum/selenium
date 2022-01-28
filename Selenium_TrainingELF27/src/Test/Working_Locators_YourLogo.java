package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_Locators_YourLogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        String contact=driver.findElement(By.linkText("Contact us")).getText();
        System.out.println(contact);
        String sign=driver.findElement(By.partialLinkText("Sign")).getText();
        System.out.println(sign);
        
        driver.findElement(By.className("sf-with-ul"));
       // System.out.println(women);
        String dress=driver.findElement(By.partialLinkText("Dresses")).getText();
        System.out.println(dress);
        String tshirts=driver.findElement(By.linkText(" T-shirts")).getText();
        System.out.println(tshirts);
        driver.findElement(By.className("navigation_page"));
        driver.findElement(By.id("search_query_top")).sendKeys("faded short sleeve t-shirts");
        driver.findElement(By.className("btn btn-default button-search")).click();
        String topseller=driver.findElement(By.linkText("Top sellers")).getText();
        System.out.println(topseller);

	}

}
