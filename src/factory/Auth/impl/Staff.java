package factory.Auth.impl;

import factory.Auth.Auth;
import factory.Auth.User;

public class Staff extends Auth {

	public Staff(User user) {
		super(user);
	}

	@Override
	public boolean isAdmin() {
		return false;
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
		return true;
	}

}
