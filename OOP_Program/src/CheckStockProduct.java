import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock :");
		int size = scan.nextInt();
		System.out.println();
		Product[] ProductList = new Product[size];
		for (int i = 0; i < size; i++) {
			ProductList[i] = new Product();
			System.out.print("Input product Id   : ");
			ProductList[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			ProductList[i].setUnit(scan.nextInt());
			System.out.println();
			
		}// end of for
		String[] status = { "LOW", "NORMAL", "HIGH" };
		for (int p = 0; p < status.length; p++) {
			System.out.println("------------------------------------------");
			System.out.println("List of product in " + status[p] + " status.");
			System.out.println("------------------------------------------");
			for (Product _ProductList : ProductList) {
				if (status[p].equals("LOW") && _ProductList.checkStatus().equals("LOW")) {
					System.out.println(">> " + _ProductList.getId() + " has " + _ProductList.getUnit() + " units");
				}
				if (status[p].equals("NORMAL") && _ProductList.checkStatus().equals("NORMAL")) {
					System.out.println(">> " + _ProductList.getId() + " has " + _ProductList.getUnit() + " units");
				}
				if (status[p].equals("HIGH") && _ProductList.checkStatus().equals("HIGH")) {
					System.out.println(">> " + _ProductList.getId() + " has " + _ProductList.getUnit() + " units");
				}
			}
		} //end of for

	}

}
