package utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test1_Utility_Methods {

public static String Test_Configuration(String Key) throws IOException {
		
		String path="./Test_Configuration/Configure.Property";
		File file = new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		//Object for Properties Class
		
		Properties prop= new Properties();
		prop.load(fis);
		
		String value=prop.getProperty(Key);
		return value;
	}

		
	 
	}


	



