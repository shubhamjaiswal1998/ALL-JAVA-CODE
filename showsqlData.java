publi// package for  com.util.jdbcutil///////////////////////
package com.util;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


// package for  testapp////////////////////
package com.apps;
import java.sql.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
// imported package com.util & class jdbcutil=>com.util.jdbcutil;
import com.util.jdbcutil;

public class jdbcutil {
	private jdbcutil() {
		
		
	}
	static {
		  try {
			//1. load register
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("driver loaded sucessfully");
			}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	
	public static Connection getjdbcConnection() throws SQLException, IOException {
		
		      FileInputStream fis=new FileInputStream("C:\\Users\\SHUBHAM\\eclipse-workspace"
		      		+ "\\com.app\\application.properties");
		      
		      Properties properties=new Properties();
		      properties.load(fis);   
		      
		Connection connection= DriverManager.getConnection(properties.getProperty("url"),
			    		     properties.getProperty("username"),properties.getProperty("password") );
		 
			    System.out.println("connection establish sucessfully");
			
			    return connection;
		
		  /*String url ="jdbc:mysql://localhost:3306/wscube";   OR LIKETHIS
		    String username ="root";
		    String password ="Shubham1998@";
		    Connection   connection= DriverManager.getConnection(url,username, password);
		    System.out.println("connection establish sucessfully");
		
		    return connection;*/
	}

	public static void cleanUp(Connection connection,Statement statement,ResultSet resultset  )throws SQLException {
		if(connection!=null) {
			connection.close();
		}
		
		if(statement!=null) {
			statement.close();
		}
		if(resultset!=null) {
			resultset.close();
		}
	}

	
	}



public class testapp {

	public static void main(String[] args)  {
		Connection   connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		    try {
		    	connection=jdbcutil.getjdbcConnection();
		    	 if(connection!=null)
		    		 statement=connection.createStatement();
		    	 if(statement!=null)
		    		 resultset =statement.executeQuery("select id,name,email,age from wscube.wsuser");
		    	 
		    	  if(resultset!=null) {
		    		  System.out.println("showing sql data");
		    		  System.out.printf("%s%10s%15s%15s","userid","name","email","age");
		    		  System.out.println();
		    		  while(resultset.next()) {
		    			/*  Integer id=resultset.getInt(1);
				    	  String name=resultset.getString(2);
				    	  String email=resultset.getString(3); or
				    	  Integer age=resultset.getInt(4);*/
				    	  System.out.printf("%d%15s%20s%10d",resultset.getInt(1),resultset.getString(2),
				    			  resultset.getString(3),resultset.getInt(4));
				    	  System.out.println();
		    		  }
		    	  }
		    }
		    catch(SQLException ce) {
		    	ce.printStackTrace();
		    }
		    catch(Exception ce) {
		    	ce.printStackTrace();
		    }
		    finally {
		    	  try {
		    		  System.out.println("close resourse");
					jdbcutil.cleanUp(connection, statement, resultset);
		    	  }catch(SQLException ce) {
		    		  ce.printStackTrace();
		    	  }
		    }
		
			

}}c class showsqlData {
    
}
