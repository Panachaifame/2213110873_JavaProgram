import java.text.DecimalFormat;
import java.util.Scanner;

public class PensionContributionCalculator {
	static final int SALARY_CEILING = 6000;
	static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	static final double EMPLOYER_RATE_55_TO_60 = 0.13;
	static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	static final double EMPLOYER_RATE_60_TO_65 = 0.09;
	static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	static final double EMPLOYER_RATE_65_ABOVE = 0.075;
	public static void main(String[] args) {
		DecimalFormat frm =new DecimalFormat("000.00");
		int salary, age;
		int contributableSalary;
		double employeeContribution=0, employerContribution=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the monthly salary: $");
		salary = scan.nextInt();
		System.out.print("Enter the age: ");
		age = scan.nextInt();
		contributableSalary = salary;
		if (salary>SALARY_CEILING) { contributableSalary = salary;}
		else if (age<=55) {
			employeeContribution = contributableSalary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributableSalary*EMPLOYER_RATE_55_AND_BELOW;
		}
		else if (age <= 60) {
			employeeContribution = contributableSalary*EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributableSalary*EMPLOYER_RATE_55_TO_60;			
		}
		else if (age <= 65) {
			employeeContribution = contributableSalary*EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributableSalary*EMPLOYER_RATE_60_TO_65;			
		}
		else {
			employeeContribution = contributableSalary*EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributableSalary*EMPLOYER_RATE_65_ABOVE;
		}
		System.out.println("The employee's contribution is: $"+frm.format(employeeContribution));
		System.out.println("The employer's contribution is: $"+frm.format(employerContribution));
		System.out.println("The total contribution is: $"+frm.format(employerContribution+employeeContribution));
	}

}
