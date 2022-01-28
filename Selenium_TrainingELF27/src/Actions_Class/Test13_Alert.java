package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test13_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
	    WebElement double_ciick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act=new Actions(driver);
        act.doubleClick(double_ciick).click().perform();
        Alert a= driver.switchTo().alert();
        String text=a.getText();
        System.out.println(text);
        a.accept();
        driver.close();
	}

}
