package Actions_Class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18_CloseOnlyFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			driver.manage().window().maximize();
			
			String parentWindow = driver.getWindowHandle();
			
			driver.findElement(By.xpath("//a[text()='Facebook']")).click();
			Thread.sleep(2000);
			
			Set<String> allWindows = driver.getWindowHandles();
			for(String w: allWindows) {
				
				if(!w.equals(parentWindow)) {
					
					driver.switchTo().window(w);
					driver.close();
				}
			}
	}
}
          
