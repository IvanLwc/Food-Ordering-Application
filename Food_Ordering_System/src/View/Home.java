package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import Model.History;
import Model.User;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Home {
	private JFrame frame;
	private ArrayList<Model.History> list;
	private User currentUser;
	
	public Home(User currentUser, ArrayList<History> historyList)
	{
	    this.currentUser = currentUser;
	    this.list = historyList;
	    initialize();
	}
	
	public Home(User currentUser)
	{
	    this(currentUser, null);
	    initialize();
	}

	public void homeSetVisible() {
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
		
		JLabel lblTitle = new JLabel("Welcome to DeliverEat, " + currentUser.getUsername());
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblTitle.setBounds(91, 99, 404, 34);
		frame.getContentPane().add(lblTitle);
		
		JButton btnMakeOrder = new JButton("MAKE ORDER");
		btnMakeOrder.setBackground(new Color(255, 255, 255));
		btnMakeOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MakeOrder window = new MakeOrder(currentUser);
				window.makeOrderSetVisible();
			}
		});
		btnMakeOrder.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnMakeOrder.setBounds(169, 156, 189, 41);
		frame.getContentPane().add(btnMakeOrder);
		
		JButton btnHistory = new JButton("ORDER HISTORY");
		btnHistory.setBackground(new Color(255, 255, 255));
		btnHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				OrderHistory window = new OrderHistory(currentUser, list);
				window.historySetVisible();
				
			}
		});
		btnHistory.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnHistory.setBounds(169, 209, 189, 41);
		frame.getContentPane().add(btnHistory);
		
		JButton btnProfile = new JButton("PROFILE");
		btnProfile.setBackground(new Color(255, 255, 255));
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Profile window = new Profile(currentUser);
				window.profileSetVisible();
			}
		});
		btnProfile.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnProfile.setBounds(169, 260, 189, 43);
		frame.getContentPane().add(btnProfile);
		
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.setBackground(new Color(255, 255, 255));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LogIn window = new LogIn();
				window.loginSetVisible();
			}
		});
		btnLogOut.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnLogOut.setBounds(169, 313, 189, 41);
		frame.getContentPane().add(btnLogOut);
		
		JLabel lblHome = new JLabel("Main Menu");
		lblHome.setForeground(new Color(192, 0, 0));
		lblHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblHome.setBackground(new Color(250, 128, 114));
		lblHome.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblHome.setBounds(0, 0, 531, 74);
		lblHome.setOpaque(true);
		frame.getContentPane().add(lblHome);
	}
}
