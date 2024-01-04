package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Element_function extends Baseclass
{
	WebDriver driver;
	public void find_Element_links(String Xpath, WebDriver driver)
	{
		try 
		{
			List<WebElement>All_links = driver.findElements(By.xpath(Xpath));
			
			int count=All_links.size();
			System.out.println(count+" total elements ");
		}
		catch(Exception e)
		{
			System.out.println("Element not found");
		}
	}
	
	
	
	public void click_link_by_text(String Xpath, WebDriver driver)
	{
		try
		{
			driver.findElement(By.xpath(Xpath)).click();
		}
		catch(Exception e)
		{
		 System.out.println("Element not found");	
		}
	}

	
	public String find_page_by_header(String Xpath, WebDriver driver)
	{
		try
		{
			driver.findElement(By.xpath(Xpath)).isDisplayed();
			String Win_id=driver.getWindowHandle();
			return Win_id;
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		 return null;
		}
		
	}

}
