package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;
public class CreateCourse {	
	public static void main(String[] args) {	
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
										addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetails.class)
										.addAnnotatedClass(Course.class)
										.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		int id = 3;
		Instructor instructor = session.get(Instructor.class, id);
		
		//create courses
		Course c1 = new Course("Core Java");
		Course c2 = new Course("Web Based Java");
		
		instructor.add(c1);
		instructor.add(c2);
		
		session.save(c1);
		session.save(c2);
		
		session.getTransaction().commit();
		
		
		
	}

}
