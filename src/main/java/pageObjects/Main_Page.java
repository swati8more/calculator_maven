package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Main_Page {
		
	public WebDriver driver;
	
	By in=By.id("sciInPut");
	By out=By.id("sciOutPut");
	By equal=By.xpath("//span[contains(text(),'=')]");
	//public WebElement in=driver.findElement(By.id("sciInPut"));
	//public WebElement out=driver.findElement(By.id("sciOutPut"));
	
	public Main_Page (WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getin()
	{
		return driver.findElement(in);
	}
	
	public WebElement getout()
	{
		return driver.findElement(out);
	}
	
	public WebElement equalto()
	{
		return driver.findElement(equal);
	}
	

}
