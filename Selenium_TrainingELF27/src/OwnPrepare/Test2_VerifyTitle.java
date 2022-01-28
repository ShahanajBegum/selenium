package OwnPrepare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    String actualTitle=driver.getTitle();
	    System.out.println(actualTitle);
	    if(actualTitle.equalsIgnoreCase("google"))
	    System.out.println("matching");
	    else
	    	System.out.println("not matching");
	    String actualUrl=driver.getCurrentUrl();
	    System.out.println(actualUrl);
	    if(actualUrl.contains("com"))
	    	System.out.println("its present");
	    else
	    	System.out.println("not present");
	    

	}

}
