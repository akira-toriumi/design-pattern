package factory;

import factory.Auth.Auth;
import factory.Auth.AuthFactory;
import factory.Auth.User;

public class FactoryMain {

	public static void main(String[] args) {

		User userAdmin = new User(CodeConst.ROLE.ADMIN);
		Auth admin = new AuthFactory().Create(userAdmin);
		FactoryMain.resultOutput(admin);

		User userManager = new User(CodeConst.ROLE.MANAGER);
		Auth manager = new AuthFactory().Create(userManager);
		FactoryMain.resultOutput(manager);

		User userLeader = new User(CodeConst.ROLE.LEADER);
		Auth leader = new AuthFactory().Create(userLeader);
		FactoryMain.resultOutput(leader);

		User userStaff = new User(CodeConst.ROLE.STAFF);
		Auth staff = new AuthFactory().Create(userStaff);
		FactoryMain.resultOutput(staff);

		User userDefault = new User();
		Auth defaultObj = new AuthFactory().Create(userDefault);
		FactoryMain.resultOutput(defaultObj);

	}

	public static void resultOutput(Auth obj) {
		System.out.println("role : " + obj.getRole());

		if (obj.isAdmin()) System.out.println("管理者です");
		if (obj.isManager()) System.out.println("マネージャーです");
		if (obj.isLeader()) System.out.println("リーダーです");
		if (obj.isStaff()) System.out.println("スタッフです");
	}
}
