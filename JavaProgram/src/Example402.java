import javax.swing.JOptionPane;
public class Example402 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail:");
		while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, again :");
			
		}
		inputEmail = inputEmail.toLowerCase();
		/*if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com"));{
			JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
		}
		else {
				JOptionPane.showMessageDialog(null, "Your email is not hotmail or gmail dot com ");
				
			}*/
		boolean checkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, 
				(checkEmail)
				?"Your e-mail is "+inputEmail:
					"Your e-mail is not hotmai or gmail dot com ");
		
		
				
	  }
	
	}

