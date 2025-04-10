package com.rameshsoft.automation.JDBCdatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLDBTesting2 {
    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.cj.jdbc.Driver";

        String dbName = "Testing";

        try {
            // Load JDBC driver
            Class.forName(driver);

            // Establish database connection
            con = DriverManager.getConnection(url + dbName, "root", "root");
            System.out.println("Database connection is opened");

            // Create statement object
            stmt = con.createStatement();

            // Create table
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student_info (sid INT, sname VARCHAR(10), marks INT)");
            System.out.println("Table student_info is created successfully");

            // Insert data into the table
            stmt.executeUpdate("INSERT INTO student_info (sid, sname, marks) VALUES (001, 'Ramesh', 950)");
            stmt.executeUpdate("INSERT INTO student_info (sid, sname, marks) VALUES (002, 'Kumar', 850)");

            // Execute SELECT query and display results
            ResultSet rSet = stmt.executeQuery("SELECT * FROM student_info");
            while (rSet.next()) {
                System.out.println(rSet.getInt(1) + "------" + rSet.getString(2) + "-------" + rSet.getInt(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if ((con != null) && (!con.isClosed())) {
                    con.close();
                    System.out.println("Database connection is closed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}





/*package com.rameshsoft.automation.JDBCdatabases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLDBTesting2 {
public static void main(String[] args) {
	
	Connection con = null;
	Statement stmt = null;
	
	String url = "jdbc:mysql://localhost:3306/";
	String driver = "com.mysql.cj.jdbc.Driver";
	
	String dBname = "Testing";
	
	try {
		Class.forName(driver);
		
		con = DriverManager.getConnection(url + dBname , "root" , "root");
		System.out.println("Database connection is opened");
		stmt = con.createStatement();
		
		int x = stmt.executeUpdate("create table student_info(sid int , sname varchar(10) , marks int)");
		
		
		if(x == 1)
		{
			System.out.println("table student_info is created");
		}
		
		stmt.executeUpdate("insert into student_info values(001 , 'Ramesh' , 950)");
		stmt.executeUpdate("insert into student_info values(002 , 'Kumar' , 850)");
		
		ResultSet rSet = stmt.executeQuery("select * from student_info");
		
		while(rSet.next())
		{
			System.out.println(rSet.getInt(1) + "------" + rSet.getString(2) + "-------" + rSet.getInt(3));
		}
	}catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if((con!=null) && (!con.isClosed())){
				con.close();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
*/