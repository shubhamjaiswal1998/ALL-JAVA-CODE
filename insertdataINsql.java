//package com.apps;

import java.sql.*;

public class insertdataINsql {

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
		    
		 // 3.create statement object & sent query for insert //////////////////////
		   
		    stetement =connection.createStatement();
 String sqlSelectQuery= "insert into wscube.wsuser values(13,'ajay','lgu@123gmail.com',46,1)";
		     int rowaffected=stetement.executeUpdate(sqlSelectQuery);
		     System.out.println("no of row affected "+rowaffected);
		
		//4. close resource;////////////////////////////////////////////////////
			connection.close();
			stetement.close();
			}

}

    

