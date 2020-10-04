package fal;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Faladdin {
	static AppiumDriver<MobileElement> driver;
	
	
	
	public static void main(String[] args) {
		try {
			openFaladdin();
			
		} catch (Exception e) {
			
			// TODO: handle exception
			
		}
    					 
	}
	
		
	
	public static void openFaladdin() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Sumeyraemulator");
        caps.setCapability("udid", "emulator-5554"); 
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.faladdin.app");
        caps.setCapability("appActivity","com.faladdin.app.Activities.LoginActivity");
        caps.setCapability("noReset","false");
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
        Thread.sleep(5000);
        
        System.out.println("Start ----------");
        
        MobileElement el1 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        el1.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        MobileElement el2 = (MobileElement) driver.findElementById("com.faladdin.app:id/btnGoogle");
        el2.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.gms:id/account_display_name");
        el3.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//*[contains(@text, \"DAILY HOROSCOPE\")]");
        el4.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
       
        MobileElement el5 = (MobileElement) driver.findElementById("com.faladdin.app:id/btnWatchAd");
        el5.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        System.out.println("Oluyor 1----------");
        
        MobileElement el6 = (MobileElement) driver.findElementByXPath("//*[@class='android.widget.Image']");
 
        el6.click(); 
        System.out.println("Oluyor 1----------");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        MobileElement el7 = (MobileElement) driver.findElementById("com.faladdin.app:id/imgBtnEdit");
        el7.click(); 
        
        System.out.println("Oluyor ----------");
        
        
        
        
        

       
        //driver.quit();

       
		
	}
 
  
   
	



}







