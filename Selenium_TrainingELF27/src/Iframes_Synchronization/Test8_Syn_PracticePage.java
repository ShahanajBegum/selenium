package Iframes_Synchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test8_Syn_PracticePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.name("radioButton")).click();
		 driver.findElement(By.id("autocomplete")).sendKeys("shahanaj");
		 WebElement drop_down=driver.findElement(By.name("dropdown-class-example"));
		 Select select=new Select(drop_down);
		 select.selectByValue("option2");
		 
		 WebElement check_box1=driver.findElement(By.xpath("//input[@name='checkBoxOption1']"));
		 check_box1.click();
		 WebElement check_box2=driver.findElement(By.xpath("//input[@name='checkBoxOption2']"));
		 check_box2.click();
		 

		 WebElement switch1=driver.findElement(By.xpath("//button[@id='openwindow']"));
		 switch1.click();
		
		 String parent = driver.getWindowHandle();
			System.out.println(parent);
			driver.findElement(By.xpath("//button[@id='openwindow']")).click();
			Set<String> windows = driver.getWindowHandles();
			System.out.println(windows);
			for(String s:windows) {
				if(!s.equals(parent)) { 
					driver.switchTo().window(s);
					driver.manage().window().maximize();
					driver.close();
				}
			}
		 			
			driver.switchTo().window(parent);
			 driver.findElement(By.xpath("//a[@id='opentab']")).click();
			 Set<String> windows1 = driver.getWindowHandles();
			for(String s1:windows1) {
				if(!s1.equals(parent)) {
					driver.switchTo().window(s1);
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Shahanaj");
			driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
			driver.switchTo().alert().accept();
			
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ameer");
			driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
			driver.switchTo().alert().accept();
			
			WebElement iframe = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
			driver.switchTo().frame(iframe);
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
			
			for(int i=3;i<30;i++) {
				System.out.println(driver.findElement(By.xpath("(//td)["+i+"]")).getText());
			}

			System.out.println(driver.findElement(By.xpath("//tr[1]/td[1]")).getText());
				
			driver.close();
			
			
		
			
		 
		 
		 
		 
		 
		 
		

	}

}
