import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AddingCal {
	WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		String runMode;//Property file
		if(runMode.equals("local")) {
			driver = new ChromeDriver();
		}
		else if(runMode.equals("remote")) {
			
		
		
		DesiredCapabilities d = new DesiredCapabilities();
		d.setBrowserName("Chrome");
		d.setVersion("18.0");
		d.setPlatform(Platform.WIN11);
		 driver = new RemoteWebDriver(new URL(" http://192.168.86.248:4444/wd/grid"), d);
		
		}
	}

}
