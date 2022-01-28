package Collebera1;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_Coordinates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        Point p=new Point(100,50);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition().getX());

	}

}
