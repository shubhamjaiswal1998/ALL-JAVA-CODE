package hybernate.com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
  System.out.println( "project started " ); 
        
        Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory sft=cfg.buildSessionFactory();
         
         // object for address
         address o2=new address();
           o2.setCity("1jkaunpur"); o2.setStreet("a1sjhapur"); o2.setIsopen(true);
            o2.setAddeded(new Date()); o2.setX(1234);
           
           // insert img also to this 
           
           FileInputStream fis=new FileInputStream("C:\\Users\\SHUBHAM\\eclipse-workspace\\hibernate\\src\\main\\java\\Screenshot (7173).png");
           
               byte[] data=new byte[fis.available()];
               
                 fis.read(data);
                 
               o2.setImage(data);
               
           
         // object for alein 
        alein o1=new alein();
           o1.setId(4); o1.setName("ooohubham");
           o1.setAge(24);
           
           // start saving data through object  
           // use session class
            Session session= sft.openSession();
            session.beginTransaction();
            session.save(o1);
            session.save(o2);
            session.getTransaction().commit();
            
          System.out.println("project completed");
          session.close();
    }
}
