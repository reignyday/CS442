package assignment3;

import java.time.LocalTime;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Larry Lee", "January 1st, 1998");
		AbstractStudent s = new	ConcreteStudent(p);
		p.setStreetAddress("4400 Vestal Parkway East");
		p.setCity("Vestal");
		p.setStateAndZip("New York, 13850");
		p.setCountry("USA");
		System.out.println("Person: " + p.getName());
		System.out.println("Address: " + p.getStreetAddress() + ", " + p.getCity() + ", " + p.getStateAndZip() + ", " + p.getCountry());
		System.out.println("Person: " + p.getName());
		
		s.setUniversity("Binghamton University");
		s.setMajor("Computer Science");
		System.out.println("University: " + s.getUniversity());
		System.out.println("Major: " + s.getMajor());
		
		System.out.println(s.getCourses());
		List<String> courselist = s.getCourseList();
		System.out.println("Current Course List: ");
		
		for(String c: courselist) {
			System.out.println(c);
		}
		
		LocalTime cs442startTime = LocalTime.of(13, 10, 0);
		if(s.timeConflict(cs442startTime)) {
			System.out.println("Cannot add CS442 due to time conflict.");
		}
		else {
			System.out.println("Adding CS442...");
			s = new CS442(s);
		}

		System.out.println(s.getCourses());
		
		courselist = s.getCourseList();
		System.out.println("Current Course List: ");
		
		for(String c: courselist) {
			System.out.println(c);
		}
	
		LocalTime cs542startTime = LocalTime.of(13, 10, 0);
		if(s.timeConflict(cs542startTime)) {
			System.out.println("Cannot add CS542 due to time conflict.");
		}
		else {
			System.out.println("Adding CS542...");
			s = new CS542(s);
		}

		courselist = s.getCourseList();
		
		System.out.println(s.getCourses());
		System.out.println("Current Course List: ");
		
		for(String c: courselist) {
			System.out.println(c);
		}
		
		LocalTime cs310startTime = LocalTime.of(9, 40, 0);
		if(s.timeConflict(cs310startTime)) {
			System.out.println("Cannot add CS310 due to time conflict.");
		}
		else {
			System.out.println("Adding CS310...");
			s = new CS310(s);
		}
		
		System.out.println(s.getCourses());
		
		courselist = s.getCourseList();
		
		System.out.println("Current Course List: ");
		
		for(String c: courselist) {
			System.out.println(c);
		}
	}

}
