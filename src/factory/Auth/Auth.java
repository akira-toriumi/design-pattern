package factory.Auth;

public abstract class Auth {

	private User m_user;

	public Auth(User user) {
		this.m_user = user;
	}

	public String getRole() {
		return m_user.getRole();
	}

	public abstract boolean isAdmin();
	public abstract boolean isManager();
	public abstract boolean isLeader();
	public abstract boolean isStaff();
}
