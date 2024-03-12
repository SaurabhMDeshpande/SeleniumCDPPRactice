package seleniumcdpIntegration;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class cdptest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools=driver.getDevTools();
		
		devtools.createSession();
		// width height 
		devtools.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("http://www.google.com");driver.findElement(By.xpath("//div[@class='YacQv']")).sendKeys("Saurabh");
	}

}
