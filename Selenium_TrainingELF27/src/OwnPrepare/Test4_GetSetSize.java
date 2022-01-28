package OwnPrepare;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_GetSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        Dimension d=new Dimension(600,300);
        driver.manage().window().setSize(d);
        System.out.println(driver.manage().window().getSize());

	}

}
