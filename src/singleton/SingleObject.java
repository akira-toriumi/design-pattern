package singleton;

public class SingleObject {

	private static SingleObject m_Single = new SingleObject();
	private SingleObject() {}

	public static SingleObject getInstance() {
		return m_Single;
	}

	public String getMessage() {
		return "Hello!";
	}
}
