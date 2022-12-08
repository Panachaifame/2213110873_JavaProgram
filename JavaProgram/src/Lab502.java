import javax.swing.*;

public class Lab502 {

	static String email;

	public static void main(String[] args) {
		inputEmail();

	}

	public static void inputEmail() {
		String answer = "";
		do {
			email = JOptionPane.showInputDialog("Input your e-mail");
			checkEmailError(email);
			answer = JOptionPane.showInputDialog("Countinue[y||Y to continue]");
		} while (answer.equalsIgnoreCase("y"));
	}

	public static void checkEmailError(String chkemail) {
		while (chkemail.startsWith("@") || chkemail.contains(" ")) {
			chkemail = JOptionPane.showInputDialog("Input your e-mail, again :");
		}
		chkemail = chkemail.toLowerCase();
		boolean checkEmail = chkemail.endsWith("@gmail.com") || chkemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail) ? "Your e-mail is " + chkemail : "Your e-mail is not hotmai or gmail dot com ");
	}
}
