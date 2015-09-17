package com.oracle.collection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {
		// ·½·¨Á´
		InputStream is = Thread.currentThread().getContextClassLoader()
				.getResourceAsStream("config.properties");
		Properties prop = new Properties();
		try {
			prop.load(is);
			System.out.println(prop.getProperty("name"));
			prop.setProperty("pwd", "abcd");
			System.out.println(prop.getProperty("pwd"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
