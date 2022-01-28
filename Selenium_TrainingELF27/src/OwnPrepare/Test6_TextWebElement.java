package OwnPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6_TextWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://demo.actitime.com");
        driver.manage().window().maximize();
        WebElement link=driver.findElement(By.linkText("actiTIME Inc."));
        String Text1=link.getText();
        System.out.println(Text1);
        

	}

}
