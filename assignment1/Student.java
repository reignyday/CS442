package assignment1;

import java.util.ArrayList;
	public class Student {
	private TrackCheck trackCheck;
	private String bnumber;
	private String name;
	private ArrayList<String> courses;
	public Student(String bnum, String nameIn) {
		bnumber = bnum;
		name = nameIn;
		courses = new ArrayList<>();
	}
	public void setTrack(TrackCheck trackIn) {
		trackCheck = trackIn;
	}
	public void add(String course) {
		courses.add(course);
	}
	public boolean checkTrack() {
		return trackCheck.check(courses);
	}
	@Override
	public String toString() {
		return name + " (" + bnumber + "): " + courses;
	} 
}
