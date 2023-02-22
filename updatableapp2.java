package jdbcscrollable.com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class updatableapp2 {

	public static void main(String[] args) {

		Connection connection =null;
		Statement stmt=null;
		ResultSet resultset=null;
		
		
		try {
			connection =getutilclass.getconnection();
			 if(connection!=null)
			  stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		    	
			 String sqlquery="select id, name,age,salary from wscube.wsuser1";  
			   if(stmt!=null)
			 resultset= stmt.executeQuery(sqlquery);
			   // this process do for print the data
			  if(resultset!=null)
			    	  System.out.println("move in forword direction ");
			  
             while(resultset.next()) {
            	 
   System.out.print(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getInt(3)+"\t"+resultset.getInt(4));
            	System.out.println(); 
             }
             System.out.println("after updation in database ");
             resultset.beforeFirst();// by this cursor will reached at first row agi
                while(resultset.next()) {
                	
                	 int orginalsalary=resultset.getInt(4);
                	 if(orginalsalary<4000) {
                		int salincre=orginalsalary+1000;
                		
                		 resultset.updateInt(4, salincre);
                		 resultset.updateRow();
                	 }
                	}
             
             resultset.beforeFirst();// then again cursor reach at first row
             
             while(resultset.next()) {
            	 resultset.refreshRow();
            	   System.out.print(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getInt(3)+"\t"+resultset.getInt(4));
            	            	System.out.println(); 
            	        }          
           
		}
		catch(IOException | SQLException ce) {
	    	  
	    	  ce.printStackTrace();
	      }
      catch(Exception ce) {
    	  
    	  ce.printStackTrace();
      }
		finally{
			 try {
	    		  System.out.println("close resourse");
	    		  getutilclass.cleanup(connection, stmt, null);
	    		  
			
	    	  }catch(SQLException ce) {
	    		  ce.printStackTrace();
	    	  }
			
		}
		
		}

}
