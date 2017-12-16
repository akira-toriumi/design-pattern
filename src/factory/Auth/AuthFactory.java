package factory.Auth;

import factory.CodeConst;
import factory.Auth.impl.Admin;
import factory.Auth.impl.Leader;
import factory.Auth.impl.Manager;
import factory.Auth.impl.Staff;

public class AuthFactory {

	public Auth Create(User user) {
		switch (user.getRole()) {
		case CodeConst.ROLE.ADMIN:
			return new Admin(user);

		case CodeConst.ROLE.MANAGER:
			return new Manager(user);

		case CodeConst.ROLE.LEADER:
			return new Leader(user);

		case CodeConst.ROLE.STAFF:
			return new Staff(user);

		default:
			return new Staff(user);

		}
	}
}
