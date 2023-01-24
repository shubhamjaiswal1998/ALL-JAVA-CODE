
import java.sql.*;

public class Getsql_data {

	public static void main(String[] args)  {
		
		Connection connection=null;
		Statement stetement=null;
		 ResultSet resultset=null;
		try {
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
		    
		    // 3.create statement object & sent query /////////////////////////////////////////////////
		     String sqlSelectQuery= "select id,name,email,age from wscube.wsuser";
		     
		     stetement =connection.createStatement();
		    System.out.println("implement class name is "+stetement.getClass().getName());
		    
		    resultset= stetement.executeQuery(sqlSelectQuery);
		    System.out.println("implement class name is "+ resultset.getClass().getName());
		    
		    //4. process the resultset/////////////////////////////////////////////////////
		    System.out.println("id and name and email");
		    while(resultset.next()) {
		    	  Integer id=resultset.getInt(1);
		    	  String name=resultset.getString(2);
		    	  String email=resultset.getString(3);
		    	  Integer age=resultset.getInt(4);
		    	  System.out.println(id+"\t"+name+"\t"+email+"\t"+age);
		    }
		    
		}
		catch(ClassNotFoundException | SQLException ce) {
			
			ce.printStackTrace();
		}
		catch(Exception ce) {
			ce.printStackTrace();
		}
		finally{
			// close resource;//////////////////////
			if(connection!=null){
				try {
					connection.close();
					System.out.println("connection close");
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
			}
		}
		 
	}

}
