package com.app.dao;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Student;

public class Demo {
	
public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		/*
		 * //get the student from the database int id = 1; Student student =
		 * session.get(Student.class, id);
		 * 
		 * System.out.println("Student Loaded = "+student);
		 * System.out.println("Courses = "+student.getCourses());
		 * 
		 * 
		 * //get the course Spring Framework from the database int cId = 2; Course
		 * course = session.get(Course.class, cId);
		 * System.out.println("Course Loaded = "+course);
		 * System.out.println("Student = "+course.getStudent());
		 * 
		 * course.add(student);
		 */
		
				//get the student from the database
				int id = 3;
				Student student = session.get(Student.class, id);
				
				System.out.println("Student Loaded = "+student);
				System.out.println("Courses = "+student.getCourses());
				
				//get the course Spring Framework from the database
				int cId = 3;
				Course course = session.get(Course.class, cId);
				System.out.println("Course Loaded = "+course);
				System.out.println("Student = "+course.getStudent());
				
				student.add(course);
		
		//commit the transcation
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
		
}

}

/*//class courseTable
studentId
courseId


get(Student,course=3)
{
	//load entire course table
	//if student exists
	//iterate till course associated with student
	return true;
}*/