package Collebera1;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3_ReSize_Width_height {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.maxfashion.in/");
		driver.manage().window().setSize(new Dimension(100, 200));
      
        
		

	}

}
