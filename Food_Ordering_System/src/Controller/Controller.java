package Controller;

import java.util.ArrayList;
import java.util.HashMap;

import Model.Cart;
import Model.History;
import Model.Menu;
import Model.User;
import View.LogIn;

public class Controller {

	public User users;
	public ArrayList<User> userList = new ArrayList<User>();
	public ArrayList<Menu> menuMcDList = new ArrayList<Menu>();
	public ArrayList<Menu> menuKFCList = new ArrayList<Menu>();
	public ArrayList<Menu> menuPizzaHutList = new ArrayList<Menu>();
	public ArrayList<Cart> McDCart = new ArrayList<Cart>();
	public ArrayList<Cart> KFCCart = new ArrayList<Cart>();
	public ArrayList<Cart> PizzaHutCart = new ArrayList<Cart>();
	public ArrayList<History> HistoryList = new ArrayList<History>();
	public double total = 0;
	public boolean isListEmpty = true;
	public String currentUser = null;

	public Controller() {
		User user1 = new User("Ivan", "Ivan123", "21", "Male", "Penang", "0123456789");
		User user2 = new User("Wei", "Wei123", "21", "Male", "Johor", "0143728590");
		User user3 = new User("Goh", "Goh123", "21", "Male", "Perlis", "0195552833");
		User user4 = new User("Viha", "Viha123", "21", "Female", "Selangor", "0163312344");

		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);

		Menu item1 = new Menu("McChicken","McD",10);
		Menu item2 = new Menu("Fillet-O-Fish","McD",7);
		Menu item3 = new Menu("McNuggets","McD",5);
		Menu item4 = new Menu("Coca-cola","McD",3);
		Menu item5 = new Menu("Lemon Tea","McD",4);
		Menu item6 = new Menu("Iced Latte","McD",5);

		menuMcDList.add(item1);
		menuMcDList.add(item2);
		menuMcDList.add(item3);
		menuMcDList.add(item4);
		menuMcDList.add(item5);
		menuMcDList.add(item6);

		Menu item7 = new Menu("Zinger Burger","KFC",9);
		Menu item8 = new Menu("Cheesy Wedges","KFC",6);
		Menu item9 = new Menu("Golden Egg Burger","KFC",10);
		Menu item10 = new Menu("Coca-cola","KFC",3);
		Menu item11 = new Menu("Lemon Tea","KFC",4);
		Menu item12 = new Menu("Sprite","KFC",3);

		menuKFCList.add(item7);
		menuKFCList.add(item8);
		menuKFCList.add(item9);
		menuKFCList.add(item10);
		menuKFCList.add(item11);
		menuKFCList.add(item12);

		Menu item13 = new Menu("Chicken Pepperoni","PizzaHut",14);
		Menu item14 = new Menu("BBQ Chicken","PizzaHut",12);
		Menu item15 = new Menu("Spicy Tuna","PizzaHut",10);
		Menu item16 = new Menu("Coca-cola","PizzaHut",3);
		Menu item17 = new Menu("Lemon Tea","PizzaHut",4);
		Menu item18 = new Menu("Sprite","PizzaHut",3);

		menuPizzaHutList.add(item13);
		menuPizzaHutList.add(item14);
		menuPizzaHutList.add(item15);
		menuPizzaHutList.add(item16);
		menuPizzaHutList.add(item17);
		menuPizzaHutList.add(item18);

		History history1 = new History("O00022112", "McChicken, McNuggets, Coca-Cola", 3, 18, "Credit/Debit Card", "Ivan" );
		History history2 = new History("O00011133", "McNuggets, Coca-Cola", 2, 8, "Credit/Debit Card", "Ivan" );
		History history3 = new History("O00056732", "Chicken Pepperoni, BBQ Chicken, Coca-Cola", 3, 29, "Online Banking", "Ivan" );
		History history4 = new History("O00098223", "Zinger Burger, Cheesy Wedges, Golden Egg Burger", 3, 25, "Cash", "Ivan" );
		History history5 = new History("O00022113", "Chicken Pepperoni, Spicy Tuna", 2, 24, "Cash", "Wei" );
		History history6 = new History("O00011233", "Golden Egg Burger, Sprite", 2, 13, "Online Banking", "Wei" );
		History history7 = new History("O00064212", "McChicken, Fillet-O-Fish, McNuggets, Coca-cola", 4, 25, "Online Banking", "Wei" );
		History history8 = new History("O00041123", "Cheesy Wedges, Lemon Tea, Sprite", 3, 13, "Cash", "Goh" );
		History history9 = new History("O00023455", "Chicken Pepperoni, BBQ Chicken", 2, 26, "Online Banking", "Goh" );
		History history10 = new History("O00039871", "Zinger Burger, Coca-cola", 2, 12, "Credit/Debit Card", "Goh" );
		History history11 = new History("O00075542", "McChicken, Iced Latte", 2, 15, "Credit/Debit Card", "Viha" );
		History history12 = new History("O00054945", "Lemon Tea, Sprite", 2, 7, "Cash", "Viha" );
		History history13 = new History("O00034556", "Zinger Burger, Coca-cola, Lemon Tea", 3, 16, "Cash", "Viha" );
		History history14 = new History("O00078899", "McChicken, Fillet-O-Fish, McNuggets, Coca-cola, Lemon Tea", 5, 29, "Online Banking", "Viha" );
		History history15 = new History("O00032221", "Zinger Burger, Cheesy Wedges", 2, 15, "Credit/Debit Card", "Viha" );

