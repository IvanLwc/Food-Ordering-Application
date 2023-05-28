package Model;

public class Menu {
	private String name,restaurant;
	private double price;
	
	public Menu(String name, String restaurant, double price) {
		this.name = name;
		this.restaurant = restaurant;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

}
