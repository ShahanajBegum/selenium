package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test21_Actions_DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//div[text()='Copenhagen'][2]"));
		WebElement destination=driver.findElement(By.xpath("//div[text()='Seoul'][2]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source,destination).perform();
        WebElement click_hold=driver.findElement(By.xpath("//div[text()='Seoul'][2]"));
        act.clickAndHold(click_hold).perform();
        Thread.sleep(2000);
        act.release(click_hold).perform();
	}

}
