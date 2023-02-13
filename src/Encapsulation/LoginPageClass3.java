package Encapsulation;

public class LoginPageClass3 {

	// No one can access them Directly ..
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// We can Generate Get() & set() easily ....
	// RightClick ---Source --Geberate Getters() & Setters()

}
