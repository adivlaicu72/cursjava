package curs11;

import java.io.*;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	public void writePropertiesFile() throws IOException {
		
		try (OutputStream outPutStream = new FileOutputStream("test.properties"))
		{
			Properties propFile = new Properties();
			propFile.setProperty("user", "testuser");
			propFile.setProperty("pass", "pass1234");
			propFile.setProperty("email", "testuser@test.com");
			propFile.store(outPutStream, "am salvat fisier properties");
//			outPutStream.close();	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}		
		
	}
	
	public void readPropertiesFile(String key) {
		
		try(InputStream inPutStream = new FileInputStream("test.properties")) {
			
			Properties prop = new Properties();
			prop.load(inPutStream);
			
			String value = prop.getProperty(key);
			System.out.println(value);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void updatePropertiesFile(String key, String value) {
		
		Properties prop = new Properties();
		//citesc fisierul
		
	}
}
