package assignment3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CS310 extends CourseDecorator {
	public CS310(AbstractStudent s) {
		//super constructor of parent class
		super(s, "CS", "310", "Data Structures & Algorithms", 4, "01", 
				LocalTime.of(9,40), LocalTime.of(10, 40));
	}
}
