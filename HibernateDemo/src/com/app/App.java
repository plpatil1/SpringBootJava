package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;

public class App {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//1. Create SessionFactory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		//2. Create Session
		Session session = factory.openSession();
		//3. Begin Transaction
		session.beginTransaction();
		/*
		 * //4. Save the Entity Student s = new Student(); s.setFirstName("Priyanka");
		 * s.setLastName("Patel"); s.setEmail("Patel@gmail.com"); session.save(s);
		 */
		
		//get Entity on basis of id
		/*
		 * int id; 
		 * System.err.println("Enter Student ID = ");
		 *  id = s.nextInt();
		 * Student student = session.get(Student.class, id);
		 * System.out.println(student);
		 */
		
		//update Entity on basis of id
		/*
		 * int id; System.err.println("Enter Student ID = "); 
		 * id = s.nextInt();
		 * Student student = session.get(Student.class, id);
		 * System.out.println(student);
		 * student.setEmail("abc123@gmail.com");
		 */
		//session.update(student);
		
		
		//delete Student
		/* int id;
		 * System.err.println("Enter Student ID = "); 
		 * id = s.nextInt();
		 * Student student = session.get(Student.class, id);
		 * session.delete(student);
		 */
		
		//list of students
			Query query = session.createQuery("from Student where lastName = :name");
			query.setParameter("name", "Pawar");
			List<Student> l = query.list();
			l.forEach(x -> System.out.println(x));
			

		//5. Commit 
		session.getTransaction().commit();
		//6. close the Session
		session.close();
		//7. close the SessionFactory
		factory.close();
	}

}
