package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Student;

public class CreateStudentAndCourseDemo {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		/*
		 * //create a course Course course = new Course("Master in Java");
		 * 
		 * //save the course System.out.println("Saving Course.....");
		 * session.save(course); System.out.println("Saved the course : "+course);
		 * 
		 * //create the students Student student1 = new Student("Rahul", "Pawar",
		 * "rahul@gmail.com"); Student student2 = new Student("Rohini", "Patil",
		 * "rohini@gmail.com");
		 * 
		 * course.add(student1); course.add(student2);
		 * 
		 * //save the students System.out.println("Saving students.....");
		 * session.save(student1); session.save(student2);
		 * System.out.println("Saved the students : "+course.getStudent());
		 */
		
		
				//create a Student
				Student student = new Student("Aishwarya", "Deo", "aish@gmail.com");	
				
				//save the course
				System.out.println("Saving student.....");
				session.persist(student);
				System.out.println("Saved the course : "+student);
				
				//create the students
				Course course1 = new Course("Spring Framework");
				Course course2 = new Course("Hibernate Framework");
				
				course1.add(student);
				course2.add(student);
				
				//save the students
				System.out.println("Saving students.....");
				session.persist(course1);
				session.persist(course2);
				System.out.println("Saved the students : "+student.getCourses());
		
				session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
