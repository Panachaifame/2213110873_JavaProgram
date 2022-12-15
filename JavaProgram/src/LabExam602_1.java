import javax.swing.JOptionPane;

public class LabExam602_1 {
	static String[] deptName = {"Accounting","HR","Sales","Innovation"};
	static boolean deptwasFound = false;	
	public static void main(String[] args) {
		String dept = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i=0;i<deptName.length;i++) {	
			if(dept.equalsIgnoreCase(deptName[i]))
			{
				deptwasFound = true; 
			}
		}
	 if (deptwasFound)?
}

