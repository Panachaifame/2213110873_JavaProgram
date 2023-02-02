import java.util.*;
public class MovieDemo {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.print("Input movie id : ");
		String id = scan.nextLine();
		System.out.print("Input movie name : ");
		String name = scan.nextLine();
		System.out.println();
		System.out.print("Input director name : ");
		String directorName = scan.nextLine();
		System.out.print("Input director email : ");
		String email = scan.nextLine();
		System.out.print("Input director gender : ");
		char gender = scan.nextLine().toLowerCase().charAt(0);
		while (gender != 'm'&& gender != 'M'&& gender != 'f'&& gender != 'F') {
			System.out.print("Input director gender, again : ");
			gender = scan.nextLine().toLowerCase().charAt(0);
		}
		System.out.println();
		System.out.print("Input movie theater no.  : ");
		int theaterNo = scan.nextInt();
		while(theaterNo<1|| theaterNo >15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}
		System.out.println();
		
		Theater p1 = new Theater(id,name,new Director(directorName,email,gender), theaterNo);
		System.out.print(p1);

		
	}

}
