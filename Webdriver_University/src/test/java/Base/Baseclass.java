package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	protected WebDriver driver;
	
	
	
	public WebDriver Setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/index.html");
		System.out.println(driver.getTitle());	
		return driver;
	}
	
	 public Properties Fetch_from_prop() throws IOException
	 {
		 Properties prop = new Properties();
			FileInputStream objfile = new FileInputStream("./src/test/resources/object.properties");
			prop.load(objfile);
			return prop;
			
	 }
	 
	 public void switchToChildTab()
	 {
		 Set<String> Handles= driver.getWindowHandles();
		 Iterator it = Handles.iterator();
		 
		 String parentID=(String) it.next();
		 String childID=(String) it.next();
		 driver.switchTo().window(childID); 
		 System.out.println(driver.getTitle());
	 }

	
	public void teardown()
	{
		driver.quit();
	}
	

}
