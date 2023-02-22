package jdbcscrollable.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class getutilclass {

	public getutilclass() {
		
		
	}
	// make 3 method
	//1 load regester
	 static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}
		 catch(Exception ce) {
			 ce.printStackTrace();
		 }
		 }
	//2. make connection 
	public static Connection getconnection() throws SQLException,IOException {
		
FileInputStream fileloc=new FileInputStream("C:\\Users\\SHUBHAM\\eclipse-workspace\\jdbcscrollable\\application.properties");
			
	Properties p=new Properties();
			
	p.load(fileloc);
	// rule connection= DriverManager.getConnection(url, name, passwaord); return connection
Connection connection=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			
		           return connection;
	      }
	//2.for close resourse
		public static  void cleanup(Connection con, Statement stmt, ResultSet res ) throws SQLException {
		
		     if(con!=null) {
		    	 con.close();
		     }
		     if(stmt!=null) {
		    	 stmt.close();
		     }
		     if(res!=null) {
		    	 res.close();
		     }
		}

	
	
	
}
