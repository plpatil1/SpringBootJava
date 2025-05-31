package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Student;

public class StudentDAO {
	
	/*
	 * public static int saveStudent(Student s) { SessionFactory factory = null;
	 * Session session = null; try { factory = new
	 * Configuration().configure("hibernate.cfg.xml")
	 * .addAnnotatedClass(Student.class) .buildSessionFactory(); session =
	 * factory.openSession(); session.beginTransaction(); int id =(int)
	 * session.save(s);
	 * 
	 * session.getTransaction().commit(); return id; } catch (Exception e) {
	 * e.printStackTrace(); return 0; } finally {
	 * 
	 * session.close(); factory.close();
	 * 
	 * } }
	 */
	
	public static int saveStudent(Student s)
	{
		SessionFactory factory = null;
		Session session = null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		session = factory.openSession();
		session.beginTransaction();
		session.persist(s);
	
		session.getTransaction().commit();
		return 1;
		}
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			
			session.close();
			factory.close();
			
		}		
	}

}
