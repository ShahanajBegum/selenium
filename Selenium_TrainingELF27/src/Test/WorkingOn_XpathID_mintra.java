package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_XpathID_mintra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//Input[@class='desktop-searchBar']")).sendKeys("T-shirts for women");
	    driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
	    //driver.findElement(By.xpath("")
	   // driver.findElement(By.xpath
	}

}
