import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("input number " + (i + 1) + " :"));
		} // end for
		ShowEven(nums);
		ShowOdd(nums);
	}// end main

	public static void ShowEven(int[] nums) {
		String NumberEven = " ";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				NumberEven += nums[i];
				NumberEven += " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n" + NumberEven);
	}

	public static void ShowOdd(int[] nums) {
		String NumberOdd = " ";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				NumberOdd += nums[i];
				NumberOdd += " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of Odd number:\n" + NumberOdd);
	}
}
