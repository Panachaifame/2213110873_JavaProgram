import java.util.Scanner;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Fullname: ");
		String Fullname = scan.nextLine();
		String Firstname,Lastname;
		int space = Fullname.indexOf(' ');
		if(Fullname.indexOf(" ")==-1){
			System.out.print("Incorrect Name");
		}
		else {
			 Firstname = Fullname.substring(0,space).toUpperCase();
			 Lastname = Fullname.substring(space+1).toLowerCase();
			System.out.println("First Name: "+ Firstname);
			System.out.print("Last Name: "+ Lastname);
		}
	}
}
