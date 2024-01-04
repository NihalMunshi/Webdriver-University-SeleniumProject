package page;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;


import Base.Baseclass;
import Base.Element_function;

public class Contact_us_page extends Baseclass
{
	Element_function el =new Element_function();
	Baseclass base= new Baseclass();
	
	public void click_on_contact_link(WebDriver driver) throws IOException 
	{
		Properties prop = base.Fetch_from_prop();
		el.click_link_by_text(prop.getProperty("Contact_us_link"), driver);
	}


	public void verify_contact_us_page(WebDriver driver) throws IOException
	{
		Properties prop = base.Fetch_from_prop();
		el.find_page_by_header(prop.getProperty("contact_us_page_header"), driver);
	}
}



