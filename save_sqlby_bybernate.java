package hybernate.com.tut1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{     
    public static void main( String[] args )
    {
    	
        System.out.println( "project started " ); 
        
        Configuration cfg=new Configuration();
         cfg.configure("hibernate.cfg.xml");
         SessionFactory sft=cfg.buildSessionFactory();
         
         // object for address
         address o2=new address();
           o2.setCity("jaunpur"); o2.setStreet("ashapur"); o2.setIsopen(true);
           o2.setImage(null); o2.setAddeded(new Date()); o2.setX(1234);
         
        // object for alein 
        alein o1=new alein();
           o1.setId(3); o1.setName("lhubham");
           o1.setAge(24);
           
           // start saving data through object  
           // use session class
            Session session= sft.openSession();
            session.beginTransaction();
            session.save(o1); session.save(o2);
            session.getTransaction().commit();
            
          System.out.println("project completed");
          session.close();
    }
}
