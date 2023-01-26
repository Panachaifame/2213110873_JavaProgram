
public class TestStudent_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_ st1 = new Student_("Fullname Lastname","1 Happy Ave");
		System.out.print(st1);
		
		
		
		st1.setAddress("25 Pattanakran");
		System.out.println(st1);
		System.out.println(st1.getname());
		System.out.println(st1.getaddress());
		
		
		st1.addCourseGrade("INT107", 50);
		st1.addCourseGrade("INT108", 70);
		st1.addCourseGrade("MSC201", 60);
		st1.printGrade();
		
		System.out.printf("he average grade is %.2f%n",st1.getAverageGrade());
	}

}
