package curs11;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("pass");
		obj.readPropertiesFile("email");

	}

}
