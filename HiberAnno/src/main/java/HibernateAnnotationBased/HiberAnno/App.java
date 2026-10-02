package HibernateAnnotationBased.HiberAnno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateAnnotationBased.HiberAnno.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        
        Employee e1 = new Employee();
        e1.setId(101);
        e1.setName("Tejas");
        e1.setEmial("tejas@gmail.com");
        e1.setPassword("Tejas123");
        
        Configuration con = new Configuration();
        con.configure("/HibernateAnnotationBased/HiberAnno/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = con.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        session.save(e1);
        
        session.beginTransaction().commit();
    }
}
