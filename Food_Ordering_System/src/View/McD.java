package View;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import Controller.Controller;
import Model.User;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class McD {

	private JFrame frame;
	private Controller controller;
	private User currentUser;
	

	public McD(User currentUser) {
		this.currentUser = currentUser;
		initialize();
	}
	
	public void McDSetVisible() {
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
		
		JPanel panelMcChicken = new JPanel();
		panelMcChicken.setBorder(null);
		panelMcChicken.setBounds(10, 84, 539, 239);
		frame.getContentPane().add(panelMcChicken);
		panelMcChicken.setLayout(new GridLayout(3, 2, 0, 0));
		
		JPanel panelMcChicken1 = new JPanel();
		panelMcChicken1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMcChicken.add(panelMcChicken1);
		panelMcChicken1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelMcChicken2 = new JPanel();
		panelMcChicken1.add(panelMcChicken2);
		panelMcChicken2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblMcchicken = new JLabel("McChicken");
		lblMcchicken.setHorizontalAlignment(SwingConstants.CENTER);
		lblMcchicken.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelMcChicken2.add(lblMcchicken);
		
		JLabel lblRm = new JLabel("RM10");
		lblRm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelMcChicken2.add(lblRm);
		
		JSpinner McChickenQuantity = new JSpinner();
		McChickenQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelMcChicken1.add(McChickenQuantity);
		
		JPanel panelCocaCola = new JPanel();
		panelCocaCola.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMcChicken.add(panelCocaCola);
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
		
		JPanel panelfillet = new JPanel();
		panelfillet.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMcChicken.add(panelfillet);
		panelfillet.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelfillet1 = new JPanel();
		panelfillet.add(panelfillet1);
		panelfillet1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblFilletofish = new JLabel("Fillet-O-Fish");
		lblFilletofish.setHorizontalAlignment(SwingConstants.CENTER);
		lblFilletofish.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelfillet1.add(lblFilletofish);
		
		JLabel lblRm_6 = new JLabel("RM7");
		lblRm_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelfillet1.add(lblRm_6);
		
		JSpinner FilletQuantity = new JSpinner();
		FilletQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelfillet.add(FilletQuantity);
		
		JPanel panellemontea = new JPanel();
		panellemontea.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMcChicken.add(panellemontea);
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
		
		JPanel panelMcNuggets = new JPanel();
		panelMcNuggets.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMcChicken.add(panelMcNuggets);
		panelMcNuggets.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelMcNuggets1 = new JPanel();
		panelMcNuggets.add(panelMcNuggets1);
		panelMcNuggets1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblMcnuggets = new JLabel("McNuggets");
		lblMcnuggets.setHorizontalAlignment(SwingConstants.CENTER);
		lblMcnuggets.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelMcNuggets1.add(lblMcnuggets);
		
		JLabel lblRm_2 = new JLabel("RM5");
		lblRm_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelMcNuggets1.add(lblRm_2);
		
		JSpinner McNuggetsQuantity = new JSpinner();
		McNuggetsQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelMcNuggets.add(McNuggetsQuantity);
		
		JPanel panelIcedLatte = new JPanel();
		panelIcedLatte.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelMcChicken.add(panelIcedLatte);
		panelIcedLatte.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panelIcedLatte2 = new JPanel();
		panelIcedLatte.add(panelIcedLatte2);
		panelIcedLatte2.setLayout(new GridLayout(2, 0, 0, 0));
		
		JLabel lblIcedLatte = new JLabel("Iced Latte");
		lblIcedLatte.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcedLatte.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelIcedLatte2.add(lblIcedLatte);
		
		JLabel lblRm_3 = new JLabel("RM5");
		lblRm_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRm_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelIcedLatte2.add(lblRm_3);
		
		JSpinner IcedLatteQuantity = new JSpinner();
		IcedLatteQuantity.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		panelIcedLatte.add(IcedLatteQuantity);
		
		JButton btnAddToCart = new JButton("ADD TO CART");
		btnAddToCart.setBackground(new Color(255, 255, 255));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quantityMcChicken = (int) McChickenQuantity.getValue();
				int quantityFillet = (int) FilletQuantity.getValue();
				int quantityMcNuggets = (int) McNuggetsQuantity.getValue();
				int quantityCola = (int) ColaQuantity.getValue();
				int quantityLemonTea = (int) LemonTeaQuantity.getValue();
				int quantityIcedLatte = (int) IcedLatteQuantity.getValue();
				
				controller.addMcDCart("McChicken", quantityMcChicken, currentUser);
				controller.addMcDCart("Fillet-O-Fish", quantityFillet, currentUser);
				controller.addMcDCart("McNuggets", quantityMcNuggets, currentUser);
				controller.addMcDCart("Coca-cola", quantityCola, currentUser);
				controller.addMcDCart("Lemon Tea", quantityLemonTea, currentUser);
				controller.addMcDCart("Iced Latte", quantityIcedLatte, currentUser);
				
				if(controller.isListEmpty == true) {
					JOptionPane.showMessageDialog(null, "Error: Please select item");
				}
				else {
					frame.setVisible(false);
					Payment window = new Payment(controller.McDCart, currentUser);
					window.paymentSetVisible();
				}
			}
		});
		btnAddToCart.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnAddToCart.setBounds(378, 333, 171, 29);
		frame.getContentPane().add(btnAddToCart);
		
		JLabel lblMacDonals = new JLabel("McDonald's");
		lblMacDonals.setOpaque(true);
		lblMacDonals.setHorizontalAlignment(SwingConstants.CENTER);
		lblMacDonals.setForeground(new Color(192, 0, 0));
		lblMacDonals.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblMacDonals.setBackground(new Color(250, 128, 114));
		lblMacDonals.setBounds(0, 0, 559, 74);
		frame.getContentPane().add(lblMacDonals);
	}
}
