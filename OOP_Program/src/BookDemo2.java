import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		int confirm = JOptionPane.showConfirmDialog(null, "is the page correct?","confirm",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		
		
		BookDemo1 book = new BookDemo1(title,new AuthorDemo(name,email),page);
		
		if(confirm==1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again: "));
			book.setPage(page);
		}
		JOptionPane.showMessageDialog(null,"Book Title:"+book.getTitle()
				+"\nAuthor name :"+book.getAuthor().getname()+"("+book.getPage()+")"
				+"\nAuthor e-mail :"+book.getAuthor().getemail());
	}
}	
