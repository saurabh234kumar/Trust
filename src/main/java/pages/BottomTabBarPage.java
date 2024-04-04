package pages;

public class BottomTabBarPage extends BasePage {
	
	 static BottomTabBarPage instance = null;
	
	
	public static synchronized BottomTabBarPage getInstance() {
        if (instance == null) {
        	
        }
        return instance;
    }
	
	public static String home() {
		   String title;
		   title = home.getAttribute("text").trim();
		   return title;
	   }
	
	
	public static String swap() {
		   String title;
		   title = swap.getAttribute("text").trim();
		   return title;
	   }
	
	
	
	public static String earn() {
		   String title;
		   title = earn.getAttribute("text").trim();
		   return title;
	   }
	
	public static String discover() {
		   String title;
		   title = browser.getAttribute("text").trim();
		   return title;
	   }
	
	public static String browser() {
		   String title;
		   title = browser.getAttribute("text").trim();
		   return title;
	   }
	



}
