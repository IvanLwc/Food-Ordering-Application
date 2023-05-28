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

public class PizzaHut {

	private JFrame frame;
	private Controller controller;
	private User currentUser;
	
	public PizzaHut(User currentUser) {
		this.currentUser = currentUser;
		initialize();
	}
	
	public void PizzaHutSetVisible() {
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
		
		JPanel panelChickenPepperoni = new JPanel();
		panelChickenPepperoni.setBorder(null);
		panelChickenPepperoni.setBounds(10, 84, 539, 239);
		frame.getContentPane().add(panelChickenPepperoni);
		panelChickenPepperoni.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panelChickenPepperoni1 = new JPanel();
		panelChickenPepperoni1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChickenPepperoni.add(panelChickenPepperoni1);
		panelChickenPepperoni1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelChickenPepperoni2 = new JPanel();
		panelChickenPepperoni1.add(panelChickenPepperoni2);
		panelChickenPepperoni2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblChickenPeppeorini = new JLabel("Chicken Pepperoni");
		lblChickenPeppeorini.setHorizontalAlignment(SwingConstants.CENTER);
		lblChickenPeppeorini.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelChickenPepperoni2.add(lblChickenPeppeorini);
		
		JLabel lblRm_5 = new JLabel("RM14");
		lblRm_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelChickenPepperoni2.add(lblRm_5);
		
		JSpinner ChickenPepperoniQuantity = new JSpinner();
		ChickenPepperoniQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelChickenPepperoni1.add(ChickenPepperoniQuantity);
		
		JPanel panelCocaCola = new JPanel();
		panelCocaCola.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChickenPepperoni.add(panelCocaCola);
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
		
		JPanel panelbbqchicken = new JPanel();
		panelbbqchicken.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChickenPepperoni.add(panelbbqchicken);
		panelbbqchicken.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelbbqchicken1 = new JPanel();
		panelbbqchicken.add(panelbbqchicken1);
		panelbbqchicken1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblBbqChicken = new JLabel("BBQ Chicken");
		lblBbqChicken.setHorizontalAlignment(SwingConstants.CENTER);
		lblBbqChicken.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelbbqchicken1.add(lblBbqChicken);
		
		JLabel lblRm_6 = new JLabel("RM12");
		lblRm_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelbbqchicken1.add(lblRm_6);
		
		JSpinner BBQChickenQuantity = new JSpinner();
		BBQChickenQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelbbqchicken.add(BBQChickenQuantity);
		
		JPanel panellemontea = new JPanel();
		panellemontea.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChickenPepperoni.add(panellemontea);
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
		
		JPanel panelspicytuna1panelspicytuna1panelspicytuna = new JPanel();
		panelspicytuna1panelspicytuna1panelspicytuna.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChickenPepperoni.add(panelspicytuna1panelspicytuna1panelspicytuna);
		panelspicytuna1panelspicytuna1panelspicytuna.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelspicytuna1 = new JPanel();
		panelspicytuna1panelspicytuna1panelspicytuna.add(panelspicytuna1);
		panelspicytuna1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblSpicyTuna = new JLabel("Spicy Tuna");
		lblSpicyTuna.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpicyTuna.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelspicytuna1.add(lblSpicyTuna);
		
		JLabel lblRm_2 = new JLabel("RM10");
		lblRm_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelspicytuna1.add(lblRm_2);
		
		JSpinner SpicyTunaQuantity = new JSpinner();
		SpicyTunaQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelspicytuna1panelspicytuna1panelspicytuna.add(SpicyTunaQuantity);
		
		JPanel panelSprite = new JPanel();
		panelSprite.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelChickenPepperoni.add(panelSprite);
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
				int quantityChickenPepperoni = (int) ChickenPepperoniQuantity.getValue();
				int quantityBBQChicken = (int) BBQChickenQuantity.getValue();
				int quantitySpicyTuna = (int) SpicyTunaQuantity.getValue();
				int quantityCola = (int) ColaQuantity.getValue();
				int quantityLemonTea = (int) LemonTeaQuantity.getValue();
				int quantitySprite = (int) SpriteQuantity.getValue();
			
				controller.addPizzaHutCart("Chicken Pepperoni", quantityChickenPepperoni, currentUser);
				controller.addPizzaHutCart("BBQ Chicken", quantityBBQChicken, currentUser);
				controller.addPizzaHutCart("Spicy Tuna", quantitySpicyTuna, currentUser);
				controller.addPizzaHutCart("Coca-cola", quantityCola, currentUser);
				controller.addPizzaHutCart("Lemon Tea", quantityLemonTea, currentUser);
				controller.addPizzaHutCart("Sprite", quantitySprite, currentUser);
				
				if(controller.isListEmpty == true) {
					JOptionPane.showMessageDialog(null, "Error: Please select item");
				}
				else {
					frame.setVisible(false);
					Payment window = new Payment(controller.PizzaHutCart, currentUser);
					window.paymentSetVisible();
				}	
			}
		});
		btnAddToCart.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnAddToCart.setBounds(378, 333, 171, 29);
		frame.getContentPane().add(btnAddToCart);
		
		JLabel lblPizzaHut = new JLabel("PizzaHut");
		lblPizzaHut.setOpaque(true);
		lblPizzaHut.setHorizontalAlignment(SwingConstants.CENTER);
		lblPizzaHut.setForeground(new Color(192, 0, 0));
		lblPizzaHut.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblPizzaHut.setBackground(new Color(250, 128, 114));
		lblPizzaHut.setBounds(0, 0, 559, 74);
		frame.getContentPane().add(lblPizzaHut);
	}

}
