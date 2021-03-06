package cts.miniproject.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

/*
 * @author Saipriya
 * Class created to configure properties and access the path of Browser,ExcelSheet,and URL of Website
 */
public class ConfigReader {
	Properties pro;
	
	public ConfigReader() {
		
		  try {
			File src=new File("./Configuration/Config.property");
			  
			  FileInputStream fis=new FileInputStream(src);
			  
			  pro=new Properties();
			  
			  pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is" + e.getMessage());
		} 
			  
	}
	public String getchromepath() {
		String path=pro.getProperty("chromeDriver");
		return path;
	}
	
	public String getApplicationURL() {
		return pro.getProperty("URL");
	}
	public String getExcelAccess() {
		return pro.getProperty("ExcelData");
		
	}

}
