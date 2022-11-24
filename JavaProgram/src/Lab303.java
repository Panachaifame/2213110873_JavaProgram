import java.util.Random;
import javax.swing.*;
import java.text.*;
public class Lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		DecimalFormat frm =new DecimalFormat("0,000");
		int Mthousand =0,thousand =0,MFhundred=0,Fhundred=0,Mhundred=0,hundred=0;
		int money = Integer.parseInt(JOptionPane.showInputDialog( 
				"Your balance : "+frm.format(balance) +
				"\nInput money to withdraw:"));
		if (money>balance) {
			JOptionPane.showMessageDialog(null, 
					"Error:Cannot withdraw more than balance",
					 "ERROR",
					 JOptionPane.ERROR_MESSAGE);}//endif
		else if (money > 20000) {
				JOptionPane.showMessageDialog(null, 
						"Error:Cannot withdraw more than 20,000",
						 "ERROR",
						 JOptionPane.ERROR_MESSAGE);}//endelseif1
	    else if (money%100 !=0) {
					JOptionPane.showMessageDialog(null, 
							"Error:Cannot withdraw "+money%100+" baht.",
							 "ERROR",
							 JOptionPane.ERROR_MESSAGE);}//endelseif2
		else {
				thousand = money/1000;
				Mthousand = money%1000;
				Fhundred = Mthousand/500;
				MFhundred = Mthousand%500;
				hundred = MFhundred/100;
				Mhundred = MFhundred%100;
				JOptionPane.showMessageDialog(null, 
						"You withdraw "+frm.format(balance)+" Baht. "
						+"\n1,000 = "+thousand
						+"\n500 = "+Fhundred
						+"\n100 = "+hundred);
		}
	}
}

