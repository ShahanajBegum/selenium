package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_Locators_Assign7 {
	

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			driver.manage().window().maximize();
			WebElement register = driver.findElement(By.linkText("Register"));
			boolean b1=register.isDisplayed();
			System.out.println(b1);
			register.click();
			
			
			/*if(register.isDisplayed())
				register.click();*/
			
			WebElement gender = driver.findElement(By.id("gender-female"));
			gender.click();
			boolean b=gender.isSelected();
			System.out.println(b);
	     
			/*	if(!gender.isSelected())
				gender.click(); */
			driver.findElement(By.id("FirstName")).sendKeys("D");
			driver.findElement(By.id("LastName")).sendKeys("Shahanaj");
			driver.findElement(By.name("Email")).sendKeys("shashushaik97@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("CIVIL@109");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("CIVIL@109");
			boolean s = driver.findElement(By.id("register-button")).isEnabled();
			System.out.println(s);
			driver.close();
			
			}

	}


