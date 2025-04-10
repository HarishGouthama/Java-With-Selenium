package com.rameshsoft.automation.JDBCdatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLDBTesting1 {
public static void main(String[] args) {
	
	Connection con = null;
	Statement stmt;
	
	String url = "jdbc.mysql://localhost:3306/";
	String driver = "com.mysql.jdbc.Driver";
	
	String uname = "root";
	String pwd = "Shutle@1234";
	
	try {
		Class.forName(driver).newInstance();
		con = DriverManager.getConnection(url,uname,pwd);
		System.out.println("Connection is opened");
		stmt = con.createStatement();
		
		ResultSet useDb = stmt.executeQuery("use db");
		ResultSet rSet = stmt.executeQuery("select * from offices");
		
		while(rSet.next())
		{
			System.out.println(rSet.getString(1) + "------" + rSet.getString(2) + "-------" + rSet.getInt(3));
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if((con != null) && (!con.isClosed()))
				con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
