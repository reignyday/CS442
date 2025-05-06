package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
public class AITrack implements TrackCheck {
	//what about cs517
	ArrayList<String> aiElectiveSet = new ArrayList<String>(Arrays.asList("CS515", "CS524", "CS535", "CS555", "CS556", "CS580E", "CS580P"));

	public boolean check(ArrayList<String> list) {
		if(list.contains("CS536") && list.contains("CS565")) {
			ArrayList<String> donecourses = (ArrayList<String>) list.clone();
			donecourses.retainAll(aiElectiveSet);
			if(donecourses.size() > 1) {
				return true;
			}
		}
		return false;
	}
}