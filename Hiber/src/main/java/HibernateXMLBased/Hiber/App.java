package HibernateXMLBased.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateXMLBased.Hiber.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s1 = new Student();
        
        s1.setId(103);
        s1.setName("Pravin");
        s1.setEmail("pravin@gmail.com");
        s1.setPassword("Pravin123");
        
        Configuration con = new Configuration();
        con.configure("/HibernateXMLBased/Hiber/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = con.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        session.save(s1);
        
        session.beginTransaction().commit();
    }
}
