import javax.swing.JOptionPane;

public class Shoop100Baht {

	public static void main(String[] args) {
		__Product Test = new __Product();
		
		int button = JOptionPane.showConfirmDialog(null, "Patanakarn");
		
		if(button == 0) {
			Test = new PattanakarnBranch();
		}
		
		Test.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		
		
		JOptionPane.showMessageDialog(null, Test);
	}

}
