package testNg_Package;

import org.testng.annotations.Test;

public class SampleTest4_Include_exclude {
	@Test(groups = "sanity",dependsOnMethods = "Register")
	public void LoginTest() {
		System.out.println("Login_test");
		
	}
	@Test(groups = "sanity")
    public void Register() {
    	System.out.println("Register_test");
    }
    @Test
    public void searchProduct() {
    	System.out.println("searchproduct_test");
    }
    @Test
    public void searchTest() {
    	System.out.println("search_test");
    }
}
