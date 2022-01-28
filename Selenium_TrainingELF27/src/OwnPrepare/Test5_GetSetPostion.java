package OwnPrepare;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5_GetSetPostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition().getX());
        System.out.println(driver.manage().window().getPosition().getY());
        Point p=new Point(30,150);
        driver.manage().window().setPosition(p);
       System.out.println(driver.manage().window().getPosition().getX());
       System.out.println(driver.manage().window().getPosition().getY());
      
	}

}
