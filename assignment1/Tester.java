package assignment1;

public class Tester {

	public static void main(String[] args) {
		Student student1 = new Student("B00123456", "FirstOne LastOne");
		Student student2 = new Student("B00123457", "FirstTwo LastTwo");
		Student student3 = new Student("B00123458", "FirstThree LastThree");
		Student student4 = new Student("B00123459", "FirstFour LastFour");
		Student student5 = new Student("B00123460", "FirstFive LastFive");
		student1.add("CS551");
		student1.add("CS571");
		student1.add("CS575");
		student1.add("CS540");
		student1.add("CS536");
		student1.add("CS515");
		student1.add("CS557");
		student1.add("CS565");

		student2.add("CS551");
		student2.add("CS571");
		student2.add("CS575");
		student2.add("CS540");
		student2.add("CS536");
		student2.add("CS565");
		student2.add("CS515");
		student2.add("CS558");
		student2.add("CS556");

		student3.add("CS551");
		student3.add("CS571");
		student3.add("CS575");
		student3.add("CS559");
		student3.add("CS536");
		student3.add("CS565");
		student3.add("CS515");
		student3.add("CS528");
		student3.add("CS558");

		student4.add("CS551");
		student4.add("CS571");
		student4.add("CS575");
		student4.add("CS559");
		student4.add("CS536");
		student4.add("CS565");
		student4.add("CS515");
		student4.add("CS580E");
		student4.add("CS558");
		
		student5.add("CS551");
		student5.add("CS571");
		student5.add("CS575");
		student5.add("CS559");
		student5.add("CS536");
		student5.add("CS565");
		student5.add("CS580E");
		student5.add("CS558");

		System.out.println("Student 1: " + student1);
		student1.setTrack(new NoTrack());
		System.out.println(student1.checkTrack());
		student1.setTrack(new AITrack());
		System.out.println(student1.checkTrack());
		student1.setTrack(new CyberTrack());
		System.out.println(student1.checkTrack());
		System.out.println();
		System.out.println("Student 2: " + student2);
		student2.setTrack(new NoTrack());
		System.out.println(student2.checkTrack());
		student2.setTrack(new AITrack());
		System.out.println(student2.checkTrack());
		student2.setTrack(new CyberTrack());
		System.out.println(student2.checkTrack());
		System.out.println();
		System.out.println("Student 3: " + student3);
		student3.setTrack(new NoTrack());
		System.out.println(student3.checkTrack());
		student3.setTrack(new AITrack());
		System.out.println(student3.checkTrack());
		student3.setTrack(new CyberTrack());
		System.out.println(student3.checkTrack());
		System.out.println();
		System.out.println("Student 4: " + student4);
		student4.setTrack(new NoTrack());
		System.out.println(student4.checkTrack());
		student4.setTrack(new AITrack());
		System.out.println(student4.checkTrack());
		student4.setTrack(new CyberTrack());
		System.out.println(student4.checkTrack());
		System.out.println();
		System.out.println("Student 5: " + student5);
		student5.setTrack(new NoTrack());
		System.out.println(student5.checkTrack());
		student5.setTrack(new AITrack());
		System.out.println(student5.checkTrack());
		student5.setTrack(new CyberTrack());
		System.out.println(student5.checkTrack());
	}

}
