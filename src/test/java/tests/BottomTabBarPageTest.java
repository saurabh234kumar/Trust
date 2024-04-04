package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.BottomTabBarPage;


public class BottomTabBarPageTest extends BaseTest {
	
	BottomTabBarPage tabBarPage = BottomTabBarPage.getInstance();

    @Test(description = "Home Tab bar page validation", priority = 1, alwaysRun= true)

    public void homeValidation() {
    	
    	SoftAssert softAssert = new SoftAssert();
    	softAssert.assertEquals(BottomTabBarPage.home(), "Home");
     
    }

    @Test(description = "Swap Tab bar page validation", priority = 2, alwaysRun= true)
    public void swapValidation() {

       SoftAssert softAssert = new SoftAssert();
    	
    	softAssert.assertEquals(BottomTabBarPage.swap(), "Swap");
    	softAssert.assertAll();
     
    }
    
    @Test(description = "Earn Tab bar page validation", priority = 3, alwaysRun= true)

    public void earnValidation() {
    	SoftAssert softAssert = new SoftAssert();
    	
    	softAssert.assertEquals(BottomTabBarPage.earn(), "earn");
    	softAssert.assertAll();
    }
    
    
    @Test(description = "Discover Tab bar validation", priority = 4, alwaysRun= true)

    public void discoverValidation() {
    	
        SoftAssert softAssert = new SoftAssert();
    	
    	softAssert.assertEquals(BottomTabBarPage.discover(), "Discover");
    	softAssert.assertAll();
       
    }
    
    
    @Test(description = "Browser Tab bar validation", priority = 5, alwaysRun= true)

    public void browserValidation() {
    	Assert.assertEquals(BottomTabBarPage.browser(), "Browser");
    	
       


    }

}