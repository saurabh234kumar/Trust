package pages;


import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.DriverUtils;

public class BasePage {

    protected AppiumDriver driver;
    

    public BasePage() {
    	
        this.driver = DriverUtils.getDriver();
        
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Home')]")
	static
    WebElement home;
    
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Swap')]")
    static
    WebElement swap;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Earn')]")
    static
    WebElement earn;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Discover')]")
    static
    WebElement discover;
    
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Browser')]")
	static
    WebElement browser;
    

   

}
