package factory.Auth;

import factory.CodeConst;

public class User {

	private String role = CodeConst.ROLE.STAFF;

	public User() {}
	public User(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
