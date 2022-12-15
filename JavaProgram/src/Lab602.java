import java.util.*;
import java.text.*;

public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static int sum = 0;
	static double averageNumber = 0;
	static DecimalFormat df = new DecimalFormat("00.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] inputscore = new double[5];
		for (int i = 0; i < inputscore.length; i++) {
			System.out.print("Input score of student " + (i + 1) + " : ");
			inputscore[i] = scan.nextDouble();
			sum += inputscore[i];
		}
		System.out.println();
		averageNumber = (double) sum / (inputscore.length);
		System.out.println("Average of " + inputscore.length + " student is " + df.format(averageNumber));
		for (int i = 0; i < inputscore.length; i++) {
			if (inputscore[i] > averageNumber) {
				System.out.println("> student " + (i + 1) + "(" + inputscore[i] + ")");
			}
		}

	}

}
