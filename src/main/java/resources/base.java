package resources;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	 protected WebDriver driver;

	public WebDriver initilaseDriver() throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Webdrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
	}
}
