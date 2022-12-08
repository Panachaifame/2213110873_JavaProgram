import java.util.*;
import javax.swing.*;
public class Example__403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sectence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("input a sentence, again: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int spaceofWord =0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spaceofWord++;
			}
		}
		/*System.out.println("This sentence has "+spaceofWord+" spacebar. ");
		System.out.print("This sentence has "+(spaceofWord+1)+" word. ");*/
		JOptionPane.showMessageDialog(null, 
				"This sentence has "+spaceofWord+" spacebar. \n"
				+"This sentence has "+(spaceofWord+1)+" word. ");

	}

}
