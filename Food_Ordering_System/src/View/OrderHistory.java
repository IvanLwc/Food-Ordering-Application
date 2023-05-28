package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controller.Controller;
import Model.History;
import Model.User;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class OrderHistory {

	private JFrame frame;
	private JTable table;
	private Controller controller;
	private User currentUser;
	private ArrayList<History> list;

	public OrderHistory(User currentUser, ArrayList<History> list)
	{
		this.currentUser = currentUser;
		this.list = list;
		initialize();
	}

	public OrderHistory(User currentUser)
	{
		this(currentUser, null);
		initialize();
	}


	public void historySetVisible() {
		frame.setVisible(true);
	}

	private void initialize() {
		controller = new Controller();
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(255, 228, 225));
		frame.setBounds(100, 100, 640, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JButton btnBack = new JButton("BACK");
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Home window = new Home(currentUser, controller.HistoryList);
				window.homeSetVisible();
			}
		});
		btnBack.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnBack.setBounds(10, 370, 92, 29);
		frame.getContentPane().add(btnBack);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 89, 606, 271);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		JLabel lblTitle = new JLabel("Order History");
		lblTitle.setOpaque(true);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(192, 0, 0));
		lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 35));
		lblTitle.setBackground(new Color(250, 128, 114));
		lblTitle.setBounds(0, 0, 626, 74);
		frame.getContentPane().add(lblTitle);

		String col[] = { "OrderID", "Item", "Quantity", "Price", "Payment Method", "User" };

		if(list != null) {

			DefaultTableModel dtm = new DefaultTableModel(col, 0);
			for (int i = 0; i < list.size(); i++){
				if(currentUser.getUsername().equals(list.get(i).getUser())){
					String orderID = list.get(i).getOrderID();
					String item = list.get(i).getItem();
					int quantity = list.get(i).getQuantity();
					double price = list.get(i).getPrice();
					String paymentMethod = list.get(i).getPaymentMethod();
					String user = list.get(i).getUser();

					Object[] data = {orderID, item, quantity, price, paymentMethod, user};

					dtm.addRow(data);
				}
			}
			table.setModel(dtm);
		}
		else {
			DefaultTableModel dtm = new DefaultTableModel(col, 0);
			for (int i = 0; i < controller.HistoryList.size(); i++){
				if(currentUser.getUsername().equals(controller.HistoryList.get(i).getUser())){
					String orderID = controller.HistoryList.get(i).getOrderID();
					String item = controller.HistoryList.get(i).getItem();
					int quantity = controller.HistoryList.get(i).getQuantity();
					double price = controller.HistoryList.get(i).getPrice();
					String paymentMethod = controller.HistoryList.get(i).getPaymentMethod();
					String user = controller.HistoryList.get(i).getUser();

					Object[] data = {orderID, item, quantity, price, paymentMethod, user};

					dtm.addRow(data);
				}
			}
			table.setModel(dtm);
		}
	}
}