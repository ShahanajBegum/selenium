package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOn_RetriveText_gettext {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\ameer\\Desktop\\INSTALL\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        WebElement register_link=driver.findElement(By.linkText("Register"));
        String textValue1=register_link.getText();
        System.out.println(textValue1);
        WebElement logIn =driver.findElement(By.partialLinkText("Log"));
        String textValue2=logIn.getText();
        System.out.println(textValue2);
        WebElement shoppingCart=driver.findElement(By.linkText("Shopping cart"));
        String textValue3=shoppingCart.getText();
        System.out.println(textValue3);
        WebElement wishlist=driver.findElement(By.partialLinkText("Wish"));
        String textValue4=wishlist.getText();
        System.out.println(textValue4);
        WebElement books=driver.findElement(By.partialLinkText("Boo"));
        String textValue5=books.getText();
        System.out.println(textValue5);
        WebElement computer=driver.findElement(By.partialLinkText("Com"));
        String textValue6=computer.getText();
        System.out.println(textValue6);
        WebElement electrone=driver.findElement(By.partialLinkText("Elec"));
        String textValue7=electrone.getText();
        System.out.println(textValue7);
        String app1= driver.findElement(By.partialLinkText("App")).getText();
        System.out.println(app1);
        
	}

}
