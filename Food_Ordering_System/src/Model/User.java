package Model;

public class User {
	private String username, password, age, gender, address, phonenumber;
	
	public User(String username, String password, String age, String gender, String address, String phonenumber) {	
		this.username = username;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phonenumber = phonenumber;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhoneNumber() {
		return phonenumber;
	}
}
