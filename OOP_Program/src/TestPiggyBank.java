import java.util.*;

public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		/*
		 * pb.setPiggyBank(500); System.out.print("Money Total : " + pb.getTotal());
		 * pb.addTwo(34); System.out.print("Add 2 Baht money: " + 34);
		 * System.out.print("Money Total : " + pb.getTotal()); pb.addTen(13);
		 * System.out.print("Add 10 Baht money: " + 13);
		 * System.out.print("Money Total : " + pb.getTotal()); pb.addFive(100);
		 */
		sizeOfPiggyBank();
	}// end method

	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		// int size = scan.nextInt();
		// pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.print("Size of your PiggyBank : " + pb.getPiggyBank());
		inputCoin();
	}

	public static void inputCoin() {
		while (true) {
			Line();
			System.out.println("Menu of PiggyBank");
			Line();
			System.out.print("[1] one baht.");
			System.out.print("[2] two baht.");
			System.out.print("[3] five baht.");
			System.out.print("[4] ten baht.");
			System.out.print("[5] Exit");
			Line();
			System.out.print("Please select choice: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 baht : ");
				pb.addOne(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 2) {
				System.out.print("Insert 2 baht : ");
				pb.addTwo(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 3) {
				System.out.print("Insert 5 baht : ");
				pb.addFive(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 4) {
				System.out.print("Insert 10 baht : ");
				pb.addTen(scan.nextInt());
				System.out.println("Money Total : " + pb.getTotal());
			} else if (choice == 5) {
				System.out.print("Bye Bye");
				break;
			}
		}
	}

	public static void Line() {
		for (int i = 0; i >= 20; i++) {
			System.out.print("=");
		}
	}

}
