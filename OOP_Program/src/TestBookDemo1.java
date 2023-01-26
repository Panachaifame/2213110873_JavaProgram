import java.util.*;
public class TestBookDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input author name :");
		String name = scan.nextLine();
		System.out.print("Input author e-mail");
		String email =scan.next();
		
		AuthorDemo auth = new AuthorDemo(name,email);
		System.out.print(auth);
		
		System.out.println();
		System.out.print("Input book title : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("Input book page :");
		int page = scan.nextInt();
		
		BookDemo1 book = new BookDemo1(title,auth,page);
		System.out.println(book);
	}

}
