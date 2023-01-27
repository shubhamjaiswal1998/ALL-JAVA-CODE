import java.util.Properties;
import java.io.*;
public class getDataFromTXTfile {
     
  
public static void main(String[] args) throws FileNotFoundException,IOException  {
        FileInputStream fis=new FileInputStream("C:\\Users\\SHUBHAM\\eclipse-workspace\\com.app\\application.properties");
        Properties properties=new Properties();
           properties.load(fis);

           String url =properties.getProperty("url");
		    String username =properties.getProperty("username");
		    String password =properties.getProperty("password");
            System.out.println(url);
            System.out.println(username);
            System.out.println(password);
              
    }
    
}
