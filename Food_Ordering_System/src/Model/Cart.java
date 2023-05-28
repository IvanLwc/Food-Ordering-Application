package Model;

public class Cart {
	private String name;
	private int quantity;
	private double price;
	private String user;
	
	public Cart(String name, int quantity, double price, String user) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.user = user;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
