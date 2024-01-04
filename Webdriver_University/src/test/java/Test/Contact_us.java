package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Baseclass;
import page.Contact_us_page;

public class Contact_us extends Baseclass 
{
	Contact_us_page contact= new Contact_us_page();
	Baseclass base =new Baseclass();
	

	@Test(priority=1)
	public void click_on_contact_us() throws IOException
	{
		WebDriver driver=base.Setup();
		contact.click_on_contact_link(driver);
		base.switchToChildTab();
		contact.verify_contact_us_page(driver);
		base.teardown();
		
	}
}
