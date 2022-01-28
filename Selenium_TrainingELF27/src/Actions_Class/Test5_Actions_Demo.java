package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test5_Actions_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.className("ico-register")).click();
	    driver.findElement(By.id("gender-female")).click();
	    driver.findElement(By.name("FirstName")).sendKeys("D");
	    driver.findElement(By.cssSelector("input#LastName")).sendKeys("Shahanaj"); 
	    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("sha19999@gmail.com");
	    driver.findElement(By.cssSelector("input[class='text-box single-line password']")).sendKeys("Shahann@109");
	    Thread.sleep(1000);
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Shahann@109");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input#register-button")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
	    WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
	    Actions act=new Actions(driver);
	    act.moveToElement(computer).build().perform();
	    WebElement desktop=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
	    act.moveToElement(desktop).click().build().perform();
	    Thread.sleep(1000);
	    WebElement order=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	    order.click();
	    Select s1=new Select(order);
	     s1.selectByIndex(3);
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("(//input[contains(@type,'button')])[2]")).click();
	    
	     WebElement display=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		    display.click();
		    Select s2=new Select(display);
		     s2.selectByIndex(2);
		     Thread.sleep(1000);

		     WebElement grid=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
			    grid.click();
			    Select s3=new Select(grid);
			     s3.selectByIndex(1);
			     
			     WebElement addcart=driver.findElement(By.xpath("(//input[contains(@type,'button')])[2]"));
			     addcart.click();
			     Thread.sleep(5000);
			     driver.findElement(By.xpath("//input[@data-productid='72']")).click();
			     Thread.sleep(1000);
			     
			     WebElement e=driver.findElement(By.partialLinkText("Shopping cart"));
			     act.moveToElement(e).click().build().perform();
			     Thread.sleep(1000);
			     
			     driver.findElement(By.partialLinkText("Log out")).click();
			     Thread.sleep(1000);
			     
	    
	   driver.close();
	}

}
