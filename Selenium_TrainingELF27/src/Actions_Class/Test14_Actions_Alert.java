package Actions_Class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test14_Actions_Alert {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    driver.manage().window().maximize();
   
    Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[.='right click me']"))).contextClick().perform();
   act.moveToElement(driver.findElement(By.xpath("//span[.='Edit']"))).click().perform();
   Alert edit = driver.switchTo().alert();
   System.out.println(edit.getText());
   edit.accept();
   Thread.sleep(2000);
   act.moveToElement(driver.findElement(By.xpath("//span[.='right click me']"))).contextClick().perform();
   act.moveToElement(driver.findElement(By.xpath("//span[.='Cut']"))).click().perform();
   Alert cut = driver.switchTo().alert();
   System.out.println(cut.getText());
   edit.accept();
   Thread.sleep(2000);
   act.moveToElement(driver.findElement(By.xpath("//span[.='right click me']"))).contextClick().perform();
   act.moveToElement(driver.findElement(By.xpath("//span[.='Paste']"))).click().perform();
   Alert Paste = driver.switchTo().alert();
   System.out.println(Paste.getText());
   edit.accept();
   Thread.sleep(2000);
   act.moveToElement(driver.findElement(By.xpath("//span[.='right click me']"))).contextClick().perform();
   act.moveToElement(driver.findElement(By.xpath("//span[.='Delete']"))).click().perform();
   Alert delete = driver.switchTo().alert();
   System.out.println(delete.getText());
   edit.accept();
   Thread.sleep(2000);
   act.moveToElement(driver.findElement(By.xpath("//span[.='right click me']"))).contextClick().perform();
   act.moveToElement(driver.findElement(By.xpath("//span[.='Quit']"))).click().perform();
   Alert quit = driver.switchTo().alert();
   System.out.println(quit.getText());
   edit.accept();
   Thread.sleep(2000);
   driver.close();

    
}
}