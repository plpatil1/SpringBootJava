package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner s = new Scanner(System.in);
       SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
    		   							.addAnnotatedClass(Instructor.class)
    		   							.addAnnotatedClass(InstructorDetails.class)
    		   							.buildSessionFactory();
       
       Session session = sessionFactory.openSession();
       
       session.beginTransaction();
       //1. Save Instructor
     /*  Instructor instructor = new Instructor();
       InstructorDetails instructorDetails = new InstructorDetails();
       instructor.setFirstName("Rahul");
       instructor.setLastName("Pawar");
       instructor.setEmail("rahul@gmail.com");
       instructorDetails.setYoutube_channel("javapoint.com");
       instructorDetails.setHobby("Reading");
       instructor.setInstructorDetails(instructorDetails);*/
     
		/*
		 * InstructorDetails instructorDetails = 
		 *	new InstructorDetails("springpoint.com", "Singing");
		 *  Instructor instructor =
		 *   new Instructor("Priyanka","Patil","priyanka@gmail.com",instructorDetails);
		 * session.persist(instructor);
		 */
		 
       
       
       //2. Get Instructor and its details on basis of Id
		/*
		 * System.out.println("Enter Instructor ID = ");
		 *  int id = s.nextInt();
		 * Instructor instructor = session.get(Instructor.class, id);
		 * System.out.println(instructor);
		 */
       
       //3. Update the Instructor
		/*
		 * System.out.println("Enter Instructor ID = "); 
		 * int id = s.nextInt();
		 * Instructor instructor = session.get(Instructor.class, id);
		 * instructor.setEmail("rahul123@gmail.com");
		 * instructor.getInstructorDetails().setYoutube_channel("microservices.com");
		 * Instructor i = session.merge(instructor); 
		 * System.out.println("i = "+i);
		 */
       
       //4. Delete the Instructor and its details
		/*
		 * System.out.println("Enter Instructor ID = "); 
		 * int id = s.nextInt();
		 * Instructor instructor = session.get(Instructor.class, id);
		 * session.remove(instructor);
		 */
       
		
		  List<Instructor> l = session.createQuery("from Instructor").list();
		  Predicate<Instructor> p = x -> x.getInstructorDetails()
				  .getHobby().equals("Singing");
		  
		  
		  l.forEach(x -> {
		  if(p.test(x))
		  {
		  System.out.println(x);
		  }});
		 
		  
		 
       
       session.getTransaction().commit();
       
       session.close();
       sessionFactory.close();
       
    }
}
