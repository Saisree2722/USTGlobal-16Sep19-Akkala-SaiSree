package com.ustglobal.filehandling;

import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

public class PropertiesFileReader 
{
	public static void main(String[] args) {
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String url=properties.getProperty("url");
			String user=properties.getProperty("user");
			String password = properties.getProperty("password");

			System.out.println("URL: "+url);
			System.out.println("User: "+user);
			System.out.println("Password: "+password);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
