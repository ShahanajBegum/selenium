package testNg_Package;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest7_DataProvider1 {
	@DataProvider(name = "DemoData")
	public Object[][] test() {
		Object[][] data=new Object[1][2];
		data[0][0]="Ameer";
		data[0][1]="ameer@123";
		return data;
		}
	@Test(dataProvider ="DemoData" )
	public void Demo(String UserName,String Password) {
		System.out.println(UserName);
		System.out.println(Password);
	}
	

}
