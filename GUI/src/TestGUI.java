import java.awt.*;
import javax.swing.*;
public class TestGUI extends JFrame{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	
	private JLabel lblLength,lblWidth,lblArea,LblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimter;

	public TestGUI() {
		setTitle("Area and parimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblLength = new JLabel("Enter the length: ",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width: ",SwingConstants.RIGHT);
		lblArea = new JLabel("Area: ",SwingConstants.RIGHT);
		LblPerimeter = new JLabel("Preimeter",SwingConstants.RIGHT);
		
		//
		//txtLength = new JTextField("10");
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);
		add(lblWidth);
		add(lblArea);
		add(LblPerimeter);
	}
	public static void main(String[] args) {
		TestGUI prog = new TestGUI();
	}

}
