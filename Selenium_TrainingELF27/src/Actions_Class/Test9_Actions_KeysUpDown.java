package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9_Actions_KeysUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_DOWN);
		act.sendKeys(Keys.PAGE_UP);
		act.sendKeys(Keys.PAGE_UP);
		act.sendKeys(driver.findElement(By.xpath("//input[@class='desktop-searchBar']")),"shoes").perform();
	    //act.moveToElement(driver.findElement(By.xpath("//input[@class='desktop-searchBar']"))).click().keyDown(Keys.SHIFT).sendKeys("shoes").keyUp(Keys.SHIFT).perform();
        driver.close();
	}

}
