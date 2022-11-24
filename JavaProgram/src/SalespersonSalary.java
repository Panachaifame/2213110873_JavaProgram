import java.util.*;
public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int sales;
		double salary;
		do{
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales =  scan.nextInt();
			if(sales == SENTINEL) {
				System.out.print("Bye");
			}
			else {
				salary =(sales * COMMISSION_RATE)+1000;
				System.out.print("Salary is: $"+salary);
				System.out.print("\n");
			}
		}while(sales != SENTINEL);
	}

}
