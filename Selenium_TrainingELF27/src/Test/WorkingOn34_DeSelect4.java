package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingOn34_DeSelect4 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Books")).click();
	    WebElement e=driver.findElement(By.xpath("//select[@id='products-orderby']"));
	    Select s=new Select(e);
	    List<WebElement> options1=s.getOptions();
	    for(WebElement a1:options1) {
	    	System.out.println(a1.getText());
	    }
	    System.out.println();
	    WebElement e1=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	    Select s1=new Select(e1);
	    List<WebElement> options2=s1.getOptions();
	    for(WebElement a2:options2) {
	    	System.out.println(a2.getText());
	    }
	    System.out.println();
	    WebElement e3=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	    Select s3=new Select(e3);
	    List<WebElement> options3=s3.getOptions();
	   /* for(WebElement a3:options3) {
	    	System.out.println(a3.getText());
	    }*/
	    for(int i=0;i<options3.size();i++) {
	    	String s4=options3.get(i).getText();
	    	System.out.println(s4);
	    	
	    	
	    }

	    
	    driver.close();
	 
		   }
	 
	   
	

	}
