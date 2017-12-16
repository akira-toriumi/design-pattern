package factory.Auth.impl;

import factory.Auth.Auth;
import factory.Auth.User;

public class Admin extends Auth {

	public Admin(User user) {
		super(user);
	}

	@Override
	public boolean isAdmin() {
		return true;
	}

	@Override
	public boolean isManager() {
		return false;
	}

	@Override
	public boolean isLeader() {
		return false;
	}

	@Override
	public boolean isStaff() {
		return false;
	}

}
