import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};
		int indexArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while (!checkindex(nums, indexArray)) {
		indexArray = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}//end while
		JOptionPane.showMessageDialog(null,"Current data,nums["+indexArray+"] is "+currentData(nums,indexArray)+
				((prevData(nums,indexArray)==0?"\nNo previous data":"\nPrevious data,nums["+(indexArray-1)+"] is "+prevData(nums,indexArray))+
				((nextData(nums,indexArray)==0?"\nNo next data":"\nNext data,num["+(indexArray+1)+"] is "+nextData(nums,indexArray)))));
		
	}//end main
	public static boolean checkindex(int[]num,int index) {
		return (index < 0 || index>num.length-1?false:true);		
	}
	public static int currentData(int[]nums,int index) {
		return nums[index];	
	}
	public static int prevData(int[]nums,int index) {
		return (index - 1 < 0)?0:nums[index-1];	
	}
	public static int nextData(int[]nums,int index) {
		return (index + 1 >nums.length-1)?0:nums[index+1];
	}

}
