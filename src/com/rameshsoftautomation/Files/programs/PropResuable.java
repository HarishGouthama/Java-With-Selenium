package com.rameshsoftautomation.Files.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropResuable
{
	static Properties props = new Properties();
	String fileName;
	String value;
	
	public PropResuable(String fileName)
	{
		this.fileName = fileName;
	}
	
	public String getProperty(String key) throws IOException
	{
		File file = new File(fileName);
		FileInputStream fip = new FileInputStream(file);
		props.load(fip);
		value = props.getProperty(key);
		return value;		
	}
	
	public void setProperty(String key , String value) throws IOException
	{
		File file = new File(fileName);
		FileInputStream fip = new FileInputStream(file);
		props.load(fip);
		props.setProperty(key, value);
		props.store(new FileOutputStream(fileName), null);
	}
	
	public void removeProperty(String key) throws IOException
	{
		File file = new File(fileName);
		FileInputStream fip = new FileInputStream(file);
		props.load(fip);
		props.remove(key);
		props.store(new FileOutputStream(fileName), null);
	}
}
