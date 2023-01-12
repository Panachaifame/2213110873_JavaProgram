import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(43, 28, 89, 19);
		contentPane.add(lblNumber1);

		txtNumber1 = new JTextField();
		txtNumber1.setBounds(142, 27, 130, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);

		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(43, 58, 92, 14);
		contentPane.add(lblNumber2);

		txtNumber2 = new JTextField();
		txtNumber2.setBounds(142, 55, 130, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);

		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(231, 246, 99, 19);
		contentPane.add(lblResult);

		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(43, 93, 70, 14);
		contentPane.add(lblOperator);

		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(142, 91, 55, 19);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);

		JLabel lblNewLabel = new JLabel("How to show digit");
		lblNewLabel.setBounds(43, 134, 89, 14);
		contentPane.add(lblNewLabel);
		
		final JRadioButton onedigit = new JRadioButton("1 Digit");
		onedigit.setBounds(142, 130, 109, 23);
		contentPane.add(onedigit);
		
		final JRadioButton twodigit = new JRadioButton("2 Digit");
		twodigit.setBounds(142, 156, 109, 23);
		contentPane.add(twodigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);
		
		final JCheckBox chkDialogBox = new JCheckBox("Show Result at DialogBox");
		chkDialogBox.setBounds(142, 204, 147, 23);
		contentPane.add(chkDialogBox);
		
		
		final JButton btnOK = new JButton("OK");
		btnOK.setBounds(142, 293, 89, 23);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				//JButton
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//JComboBox
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+"))
						sum = num1+num2;
					if(operator.equals("-"))
						sum = num1-num2;
					if(operator.equals("*"))
						sum = num1*num2;
					if(operator.equals("/"))
						sum = num1/num2;
					
					DecimalFormat frmNumber = null;
					if(onedigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.0");
					}
					else if (twodigit.isSelected()) {
						frmNumber = new DecimalFormat("#,###.00");
					}
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogBox.isSelected()) {
						JOptionPane.showMessageDialog(null,"Result is : "+frmNumber.format(sum));
					}
				}
			}
		});
		
		contentPane.add(btnOK);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(241, 293, 89, 23);
		contentPane.add(btnExit);
		
		JLabel Option = new JLabel(" Option in show");
		Option.setBounds(43, 208, 89, 14);
		contentPane.add(Option);
		
		
		


	}
}