		HistoryList.add(history1);
		HistoryList.add(history2);
		HistoryList.add(history3);
		HistoryList.add(history4);
		HistoryList.add(history5);
		HistoryList.add(history6);
		HistoryList.add(history7);
		HistoryList.add(history8);
		HistoryList.add(history9);
		HistoryList.add(history10);
		HistoryList.add(history11);
		HistoryList.add(history12);
		HistoryList.add(history13);
		HistoryList.add(history14);
		HistoryList.add(history15);
	}
	
	public void setVisibleLogin() {
		LogIn window = new LogIn();
		window.loginSetVisible();
	}

	public boolean verifyUser(String name, String password) {
		for (User user : userList) {
			if (user.getUsername().equals(name) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public User getUser(String username, String password) {
		for (User user : userList) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password))
				return user;
		}
		return null;
	}

	public Menu getMcDMenu(String name) {
		for (Menu menu: menuMcDList) {
			if (menu.getName().equals(name))
				return menu;
		}
		return null;
	}

	public Menu getKFCMenu(String name) {
		for (Menu menu: menuKFCList) {
			if (menu.getName().equals(name))
				return menu;
		}
		return null;
	}

	public Menu getPizzaHutMenu(String name) {
		for (Menu menu: menuPizzaHutList) {
			if (menu.getName().equals(name))
				return menu;
		}
		return null;
	}

	public void addMcDCart(String item, int quantity, User user) {
		if (quantity > 0) {
			isListEmpty = false;
			Menu menu = getMcDMenu(item);
			double totalItemPrice = menu.getPrice() * quantity;
			Cart cart = new Cart(item, quantity, totalItemPrice, user.getUsername());
			McDCart.add(cart);
		}	
	}

	public void addKFCCart(String item, int quantity, User user) {
		if (quantity > 0) {
			isListEmpty = false;
			Menu menu = getKFCMenu(item);
			double totalItemPrice = menu.getPrice() * quantity;
			Cart cart = new Cart(item, quantity, totalItemPrice, user.getUsername());
			KFCCart.add(cart);
		}	
	}

	public void addPizzaHutCart(String item, int quantity, User user) {
		if (quantity > 0) {
			isListEmpty = false;
			Menu menu = getPizzaHutMenu(item);
			double totalItemPrice = menu.getPrice() * quantity;
			Cart cart = new Cart(item, quantity, totalItemPrice, user.getUsername());
			PizzaHutCart.add(cart);
		}	
	}

	public double totalPrice(ArrayList<Cart> list) {
		double total = 0;
		for (Cart cart: list) {
			total+=cart.getPrice();
		}
		return total;
	}

	public void addHistory(ArrayList<Cart> list, String orderID, String paymentMethod) {
		HashMap<String, Cart> mergedItem = new HashMap<String, Cart>();
		for(Cart cart : list){
			if(mergedItem.containsKey(cart.getUser())){
				Cart existingItem = mergedItem.get(cart.getUser());

				String newItem = existingItem.getName() + ", " + cart.getName();
				int newQuantity = existingItem.getQuantity()  + cart.getQuantity();
				double newPrice = existingItem.getPrice() + cart.getPrice();
				String newUser = cart.getUser();

				existingItem.setName(newItem);
				existingItem.setQuantity(newQuantity);
				existingItem.setPrice(newPrice);
				existingItem.setUser(newUser);

				currentUser = newUser;
				
			} else {
				mergedItem.put(cart.getUser(), cart);
			}
		}
		if(list.size() > 1) {
			History history = new History(orderID, mergedItem.get(currentUser).getName(), 
					mergedItem.get(currentUser).getQuantity(), mergedItem.get(currentUser).getPrice(), paymentMethod, mergedItem.get(currentUser).getUser());

			HistoryList.add(history);
		}
		else {
			for(Cart cart : list){
				History history = new History(orderID, cart.getName(), 
						cart.getQuantity(), cart.getPrice(), paymentMethod, cart.getUser());

				HistoryList.add(history);
			}
		}
	}
}