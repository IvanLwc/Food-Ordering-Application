package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Controller.Controller;
import Model.Cart;
import Model.User;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Payment {
	private JFrame frame;
	private JTextField txtTotal;
	private JTable table;
	private Controller controller;
	private User currentUser;
	private JTextField txtOrderID;
	int min = 1;  
	int max = 500;  

	public Payment(ArrayList<Cart> list, User currentUser) {
		this.currentUser = currentUser;
		initialize(list);
	}

	public void paymentSetVisible() {
		frame.setVisible(true);
	}

	private void initialize(ArrayList<Cart> list) {
		controller = new Controller();
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 573, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JComboBox<Object> cmbPayment = new JComboBox<Object>();
		cmbPayment.setBackground(new Color(255, 255, 255));
		cmbPayment.setModel(new DefaultComboBoxModel<Object>(new String[] {"Credit/Debit Card", "Online Banking", "Cash"}));
		cmbPayment.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cmbPayment.setBounds(173, 350, 133, 21);
		frame.getContentPane().add(cmbPayment);

		JLabel lblPaymentType = new JLabel("Payment Type:");
		lblPaymentType.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPaymentType.setBounds(173, 319, 109, 21);
		frame.getContentPane().add(lblPaymentType);

		txtTotal = new JTextField();
		txtTotal.setText("RM" + controller.totalPrice(list));
		txtTotal.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtTotal.setColumns(10);
		txtTotal.setBounds(328, 348, 119, 24);
		frame.getContentPane().add(txtTotal);

		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTotal.setBounds(328, 319, 47, 21);
		frame.getContentPane().add(lblTotal);


		JButton btnPay = new JButton("PAY");
		btnPay.setBackground(new Color(255, 255, 255));
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.addHistory(list, txtOrderID.getText(), cmbPayment.getSelectedItem().toString());
				JOptionPane.showMessageDialog(null, "Thank you for ordering");
				frame.setVisible(false);
				Home window = new Home(currentUser, controller.HistoryList);
				window.homeSetVisible(); 
			}
		});
		btnPay.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnPay.setBounds(457, 346, 92, 29);
		frame.getContentPane().add(btnPay);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 539, 224);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		String col[] = { "Item", "Quantity", "Price" };

		DefaultTableModel dtm = new DefaultTableModel(col, 0);

		for (int i = 0; i < list.size(); i++){
			String item = list.get(i).getName();
			int quantity = list.get(i).getQuantity();
			double price = list.get(i).getPrice();

			Object[] data = {item, quantity, price};

			dtm.addRow(data);
		}
		table.setModel(dtm);

		JLabel lblOrderId = new JLabel("Order ID:");
		lblOrderId.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblOrderId.setBounds(10, 318, 61, 21);
		frame.getContentPane().add(lblOrderId);

		txtOrderID = new JTextField();
		int orderID = (int)(Math.random()*(max-min+1)+min);   
		txtOrderID.setText("O00000"+ orderID);
		txtOrderID.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtOrderID.setColumns(10);
		txtOrderID.setBounds(10, 347, 119, 24);
		frame.getContentPane().add(txtOrderID);
		
		JLabel lblPayment = new JLabel("Payment");
		lblPayment.setOpaque(true);
		lblPayment.setHorizontalAlignment(SwingConstants.CENTER);
		lblPayment.setForeground(new Color(192, 0, 0));
		lblPayment.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblPayment.setBackground(new Color(250, 128, 114));
		lblPayment.setBounds(0, 0, 559, 74);
		frame.getContentPane().add(lblPayment);
	}
}
