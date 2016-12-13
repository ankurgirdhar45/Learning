package code;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadProperty {
	@Test
	public void readPr() throws IOException{
		Properties prop = new Properties();
		
		//two ways to initialise both give same result
		//FileInputStream fis = new FileInputStream("src\\config\\object.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\config\\object.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(System.getProperty("user.dir"));
	}
}
