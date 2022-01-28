package testNg_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class SampleTest10_PropertyFile {
	@Test
	public void Demo() throws IOException {
		String path="./Test_Configuration/Configure.Property";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		//Property File
	     Properties prop=new Properties();
	     prop.load(fis);
		
	     System.out.println(prop.getProperty("Name"));
	     System.out.println(prop.getProperty("Company"));
	     System.out.println(prop.getProperty("Contact"));
	}


}
