package com.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Student;

public class AddCoursesForStudentDemo {
	
	
public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		//get the student rohini from the database
		int id = 2;
		Student student = session.get(Student.class, id);
		
		System.out.println("Student Loaded = "+student);
		System.out.println("Courses = "+student.getCourses());
		
		
		//create more courses
		Course course1 = new Course("React");
		Course course2 = new Course("Javascript");
		
		//add student to the courses
		student.add(course1);
		student.add(course2);
		
		//save the courses
		session.save(course1);
		session.save(course2);
		
		//commit the transcation
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
		
}

}
