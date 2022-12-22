import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("input student name : ");
			std[i].setName(scan.next());
			System.out.print("input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("input student score, again : ");
				std[i].setScore(scan.nextInt());
			} // end while
			System.out.println();
		} // end for
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("--------------------------------------");
		for (Student _std : std) {
			if (_std.isPass()) {
				System.out.println(">> " + _std.getName() + "( " + _std.getScore() + ")"+ "get grade"+ _std.findGrade(_std.getScore()));
			}	
		}
		
		
	}
	
}
