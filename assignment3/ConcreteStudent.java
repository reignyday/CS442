package assignment3;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteStudent extends AbstractStudent {
	private String university;
	public ConcreteStudent(Person p) {
		super(p);
	}
	@Override
	public String getUniversity() {
		return university;
	}
	@Override
	public void setUniversity(String university) {
		this.university = university;
	}
	@Override
	public String getCourses() {
		return "Current courses: \n";
	}
	@Override
	public List<String> getCourseList() {
		return new ArrayList<>();
	}
	// TODO
	// implement any other missing method(s) in AbstractStudent
	// even if they just return true or false
	@Override
	public boolean timeConflict(LocalTime time) {
		// TODO Auto-generated method stub
		return false;
	}
}
