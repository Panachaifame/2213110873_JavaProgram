import java.util.Scanner;
public class Example__401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputword="";
		String txtWord = "";
		while(true) {
		System.out.print("Enter word : ");
		inputword = scan.next();
		if(inputword.equalsIgnoreCase("stop")){
			break;
			}
		txtWord = txtWord+inputword+" ";
		}
			System.out.print(txtWord.toUpperCase());
	}
}
