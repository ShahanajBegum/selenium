package Collebera1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12_DisableElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver  driver=new ChromeDriver();
	    driver.get("https://www.oracle.com/java/technologies/downloads/");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
        driver.findElement(By.linkText("jdk-8u311-linux-x64.tar.gz")).click();
        Thread.sleep(1000);
        WebElement disabledbutton=driver.findElement(By.linkText("Download jdk-8u311-linux-x64.tar.g"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",disabledbutton);
	}

}
