package Actions_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_LOGIN_008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@href='/login']"))).click().perform();;
		act.moveToElement(driver.findElement(By.xpath("//input[@class='email']"))).click().sendKeys("SHAHANAJ39@gmail.comkujgggggggggggggggggggggggggggggggggg").perform();;
		act.moveToElement(driver.findElement(By.xpath("//input[@name='Password']"))).click().sendKeys("CIVIL@109").build().perform();;
		act.moveToElement(driver.findElement(By.xpath("//input[@value='Log in']"))).click().build().perform();
		driver.close();


	}

}
