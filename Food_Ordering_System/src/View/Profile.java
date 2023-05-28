package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import Model.User;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Profile {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField txtAddress;
	private JTextField txtPhoneNumber;
	private User currentUser;

	public Profile(User currentUser) {
		this.currentUser = currentUser;
		initialize();
	}
	
	public void profileSetVisible() {
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
		
		JLabel lblProfile = new JLabel("Details");
		lblProfile.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblProfile.setBounds(222, 84, 92, 42);
		frame.getContentPane().add(lblProfile);
		
		JButton btnLogin = new JButton("BACK");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Home window = new Home(currentUser);
				window.homeSetVisible();
			}
		});
		
		btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnLogin.setBounds(10, 339, 92, 29);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblName.setBounds(151, 140, 43, 21);
		frame.getContentPane().add(lblName);
		
		txtName = new JTextField();
		txtName.setBackground(new Color(255, 255, 255));
		txtName.setEditable(false);
		txtName.setText(currentUser.getUsername());
		txtName.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtName.setColumns(10);
		txtName.setBounds(204, 136, 190, 29);
		frame.getContentPane().add(txtName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAge.setBounds(161, 179, 30, 21);
		frame.getContentPane().add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setBackground(new Color(255, 255, 255));
		txtAge.setEditable(false);
		txtAge.setText(currentUser.getAge());
		txtAge.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtAge.setColumns(10);
		txtAge.setBounds(204, 175, 190, 29);
		frame.getContentPane().add(txtAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblGender.setBounds(141, 218, 53, 21);
		frame.getContentPane().add(lblGender);
		
		txtGender = new JTextField();
		txtGender.setBackground(new Color(255, 255, 255));
		txtGender.setEditable(false);
		txtGender.setText(currentUser.getGender());
		txtGender.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtGender.setColumns(10);
		txtGender.setBounds(204, 214, 190, 29);
		frame.getContentPane().add(txtGender);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAddress.setBounds(134, 257, 60, 21);
		frame.getContentPane().add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setBackground(new Color(255, 255, 255));
		txtAddress.setEditable(false);
		txtAddress.setText(currentUser.getAddress());
		txtAddress.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtAddress.setColumns(10);
		txtAddress.setBounds(204, 253, 190, 29);
		frame.getContentPane().add(txtAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPhoneNumber.setBounds(88, 296, 106, 21);
		frame.getContentPane().add(lblPhoneNumber);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBackground(new Color(255, 255, 255));
		txtPhoneNumber.setEditable(false);
		txtPhoneNumber.setText(currentUser.getPhoneNumber());
		txtPhoneNumber.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(204, 292, 190, 29);
		frame.getContentPane().add(txtPhoneNumber);
		
		JLabel lblTitle = new JLabel("Profile");
		lblTitle.setOpaque(true);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(192, 0, 0));
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblTitle.setBackground(new Color(250, 128, 114));
		lblTitle.setBounds(0, 0, 531, 74);
		frame.getContentPane().add(lblTitle);
	}

}
