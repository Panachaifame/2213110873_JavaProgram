
public class Student_ {
	//private Instance variables
	private String name ;
	private String address;
	//the course and grades for the courseare ketp in 2 paraliel arrays
	private String[] courses;
	private int[] grades;//valid rangesis[0-100]
	private int numcourses; //num of courses taken so far
	private static final int MAX_COURSE = 30;
	
	public Student_ (String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int [MAX_COURSE];
		numcourses = 0;
	}
	public String getname() {
		return this.name;
	}
	public String getaddress() {
		return this.address;
	}
	public void setAddress(String Address) {
		this.address=address;
	}
	public String toString() {
		return this.name+"("+this.address+")";
	}
	public void addCourseGrade (String course,int grade) {
		courses[numcourses] = course;
		grades[numcourses] = grade ; 
		++numcourses;
	}
	public void printGrade() {
		System.out.print(name);
		for(int i=0;i<numcourses;i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	
	public double getAverageGrade() {
		int sum = 0;
		for(int i=0;i<numcourses;i++) {
			sum+=grades[i];
		}
		return sum/numcourses;
	}
}
