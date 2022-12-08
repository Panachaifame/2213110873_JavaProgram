import java.util.*;

public class Lab55 {

	static String studentId;
	static String subjectId;

	public static void main(String[] args) {
		inputStudent();
	}

	public static void inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		String studentId = scan.nextLine();
		System.out.print("Enter Subject Id: ");
		String subjectId = scan.nextLine();
		while (!isLength(studentId, subjectId)) {
			System.out.print("Enter Student Id: ");
			studentId = scan.nextLine();
			System.out.print("Enter Subject Id: ");
			subjectId = scan.nextLine();
		}
		displayData(isITStudent(studentId), isITSubject(subjectId));
	}

	public static boolean isLength(String studentId, String subjectId) {
		if (studentId.length() == 10 && subjectId.length() == 7)
			return true;
		return false;
	}

	public static boolean isITStudent(String studentId) {
		if (studentId.charAt(2) == '1' && studentId.substring(3, 6) == "311")
			return true;
		return false;
	}

	public static boolean isITSubject(String subjectId) {
		if (subjectId.charAt(4) == '1' && subjectId.substring(0, 2) == "21")
			return true;
		return false;
	}

	public static void displayData(boolean student, boolean subject) {
		System.out.print("Student id:  " + studentId + ((student) ? " " : " is not ") + "1st year student in IT\n"
				+ ((subject) ? "Enroll " : "not enroll ") + "in course for Year 1");
	}

}
