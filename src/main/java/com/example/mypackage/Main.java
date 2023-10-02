package com.example.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.studentManagement.entity.Course;
import com.example.studentManagement.entity.Gender;
import com.example.studentManagement.entity.Instructor;
import com.example.studentManagement.entity.Student;
import com.example.studentMgmt.crudUtil.ExampleCRUD;
import com.example.util.DateUtil;
import com.example.util.HibernateUtil;
 

public class Main {
	public static void main(String[] args) {
		createStudent ();
		createInstructor ();
		createCourse();
 
	}

	public static void createStudent () {


		String []  email = {"jim.doe@india.com", "sandy.smith@india.com", 

				"jonny_parker@india.com", "tonny.davison@india.com", "pete.jonson@india.com"};
		String []  firstNames = {"Jim", "Sandy", 

				"Jonny", "Tonny", "Pete"};

		String []  lastNames =   {"Doe", "Smith", 

				"Parker", "Davison", "Pete"};
		
		for (int i = 0; i < firstNames.length; i++) {
			Student student = new Student(firstNames [i], lastNames [i], 
					email[i]);
			student.setGender(Gender.MALE);
			student.setDateOfBirth(DateUtil.getDateIndianFormat("25-02-2001"));
			ExampleCRUD.crateStudent(student);
		}

	}
	
	
	public static void createInstructor () {

		String []  email = {"hary.jonathon@usa.com", "mathew.anderson@usa.com", 

				"stanley_williams@usa.com"};
		String []  firstNames = {"Hary", "Mathew", 

				  "Stanley" };

		String []  lastNames =   {"jonathon", "Anderson", 

				"Williams" };
		
		for (int i = 0; i < firstNames.length; i++) {
			Instructor instr = new Instructor(firstNames [i], lastNames [i], 
					email[i]);
			ExampleCRUD.crateInstructor(instr);
		}
		 
	}
	
	public static void createCourse () {

		String []  courseTitle = {"Angular", "Spring", 

				"React"};
		int []  courseCredit = {4,3,2};	 
		
		for (int i = 0; i < courseTitle.length; i++) {
			Course crs = new Course(courseTitle [i], courseCredit [i]);	 
			ExampleCRUD.crateCourset(crs);
		}

	}
}

