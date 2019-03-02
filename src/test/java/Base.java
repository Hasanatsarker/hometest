import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver dr;
	
	public void setup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		 dr=new ChromeDriver();
		 dr.get("https://www.facebook.com/");
		 
		 Property t= new Property();
		 Properties d= t.abc();
		String j= d.getProperty("url");
		 
		
	
	}
	
	
	
	
	
	
	
	public void Teardown() {
		
		dr.quit();
		
	}
			
	
	
	

}
