package assignment3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CS442 extends CourseDecorator {
	public CS442(AbstractStudent s) {
		//super constructor of parent class
		super(s, "CS", "442", "Design Patterns", 4, "01", 
				LocalTime.of(13,10), LocalTime.of(14, 10));
	}
}
