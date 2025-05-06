package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
public class CyberTrack implements TrackCheck {
	ArrayList<String> cyberElectiveSet = new ArrayList<String>(Arrays.asList("CS527", "CS528", "CS536", "CS553X", "CS580A", "CS580E", "CS580T", "CS680P"));

	public boolean check(ArrayList<String> list) {
		if(list.contains("CS558") && list.contains("CS559")) {
			ArrayList<String> donecourses = (ArrayList<String>) list.clone();
			donecourses.retainAll(cyberElectiveSet);
			if(donecourses.size() == 2) {
				if(donecourses.contains("CS536") && list.contains("CS580E")) {
					return false;
				}
				else {
					return true;
				}
			}
			else if (donecourses.size() > 2) {
				return true;
			}
		}
		return false;
	}
}

