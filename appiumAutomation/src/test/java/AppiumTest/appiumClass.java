package AppiumTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class appiumClass {
	
	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options =new UiAutomator2Options();
		options.setCapability("deviceName", "balaji");
		options.setCapability("app", "C:\\Users\\jayab\\eclipse-workspace\\appiumAutomation\\src\\test\\resources\\ApiDemos-debug.apk");
		
		options.setCapability("appium:ignoreHiddenApiPolicyError", true);
		options.setCapability( "appium:noReset", true);
		AndroidDriver driver =new AndroidDriver(new URL(" http://127.0.0.1:4723/ "),options);
        System.out.println("Appium session started successfully!");

	}

}
