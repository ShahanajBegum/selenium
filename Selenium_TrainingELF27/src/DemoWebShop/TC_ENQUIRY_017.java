package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ENQUIRY_017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a")).click();
		driver.findElement(By.id("FullName")).sendKeys("shahanaj");
		driver.findElement(By.id("Email")).sendKeys("shashugmail");
		driver.findElement(By.name("send-email")).click();

	}
}
