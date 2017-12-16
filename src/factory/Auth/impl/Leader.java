package factory.Auth.impl;

import factory.Auth.Auth;
import factory.Auth.User;

public class Leader extends Auth {

	public Leader(User user) {
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
		return true;
	}

	@Override
	public boolean isStaff() {
		return false;
	}

}
