package com.hiber.HibernateRelationalAnnotation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hiber.HibernateRelationalAnnotation.PlainClass.Address;
import com.hiber.HibernateRelationalAnnotation.model.Courses;
import com.hiber.HibernateRelationalAnnotation.model.Doctor;
import com.hiber.HibernateRelationalAnnotation.model.Patient;
import com.hiber.HibernateRelationalAnnotation.model.Student;
import com.hiber.HibernateRelationalAnnotation.model.Students;
import com.hiber.HibernateRelationalAnnotation.model.Teacher;

public class App 
{
    public static void main( String[] args )
    {
    	/* ------------------- One to One Relationship ------------------------------*/
        /*Doctor d = new Doctor();
        
        d.setDid(101);
        d.setName("Dr.Mehta");
        d.setEmail("mehta@gmail.com");
        d.setDesignation("Dentist");
        
        Patient p = new Patient();
        p.setPid(202);
        p.setName("Ravan");
        p.setEmail("ravan@gmail.com");
        p.setD(d);
        
        d.setP(p);*/
    	
    	/* ---------------------- One to Many / Many to One -----------------------------*/
    	/*Address a = new Address();
    	a.setPinCode(413304);
    	a.setCity("Pune");
    	a.setState("Maharashtra");
    	a.setCountry("India");
    	
    	Teacher t = new Teacher();
    	t.setTid(1001);
    	t.setTname("Vaibhav Sir");
    	t.setTemail("vaibhav@gmail.com");
    	t.setTphone("0123456789");
    	t.setA(a);
    	
    	Student s = new Student();
    	s.setSid(2001);
    	s.setSname("Tejas");
    	s.setEmail("tejas@gmail.com");
    	s.setPhone("0123456789");
    	s.setT(t);
    	
    	Student s1 = new Student();
    	s1.setSid(2002);
    	s1.setSname("Yash");
    	s1.setEmail("yash@gmail.com");
    	s1.setPhone("0123456789");
    	s1.setT(t);
    	
    	Student s2 = new Student();
    	s2.setSid(2003);
    	s2.setSname("Pravin");
    	s2.setEmail("pravin@gmail.com");
    	s2.setPhone("0123456789");
    	s2.setT(t);
    	
    	Student s3 = new Student();
    	s3.setSid(2004);
    	s3.setSname("Ranveer");
    	s3.setEmail("ranveer@gmail.com");
    	s3.setPhone("0123456789");
    	s3.setT(t);
    	
    	List<Student> list = new ArrayList<Student>();
    	list.add(s);
    	list.add(s1);
    	list.add(s2);
    	list.add(s3);
    	
    	t.setStudList(list);*/
    	
    	/* ---------------------- Many to Many -----------------------------*/
        Students s1 = new Students();
        s1.setId(101);
        s1.setName("Tejas");
        s1.setEmail("tejas@gmail.com");
        s1.setPhone("0123456789");
        
        
        Students s2 = new Students();
        s2.setId(102);
        s2.setName("Yash");
        s2.setEmail("yash@gmail.com");
        s2.setPhone("0123456789");
        
        Students s3 = new Students();
        s3.setId(103);
        s3.setName("Pravin");
        s3.setEmail("pravin@gmail.com");
        s3.setPhone("0123456789");
        
        
        Students s4 = new Students();
        s4.setId(104);
        s4.setName("Ranveer");
        s4.setEmail("ranveer@gmail.com");
        s4.setPhone("0123456789");
        
        
        Courses c1 = new Courses();
        c1.setId(111);
        c1.setCourseName("Jave");
        
        Courses c2 = new Courses();
        c2.setId(222);
        c2.setCourseName("Jave");
        
        Courses c3 = new Courses();
        c3.setId(333);
        c3.setCourseName("Jave");
        
        Courses c4 = new Courses();
        c4.setId(444);
        c4.setCourseName("Jave");
        
        List<Students> sList = new ArrayList<Students>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
        
        List<Courses> cList = new ArrayList<Courses>();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        cList.add(c4);
        
        s1.setList(cList);
        s2.setList(cList);
        s3.setList(cList);
        s4.setList(cList);
        
        c1.setList(sList);
        c2.setList(sList);
        c3.setList(sList);
        c4.setList(sList);
        
        
        Configuration con = new Configuration().configure("/com/hiber/HibernateRelationalAnnotation/config/hibernate.cfg.xml");
        
        SessionFactory sessionFactory = con.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        //---------- One to One ----------------
        //session.save(d);
        //session.save(p);
        
        // ---------- One to Many / Many to One
        
        /*session.save(t);
        session.save(s);
        session.save(s1);
        session.save(s2);
        session.save(s3);*/
        
        // ---------- Many to Many --------------
        session.save(s1);
        session.save(s2);
        session.save(s3);
        session.save(s4);
        
        session.save(c1);
        session.save(c2);
        session.save(c3);
        session.save(c4);
        
        
        session.getTransaction().commit();
        System.out.print("Record Saved");
        
        session.close();
        sessionFactory.close();
    }
}
