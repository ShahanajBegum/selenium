package Iframes_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6_Syn_ExplictWait2 {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='ico-login']")))).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shashushaik97@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("//input[@name='Password']"));
		Actions act=new Actions(driver);
		act.moveToElement(pwd).sendKeys("CIVIL@109");
		WebElement  login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		act.moveToElement(login).click();
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computers");
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		driver.findElement(By.xpath("//input[@id='As']")).click();
		
		WebElement elec=driver.findElement(By.xpath("//select[@id='Cid']"));
		Select s=new Select(elec);
		s.selectByValue("7");
		
		WebElement tri=driver.findElement(By.xpath("//select[@id='Mid']"));
		Select s1=new Select(tri);
		s1.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@id='Sid']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@class='button-1 search-button']")))).click();
		
		}

}
