package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import Controller.Controller;
import Model.User;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KFC {

	private JFrame frame;
	private JPanel panelZingerBurger1;
	private Controller controller;
	private User currentUser;
	
	public KFC(User currentUser) {
		this.currentUser = currentUser;
		initialize();
	}
	
	public void KFCSetVisible() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		controller = new Controller();
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 573, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				MakeOrder window = new MakeOrder(currentUser);
				window.makeOrderSetVisible();
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnBack.setBounds(10, 333, 101, 29);
		frame.getContentPane().add(btnBack);
		
		JPanel panelZingerBurger = new JPanel();
		panelZingerBurger.setBorder(null);
		panelZingerBurger.setBounds(10, 84, 539, 239);
		frame.getContentPane().add(panelZingerBurger);
		panelZingerBurger.setLayout(new GridLayout(3, 2, 0, 0));
		
		panelZingerBurger1 = new JPanel();
		panelZingerBurger1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelZingerBurger.add(panelZingerBurger1);
		panelZingerBurger1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelZingerBurger2 = new JPanel();
		panelZingerBurger1.add(panelZingerBurger2);
		panelZingerBurger2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblZingerBurger = new JLabel("Zinger Burger");
		lblZingerBurger.setHorizontalAlignment(SwingConstants.CENTER);
		lblZingerBurger.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelZingerBurger2.add(lblZingerBurger);
		
		JLabel lblRm_5 = new JLabel("RM9");
		lblRm_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelZingerBurger2.add(lblRm_5);
		
		JSpinner ZingerBurgerQuantity = new JSpinner();
		ZingerBurgerQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelZingerBurger1.add(ZingerBurgerQuantity);
		
		JPanel panelCocaCola = new JPanel();
		panelCocaCola.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelZingerBurger.add(panelCocaCola);
		panelCocaCola.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelCocaCola1 = new JPanel();
		panelCocaCola.add(panelCocaCola1);
		panelCocaCola1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblCocacola = new JLabel("Coca-Cola");
		lblCocacola.setHorizontalAlignment(SwingConstants.CENTER);
		lblCocacola.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelCocaCola1.add(lblCocacola);
		
		JLabel lblRm_4 = new JLabel("RM3");
		lblRm_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelCocaCola1.add(lblRm_4);
		
		JSpinner ColaQuantity = new JSpinner();
		ColaQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelCocaCola.add(ColaQuantity);
		
		JPanel panelcheesywedges = new JPanel();
		panelcheesywedges.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelZingerBurger.add(panelcheesywedges);
		panelcheesywedges.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelcheesywedges1 = new JPanel();
		panelcheesywedges.add(panelcheesywedges1);
		panelcheesywedges1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblCheesyWedges = new JLabel("Cheesy Wedges");
		lblCheesyWedges.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheesyWedges.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelcheesywedges1.add(lblCheesyWedges);
		
		JLabel lblRm_6 = new JLabel("RM6");
		lblRm_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelcheesywedges1.add(lblRm_6);
		
		JSpinner CheesyWedgesQuantity = new JSpinner();
		CheesyWedgesQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelcheesywedges.add(CheesyWedgesQuantity);
		
		JPanel panellemontea = new JPanel();
		panellemontea.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelZingerBurger.add(panellemontea);
		panellemontea.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panellemontea1 = new JPanel();
		panellemontea.add(panellemontea1);
		panellemontea1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblLemonTea = new JLabel("Lemon Tea");
		lblLemonTea.setHorizontalAlignment(SwingConstants.CENTER);
		lblLemonTea.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panellemontea1.add(lblLemonTea);
		
		JLabel lblRm_1 = new JLabel("RM4");
		lblRm_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panellemontea1.add(lblRm_1);
		
		JSpinner LemonTeaQuantity = new JSpinner();
		LemonTeaQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panellemontea.add(LemonTeaQuantity);
		
		JPanel panelGoldenEggBurger = new JPanel();
		panelGoldenEggBurger.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelZingerBurger.add(panelGoldenEggBurger);
		panelGoldenEggBurger.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelGoldenEggBurger1 = new JPanel();
		panelGoldenEggBurger.add(panelGoldenEggBurger1);
		panelGoldenEggBurger1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblGoldenEggBurger = new JLabel("Golden Egg Burger");
		lblGoldenEggBurger.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoldenEggBurger.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelGoldenEggBurger1.add(lblGoldenEggBurger);
		
		JLabel lblRm_2 = new JLabel("RM10");
		lblRm_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelGoldenEggBurger1.add(lblRm_2);
		
		JSpinner GoldenEggBurgerQuantity = new JSpinner();
		GoldenEggBurgerQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelGoldenEggBurger.add(GoldenEggBurgerQuantity);
		
		JPanel panelSprite = new JPanel();
		panelSprite.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelZingerBurger.add(panelSprite);
		panelSprite.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelSprite2 = new JPanel();
		panelSprite.add(panelSprite2);
		panelSprite2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblSprite = new JLabel("Sprite");
		lblSprite.setHorizontalAlignment(SwingConstants.CENTER);
		lblSprite.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelSprite2.add(lblSprite);
		
		JLabel lblRm_3 = new JLabel("RM3");
		lblRm_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelSprite2.add(lblRm_3);
		
		JSpinner SpriteQuantity = new JSpinner();
		SpriteQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelSprite.add(SpriteQuantity);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.setBackground(new Color(255, 255, 255));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantityZingerBurger = (int) ZingerBurgerQuantity.getValue();
				int quantityCheesyWedges = (int) CheesyWedgesQuantity.getValue();
				int quantityGoldenEggBurger = (int) GoldenEggBurgerQuantity.getValue();
				int quantityCola = (int) ColaQuantity.getValue();
				int quantityLemonTea = (int) LemonTeaQuantity.getValue();
				int quantitySprite = (int) SpriteQuantity.getValue();
			
				controller.addKFCCart("Zinger Burger", quantityZingerBurger, currentUser);
				controller.addKFCCart("Cheesy Wedges", quantityCheesyWedges, currentUser);
				controller.addKFCCart("Golden Egg Burger", quantityGoldenEggBurger, currentUser);
				controller.addKFCCart("Coca-cola", quantityCola, currentUser);
				controller.addKFCCart("Lemon Tea", quantityLemonTea, currentUser);
				controller.addKFCCart("Sprite", quantitySprite, currentUser);
				
				if(controller.isListEmpty == true) {
					JOptionPane.showMessageDialog(null, "Error: Please select item");
				}
				else {
					frame.setVisible(false);
					Payment window = new Payment(controller.KFCCart, currentUser);
					window.paymentSetVisible();
				}
			}
		});
		btnAddToCart.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnAddToCart.setBounds(378, 333, 171, 29);
		frame.getContentPane().add(btnAddToCart);
		
		JLabel lblTitle = new JLabel("Kentucky Fried Chicken");
		lblTitle.setOpaque(true);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(192, 0, 0));
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblTitle.setBackground(new Color(250, 128, 114));
		lblTitle.setBounds(0, 0, 559, 74);
		frame.getContentPane().add(lblTitle);
	}

}
