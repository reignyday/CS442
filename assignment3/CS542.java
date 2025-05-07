package assignment3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CS542 extends CourseDecorator {
	public CS542(AbstractStudent s) {
		//super constructor of parent class
		super(s, "CS", "542", "Design Patterns", 3, "02", 
				LocalTime.of(13,10), LocalTime.of(14, 10));
	}
}