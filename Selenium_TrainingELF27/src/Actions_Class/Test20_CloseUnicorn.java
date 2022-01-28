package Actions_Class;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test20_CloseUnicorn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Companies"))).build().perform();
		driver.findElement(By.xpath("//a[@title='Unicorn']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String w: allWindows) {
			
			driver.switchTo().window(w);
			if("Unicorns actively hiring".equals(driver.getTitle())) {
				
				driver.close();

	}
		}
}
}