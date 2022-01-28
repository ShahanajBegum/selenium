package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_CssSelector1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/");
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("input[type='submit']"));
    driver.findElement(By.cssSelector("input[type='button']"));
    driver.findElement(By.cssSelector("input[value='Vote']"));
    driver.findElement(By.cssSelector("input[type='radio']"));
    driver.findElement(By.cssSelector("input[type='text']"));
    driver.close();
}
}
