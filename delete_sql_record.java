//package com.apps;

import java.sql.*;

public class delete_sql_record
  {

	public static void main(String[] args)throws SQLException, ClassNotFoundException  {
		
		Connection connection=null;
		Statement stetement=null;
	
		
	    //1. load register
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("driver loaded sucessfully");
		 
		 //2. make connection /////////////////////////////////////////////////////
		    String url ="jdbc:mysql://localhost:3306/wscube";
		    String username ="root";
		    String password ="Shubham1998@";
		    connection= DriverManager.getConnection(url,username, password);
		    System.out.println("connection establish sucessfully");
		    System.out.println("implement class name is "+connection.getClass().getName());
		    
		 // 3.create statement object & sent query for delete //////////////////////
		   
		    stetement =connection.createStatement();
		     String sqlSelectQuery= "delete from wscube.wsuser where id=9";
		     int rowaffected=stetement.executeUpdate(sqlSelectQuery);
		     System.out.println("no of row affected "+rowaffected);
		
		//4. close resource;////////////////////////////////////////////////////
			connection.close();
			stetement.close();
			}

}
