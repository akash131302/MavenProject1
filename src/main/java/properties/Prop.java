package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Prop {
	
	Properties prop;
	String path="C:\\Users\\DELL\\eclipse-workspace\\MavenProject\\abc.properties";
	
	@Test
	public void test() throws IOException {
		
		FileInputStream ip=new FileInputStream(path);
		
		prop=new Properties();
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		
	}

}
