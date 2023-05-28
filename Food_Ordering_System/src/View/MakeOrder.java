package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import Model.User;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MakeOrder {

	private JFrame frame;
	
	private User currentUser;

	public MakeOrder(User currentUser) {
		this.currentUser = currentUser;
		initialize();
	}
	
	public void makeOrderSetVisible() {
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
		
		JLabel lblSelectRestaurant = new JLabel("Select Restaurant");
		lblSelectRestaurant.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblSelectRestaurant.setBounds(162, 84, 210, 51);
		frame.getContentPane().add(lblSelectRestaurant);
		
		JButton btnMacdonald = new JButton("McDonald's");
		btnMacdonald.setBackground(new Color(255, 255, 255));
		btnMacdonald.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				McD window = new McD(currentUser);
				window.McDSetVisible();
			}
		});
		btnMacdonald.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnMacdonald.setBounds(114, 153, 132, 71);
		frame.getContentPane().add(btnMacdonald);
		
		JButton btnKentuckyFriedChicken = new JButton("KFC");
		btnKentuckyFriedChicken.setBackground(new Color(255, 255, 255));
		btnKentuckyFriedChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				KFC window = new KFC(currentUser);
				window.KFCSetVisible();
			}
		});
		btnKentuckyFriedChicken.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnKentuckyFriedChicken.setBounds(271, 153, 132, 71);
		frame.getContentPane().add(btnKentuckyFriedChicken);
		
		JButton btnTealive = new JButton("PizzaHut");
		btnTealive.setBackground(new Color(255, 255, 255));
		btnTealive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				PizzaHut window = new PizzaHut(currentUser);
				window.PizzaHutSetVisible();
			}
		});
		btnTealive.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnTealive.setBounds(198, 251, 132, 67);
		frame.getContentPane().add(btnTealive);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Home window = new Home(currentUser);
				window.homeSetVisible();
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnBack.setBounds(10, 339, 101, 29);
		frame.getContentPane().add(btnBack);
		
		JLabel lblTitle = new JLabel("Make Order");
		lblTitle.setOpaque(true);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(192, 0, 0));
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblTitle.setBackground(new Color(250, 128, 114));
		lblTitle.setBounds(0, 0, 531, 74);
		frame.getContentPane().add(lblTitle);
	}
}
