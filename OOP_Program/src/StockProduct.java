import java.util.*;
import java.text.*;

public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new  DecimalFormat ("0,000.00");
	public static void main(String[] args) {
		
		Product[] ProductList = new Product[4];
		for (int i = 0; i < ProductList.length; i++) {
			System.out.print("Input product Id : ");
			ProductList[i].setId((scan.next()));
			System.out.print("Input Product Unit : ");
			ProductList[i].setUnit((scan.nextInt()));
			while (!(ProductList[i].getUnit() > 0)) {
				System.out.print("Input Product Unit , again : ");
				ProductList[i].setUnit((scan.nextInt()));
			} // end unit while
			System.out.print("Input Product Price : ");
			ProductList[i].setPrice((scan.nextDouble()));
			while (!(ProductList[i].getPrice() > 0)) {
				System.out.print("Input Product Price , again : ");
				ProductList[i].setPrice((scan.nextDouble()));
			} // end price while
			System.out.println();
			double sum =+ ProductList[i].calculate();
		} // end for
		System.out.println("-------------------------------------");
		for(Product _ProductList:ProductList ) {
			System.out.print("Product ID : "+_ProductList.getId()+", "+"Total price = "+_ProductList.getPrice());
		}
	}// end main

}
