package testNg_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest9_Login_DataProvider3 {
	@DataProvider(name = "TestData")
	public Object[][] test() {
		Object[][] data=new Object[1][2];
		data[0][0]="shashushaik97@gmail.com";
		data[0][1]="CIVIL@109";
		
		
		return data;

}
	@Test(dataProvider = "TestData")
	public void login_Tc(String UserName,String Password) {
		System.out.println(UserName);
		System.out.println(Password);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.close();
}
}
