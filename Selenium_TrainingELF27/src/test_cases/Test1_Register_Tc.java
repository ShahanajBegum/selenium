package test_cases;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility_package.Test1_Utility_Methods;

public class Test1_Register_Tc {
	@DataProvider(name = "TestData")
	public Object[][] test() {
		Object[][] data=new Object[1][5];
		data[0][0]="D";
		data[0][1]="Shahanaj";
		data[0][2]="shashushaik97@gmail.com";
		data[0][3]="CIVIL@109";
		data[0][4]="Civil@109";
		return data;
	}
@Test(dataProvider = "TestData")
public void Demo(String FirstName,String LastName,String email,String password,String confirmpassword) throws IOException {
	System.out.println(FirstName);
	System.out.println(LastName);
	System.out.println(email);
	System.out.println(password);
	System.out.println(confirmpassword);
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	driver.get(Test1_Utility_Methods.Test_Configuration("Url"));
	driver.findElement(By.xpath("//a[.='Register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(FirstName);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(LastName);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(confirmpassword);
	 driver.findElement(By.xpath("//input[@id='register-button']")).click();
	 driver.close();
	
}
}