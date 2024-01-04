package page;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import Base.Baseclass;
import Base.Element_function;

public class Verify_link_counts_page extends Baseclass 
{
	
	Element_function func=new Element_function();
	Baseclass base= new Baseclass();
	
	public void verifyLinks(WebDriver dr) throws IOException 
	{
		Properties prop=base.Fetch_from_prop();
		func.find_Element_links(prop.getProperty("Links_on_Web_page"),dr);
	}

}
