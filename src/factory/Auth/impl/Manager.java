package factory.Auth.impl;

import factory.Auth.Auth;
import factory.Auth.User;

public class Manager extends Auth {

	public Manager(User user) {
		super(user);
	}

	@Override
	public boolean isAdmin() {
		return false;
	}

	@Override
	public boolean isManager() {
		return true;
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
