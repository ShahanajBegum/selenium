package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        List<WebElement> a=driver.findElements(By.tagName("a"));
       // int count=a.size();
        //System.out.println(count);
       /* for(int i=0;i<count;i++) {
        WebElement b=a.get(i);
        String c=b.getText();
        System.out.println(c);
        }*/
        for(WebElement e:a) {
        	 String c=e.getText();
        	 System.out.println(c);
        }
        List<WebElement> img=driver.findElements(By.tagName("img"));
        int count1=img.size();
        System.out.println(count1);
       
	}

}
