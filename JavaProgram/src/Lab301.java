import javax.swing.*;
import java.text.*;

public class Lab301 {
	static final  int PRICEPERSON = 299;
	DecimalFormat frm =new DecimalFormat("0000.00");
	public static void main(String[] args) {
		int numberofCustomer = Integer.parseInt
				(JOptionPane.showInputDialog("How many customer per bill"));
		double totalPrice = numberofCustomer * PRICEPERSON;
		int memberCard;
		memberCard = JOptionPane.showConfirmDialog(null, 
				"Total Pricec is "+totalPrice+" Baht. "
						+"\nDo you have a member card?");
		do{
			memberCard = JOptionPane.showConfirmDialog(null, 
					"Total Pricec is "+totalPrice+" Baht. "
							+"\nDo you have a member card?");
		}while(memberCard == 2);			
		if(memberCard==0) {
			totalPrice = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is "+totalPrice+" Baht.");}//end if
		else if (memberCard==1) {
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is "+totalPrice+" Baht.");
		}
		
	}

}