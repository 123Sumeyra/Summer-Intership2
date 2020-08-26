import java.io.File;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
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
		caps.setCapability("deviceName", "Galaxsy J7 Prime2");
        caps.setCapability("udid", "330040cde4f9c49d"); //DeviceId from "adb devices" command(Real Phone)
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "9.0");
        caps.setCapability("skipUnlock","true");
        caps.setCapability("appPackage", "com.faladdin.app");
        caps.setCapability("appActivity","com.faladdin.app.Activities.LoginActivity");
        caps.setCapability("noReset","false");
        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        
        System.out.println("Start ----------");
		
	}
 
  
   
	


}
