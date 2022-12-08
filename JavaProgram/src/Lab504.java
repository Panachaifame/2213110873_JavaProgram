import  java.util.*;                        
public class Lab504 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separate by a space.\n:");
		String fullName = scan.nextLine();
		String firstName;
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		String abbname = abbreviatName(fullName);
		System.out.println(abbname+firstName);		
	}
	public static String abbreviatName(String fullname) 
	{
		String firstLetter= "";
		for (int i = 0;i<fullname.length();i++) 
		{
			if(fullname.charAt(i)==(' '))
			{
				firstLetter += fullname.charAt(i+1);
				firstLetter += '.';
			}
		}//end for
		 
		return firstLetter;
	}
}
