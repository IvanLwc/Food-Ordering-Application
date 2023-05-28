package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Register {

	private JFrame frame;
	private JTextField txtPassword;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField txtAddress;
	private JTextField txtPhoneNumber;
	private JTextField txtName;


	public Register() {
		initialize();
	}

	public void registerSetVisible() {
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 545, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblRegister = new JLabel("Fill in the information");
		lblRegister.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblRegister.setBounds(140, 84, 263, 51);
		frame.getContentPane().add(lblRegister);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPassword.setBounds(123, 171, 67, 21);
		frame.getContentPane().add(lblPassword);

		txtPassword = new JTextField();
		txtPassword.setText((String) null);
		txtPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPassword.setColumns(10);
		txtPassword.setBounds(200, 171, 190, 21);
		frame.getContentPane().add(txtPassword);

		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAge.setBounds(160, 202, 30, 21);
		frame.getContentPane().add(lblAge);

		txtAge = new JTextField();
		txtAge.setText((String) null);
		txtAge.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtAge.setColumns(10);
		txtAge.setBounds(200, 202, 190, 21);
		frame.getContentPane().add(txtAge);

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblGender.setBounds(137, 233, 53, 21);
		frame.getContentPane().add(lblGender);

		txtGender = new JTextField();
		txtGender.setText((String) null);
		txtGender.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtGender.setColumns(10);
		txtGender.setBounds(200, 233, 190, 21);
		frame.getContentPane().add(txtGender);

		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAddress.setBounds(130, 264, 60, 21);
		frame.getContentPane().add(lblAddress);

		txtAddress = new JTextField();
		txtAddress.setText((String) null);
		txtAddress.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtAddress.setColumns(10);
		txtAddress.setBounds(200, 264, 190, 21);
		frame.getContentPane().add(txtAddress);

		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(84, 295, 106, 21);
		frame.getContentPane().add(lblPhoneNumber);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText((String) null);
		txtPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(200, 295, 190, 21);
		frame.getContentPane().add(txtPhoneNumber);

		JButton btnLogin = new JButton("BACK");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LogIn window = new LogIn();
				window.loginSetVisible();
			}
		});
		btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnLogin.setBounds(10, 339, 92, 29);
		frame.getContentPane().add(btnLogin);

		JButton btnConfirmRegister = new JButton("REGISTER");
		btnConfirmRegister.setBackground(new Color(255, 255, 255));
		btnConfirmRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtName.getText().isEmpty()||txtPassword.getText().isEmpty()||txtAge.getText().isEmpty()||txtGender.getText().isEmpty()||txtAddress.getText().isEmpty()||txtPhoneNumber.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill in the information");
				}
				else {
					JOptionPane.showMessageDialog(null, "Successfully registered an account");
					frame.setVisible(false);
					LogIn window = new LogIn();
					window.loginSetVisible();
				}
			}
		});
		btnConfirmRegister.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnConfirmRegister.setBounds(404, 339, 117, 29);
		frame.getContentPane().add(btnConfirmRegister);
		
		JLabel lblTitle = new JLabel("Register Account");
		lblTitle.setOpaque(true);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(192, 0, 0));
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblTitle.setBackground(new Color(250, 128, 114));
		lblTitle.setBounds(0, 0, 531, 74);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblName.setBounds(149, 140, 43, 21);
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setText((String) null);
		txtName.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(200, 140, 190, 21);
		frame.getContentPane().add(txtName);
	}
}
