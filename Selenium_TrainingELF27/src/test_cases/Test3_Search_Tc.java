package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility_package.Test1_Utility_Methods;

public class Test3_Search_Tc {
	@Test
	public void Tc01() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.get("http://demowebshop.tricentis.com/");
		driver.get(Test1_Utility_Methods.Test_Configuration("Url"));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computer");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.close();
	}
}


