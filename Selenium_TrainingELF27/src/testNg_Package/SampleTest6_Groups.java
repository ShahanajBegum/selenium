package testNg_Package;

import org.testng.annotations.Test;

public class SampleTest6_Groups {
	@Test(groups = "sanity")
	public void  addWishlist() {
		System.out.println("addwish_test");
		
	}
    @Test
    public void removeWishlist() {
    	System.out.println("RemoveWish_test");
    }
    @Test
    public void advancedSearch() {
    	System.out.println("advanceSearch_test");
    }
    @Test(groups = "sanity")
    public void addCart() {
    	System.out.println("addcart_test");
    }

}
