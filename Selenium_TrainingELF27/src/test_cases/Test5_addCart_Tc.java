package test_cases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility_package.Test1_Utility_Methods;

public class Test5_addCart_Tc {
	@DataProvider(name = "TestData")
	public Object[][] test() {
		Object[][] data=new Object[1][2];
		data[0][0]="shashushaik97@gmail.com";
		data[0][1]="CIVIL@109";
		
		
		return data;

}
	@Test(dataProvider = "TestData")
	public void addCard(String UserName, String Password) throws IOException {
		System.out.println(UserName);
		System.out.println(Password);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://demowebshop.tricentis.com/");
	driver.get(Test1_Utility_Methods.Test_Configuration("Url"));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	WebElement search=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	Actions actions=new Actions(driver);
	actions.moveToElement(search).build().perform();
	
	WebElement search1=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
	search1.click();
	driver.findElement(By.xpath("(//div[@class='product-item'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	driver.close();
	
	}
	
	@Test(dataProvider = "TestData")
	public void addCardExclude(String UserName, String Password) throws IOException {
		System.out.println(UserName);
		System.out.println(Password);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://demowebshop.tricentis.com/");
	driver.get(Test1_Utility_Methods.Test_Configuration("Url"));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	WebElement search=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	Actions actions=new Actions(driver);
	actions.moveToElement(search).build().perform();
	
	WebElement search1=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
	search1.click();
	driver.findElement(By.xpath("(//div[@class='product-item'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	driver.close();
	
	}
	@Test(dataProvider = "TestData")
	public void addCardInclude(String UserName, String Password) throws IOException {
		System.out.println(UserName);
		System.out.println(Password);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://demowebshop.tricentis.com/");
	driver.get(Test1_Utility_Methods.Test_Configuration("Url"));
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	driver.findElement(By.xpath("//input[@class='email']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	WebElement search=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	Actions actions=new Actions(driver);
	actions.moveToElement(search).build().perform();
	
	WebElement search1=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
	search1.click();
	driver.findElement(By.xpath("(//div[@class='product-item'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
	driver.close();
	
	}

}
