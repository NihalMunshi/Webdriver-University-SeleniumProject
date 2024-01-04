package Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Baseclass;
import page.Verify_link_counts_page;

public class Verify_link_counts extends Baseclass 
{
	Baseclass base= new Baseclass();
	Verify_link_counts_page tc= new Verify_link_counts_page();
	
	
	@Test
	public void Login() throws IOException
	{
		WebDriver el=base.Setup();
		tc.verifyLinks(el);
		base.teardown();

	}
}
