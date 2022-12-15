import java.util.*;

public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static int[] numberofInteger = { 78, 36, 58, 41, 25, 92 ,75 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input index  of array : ");
		int indexOfarray = scan.nextInt();
		while(indexOfarray<0|| indexOfarray >(numberofInteger.length -1));{
			System.out.print("Input index of array,again : ");
			indexOfarray = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current is "+(numberofInteger[indexOfarray]));
		if(indexOfarray==(numberofInteger.length-1)) {
			System.out.println("Sorry, "+indexOfarray+" is the last Index in array. ");
		}
		else {
			System.out.println("Value in next index is "+(numberofInteger));
		}
	}

}
