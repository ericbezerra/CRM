package br.com.eric.crm.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Resources {
	
	public static Properties getProp() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream(
				"src/resources/contrato.properties");
		props.load(file);
		return props;

	}
	
}
