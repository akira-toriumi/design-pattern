package singleton;

public class SingletonMain {

	public static void main(String[] args) {
		SingleObject obj = SingleObject.getInstance();
		System.out.println(obj.getMessage());
	}
}
