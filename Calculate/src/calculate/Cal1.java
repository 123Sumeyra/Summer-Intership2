package calculate;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Cal1 {
static AppiumDriver<MobileElement> driver;
	
	
	
	
	
	public static void main(String[] args) {
		try {
			openCalculate() ;
			
		} catch (Exception e) {
			
			// TODO: handle exception
			
		}
    	
		
		 
	}
	
		
	
	public static void openCalculate() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Sumeyraemulator");
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command(Real Phone)
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity","com.android.calculator2.Calculator");
       
        driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
       
        
        System.out.println("Start ----------");
        MobileElement two = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
        two.click();
        MobileElement plus = (MobileElement) driver.findElementById("com.google.android.calculator:id/op_add");
        plus.click();
        MobileElement tree = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_3");
        tree.click();
        
        MobileElement eq = (MobileElement) driver.findElementById("com.google.android.calculator:id/eq");
        eq.click();
        
        Thread.sleep(3000);
        
        String result = driver.findElementById("com.google.android.calculator:id/result_final").getText();
        System.out.println(result);
       
        if(result.equals("5")) {
    	   System.out.println("Test pasted");
        }
        else {
    	    System.out.println("Test failed");
    	   
        }
       Thread.sleep(5000);
     
        
        
        
        
       
        
        

        
		/*
		 * MobileElement el3 = (MobileElement) driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]"
		 * ); el3.click(); MobileElement el4 = (MobileElement)
		 * driver.findElementByXPath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]"
		 * ); el4.click(); MobileElement el5 = (MobileElement)
		 * driver.findElementById("com.faladdin.app:id/btnWatchAd"); el5.click();
		 */
       
       driver.quit();	
	}
 
  
   
	

}
