package Model;

public class History {
	private String orderID;
	private String item;
	private int quantity;
	private double price;
	private String paymentMethod;
	private String user;
	
	public History(String orderID, String item, int quantity, double price, String paymentMethod, String user) {
		this.orderID = orderID;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
		this.paymentMethod = paymentMethod;
		this.user = user;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
}
