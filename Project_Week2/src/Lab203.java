import java.text.*;
import java.util.Scanner;
public class Lab203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input two integers(a b):  ");		
		int numberA = scan.nextInt();
		int numberB = scan.nextInt();
		int Sum = numberA+numberB;
		System.out.print("Sum of two integers: "+Sum);
		int countNum = 0;
		while(Sum !=0) {
			Sum/=10;
			countNum++;
		}
		System.out.println();
		System.out.print("Digit number of sum of said two integers:\n"+countNum);
		

	}

}
