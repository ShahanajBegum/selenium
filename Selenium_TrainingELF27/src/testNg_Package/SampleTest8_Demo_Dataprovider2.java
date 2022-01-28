package testNg_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest8_Demo_Dataprovider2 {
	@DataProvider(name = "TestData")
	public Object[][] test() {
		Object[][] data=new Object[3][5];
		data[0][0]="D";
		data[0][1]="Shahanaj";
		data[0][2]="shashushaik97@gmail.com";
		data[0][3]="CIVIL@109";
		data[0][4]="Civil@109";
		
		data[1][0]="D";
		data[1][1]="Rajiya";
		data[1][2]="rajiya97@gmail.com";
		data[1][3]="Rajiya@123";
		data[1][4]="Rajiya@123";
		
		data[2][0]="D";
		data[2][1]="Shahin";
		data[2][2]="shahin97@gmail.com";
		data[2][3]="Shahin@123";
		data[2][4]="Shahin@123";
		
		
		return data;
		}
	@Test(dataProvider ="TestData" )
	public void Demo(String FirstName,String LastName,String email,String password,String confirmpassword) {
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(confirmpassword);
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
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
