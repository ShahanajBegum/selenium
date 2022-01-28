package testNg_Package;

import org.testng.annotations.Test;

public class SampleTest5_Dependency {
	@Test(dependsOnMethods = "Register")
	public void LoginTest() {
		System.out.println("Login_test");
		
	}
    @Test
    public void Register() {
    	System.out.println("Register_test");
    }
    @Test
    public void searchProduct() {
    	System.out.println("searchproduct_test");
    }
    @Test(dependsOnMethods ="LoginTest")
    public void searchTest() {
    	System.out.println("search_test");
    }
}



