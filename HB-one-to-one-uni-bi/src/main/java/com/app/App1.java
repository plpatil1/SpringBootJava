package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public class App1 
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
       //1. Save Instructordetails
    
		/*
		 * Instructor instructor = new Instructor("Prasad", "Patil",
		 * "prasad@gmail.com");
		 *  InstructorDetails instructorDetails = new
		 * InstructorDetails("Sb.com", "Football", instructor);
		 * instructor.setInstructorDetails(instructorDetails);
		 * session.persist(instructorDetails);
		 */
       
       //2. Update Instructor_details
       System.out.println("Enter InstructorDetails ID = ");
       int id = s.nextInt();
       InstructorDetails instructorDetails =  session.get(InstructorDetails.class, id);
       instructorDetails.setHobby("Baseball");
       instructorDetails.getInstructor().setEmail("prasad123@gmail.com");
       session.merge(instructorDetails);
       
       session.getTransaction().commit();
       
       session.close();
       sessionFactory.close();
       
    }
}
