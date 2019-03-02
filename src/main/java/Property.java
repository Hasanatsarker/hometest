import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Property {
	
	
	public Properties abc() throws IOException {
		
		Properties a=new Properties();
		FileInputStream b= new FileInputStream ("/Users/hasanath/eclipse-workspace/Hometest/p.properties");
		a.load(b);
		return abc();
		
	}

}
