package Collebera1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_UrlTitlePageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://www.filpkart.com/");
        driver.manage().window().maximize();
        String a1=driver.getCurrentUrl();
        System.out.println(a1);
        
        String a2=driver.getPageSource();
        System.out.println(a2);
        
       
        String a=driver.getTitle();
        System.out.println(a);
        
        
      //  System.out.println("title" +driver.getTitle());
	}

}
