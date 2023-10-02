package com.example.studentMgmt.crudUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.studentManagement.entity.Course;
import com.example.studentManagement.entity.Employee;
import com.example.studentManagement.entity.Gender;
import com.example.studentManagement.entity.Instructor;
import com.example.studentManagement.entity.Student;
import com.example.util.HibernateUtil;

/**
 * 
 * This class performs CRUD operation on Students using HQL.
 * This is useful when we are not using default CRUD operation 
 * for JPA repository.
 * 
 */
public class ExampleCRUD {
	public static boolean crateEmployee ( Employee  emp) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			// Create 	
			Transaction transaction = session.beginTransaction();
			session.save(emp);
			transaction.commit();
			//System.out.println ("Employee  Created Successfully");
		}

		catch (Exception e) {
			return false;

		}
		finally {
			if (session!=null) session.close();
			//if (sessionFactory!=null) sessionFactory.close();
		}
		return true;
	}
	
	
	

	public static boolean crateStudent ( Student student) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			// Create 
			student.setGender(Gender.MALE);
			Transaction transaction = session.beginTransaction();
			session.save(student);
			transaction.commit();
			System.out.println ("Student Created Successfully");
		}

		catch (Exception e) {
			return false;

		}
		finally {
			if (session!=null) session.close();
			//if (sessionFactory!=null) sessionFactory.close();
		}
		return true;
	}
	
	public static boolean crateInstructor ( Instructor instr) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println("abc4");
		Session session = sessionFactory.openSession();
		System.out.println("abc1");
		try {
			// Create 
			System.out.println("abc");
		 	Transaction transaction = session.beginTransaction();
			session.save(instr);
			System.out.println("abc1"); 
			transaction.commit();
		}

		catch (Exception e) {
			return false;

		}
		finally {
			if (session!=null) session.close();
			//if (sessionFactory!=null) sessionFactory.close();
		}
		return true;
	}

	public static boolean crateCourset(Course crs) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println("abc4");
		Session session = sessionFactory.openSession();
		System.out.println("abc1");
		try {
			// Create 
			System.out.println("abc");
		 	Transaction transaction = session.beginTransaction();
			session.save(crs);
			System.out.println("abc1"); 
			transaction.commit();
		}

		catch (Exception e) {
			return false;

		}
		finally {
			if (session!=null) session.close();
			//if (sessionFactory!=null) sessionFactory.close();
		}
		return true;
	}

	public static void main(String[] args) {
		
//		Employee emp = new Employee();
//		emp.setName("Pranoti");
//		crateEmployee(emp);
		
		for (int i = 0; i < 3; i++) {
			Employee emp = new Employee();
			emp.setName("John-" +i);
			emp.setSalary(20000);
			crateEmployee(emp);
		}
	}
}

 
