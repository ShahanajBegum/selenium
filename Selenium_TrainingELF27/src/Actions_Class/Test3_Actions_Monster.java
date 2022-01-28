package Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3_Actions_Monster {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("https://www.monsterindia.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement job_Search=driver.findElement(By.xpath("(//a[@class='main-nav-link'])[2]"));
        Actions act=new Actions(driver);
        act.moveToElement(job_Search).build().perform();
        Thread.sleep(1000);
        WebElement job_skill=driver.findElement(By.xpath("//a[text()='Jobs by Skills']"));
        act.moveToElement(job_skill).build().perform();
        Thread.sleep(1000);
      /*  WebElement java_jobs=driver.findElement(By.xpath("//a[contains(@onclick,'window.homeBehavior.home.common.trackHeaderTopLinkChildResponse(event, \"Jobs by Skills\",\"Java ')]"));
        act.moveToElement(java_jobs).click().perform();
        Thread.sleep(1000);*/
        driver.close();
	}

}
