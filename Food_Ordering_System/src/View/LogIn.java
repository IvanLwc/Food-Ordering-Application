package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import Controller.Controller;
import Model.User;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LogIn {

	private JFrame frame;
	private JTextField txtUsername;
	private Controller controller;
	private JPasswordField password;
	
	public LogIn() {
		initialize();
	}
	
	public void loginSetVisible() {
		frame.setVisible(true);
	}

	private void initialize() {
		controller = new Controller();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 545, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel lblTitle = new JLabel("DeliverEat");
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblTitle.setBounds(205, 115, 120, 51);
		frame.getContentPane().add(lblTitle);
		
		JLabel lblInfo = new JLabel("Order your favourite meal online!");
		lblInfo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblInfo.setBounds(147, 161, 225, 21);
		frame.getContentPane().add(lblInfo);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblUsername.setBounds(137, 205, 79, 21);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPassword.setBounds(137, 248, 79, 21);
		frame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtUsername.setBounds(216, 201, 156, 29);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txtPassword = new String (password.getPassword());
				if(controller.verifyUser(txtUsername.getText(),txtPassword)) {
					frame.setVisible(false);
					User user = controller.getUser(txtUsername.getText(),txtPassword);
					Home window = new Home(user);
					window.homeSetVisible();
				}
				else
					JOptionPane.showMessageDialog(null, "Error: Invalid username or password");
			}
		});
		
		btnLogin.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnLogin.setBounds(205, 289, 120, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.setBackground(new Color(255, 255, 255));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Register window = new Register();
				window.registerSetVisible();
				
			}
		});
		btnRegister.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnRegister.setBounds(205, 328, 120, 29);
		frame.getContentPane().add(btnRegister);
		
		password = new JPasswordField();
		password.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		password.setBounds(216, 243, 156, 31);
		frame.getContentPane().add(password);
		
		JLabel icon = new JLabel("");
		icon.setBackground(new Color(255, 182, 193));
		icon.setBounds(144, 10, 250, 95);
		icon.setIcon(new ImageIcon("image/DeliverEatLogo.jpg"));
		frame.getContentPane().add(icon);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setOpaque(true);
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setForeground(new Color(192, 0, 0));
		lblLogo.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblLogo.setBackground(new Color(250, 128, 114));
		lblLogo.setBounds(0, 0, 531, 118);
		frame.getContentPane().add(lblLogo);
	}
}
