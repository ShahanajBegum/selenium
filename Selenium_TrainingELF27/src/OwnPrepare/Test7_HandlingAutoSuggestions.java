package OwnPrepare;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7_HandlingAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(1000);
        List<WebElement> allauto=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
        Thread.sleep(1000);
        int count=allauto.size();
        //System.out.println(suggestions.size());
     /*   for(int i=1;i<count;i++)
        {
        	String allautoSuggestions=allauto.get(i).getText();
        	System.out.println(allautoSuggestions);
        }*/
        for(WebElement e:allauto) {
        	System.out.println(e.getText());
        }
        
        
    driver.close();
	}

}
