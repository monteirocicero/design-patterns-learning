package singleton;

public class SingleObject {
	
	private static SingleObject instance;
	
	private SingleObject() {};
	
	public static SingleObject getInstance() {
		if (null == instance) {
			 System.out.println("Creating new instance");
			 instance = new SingleObject();
			return instance;
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello world!");
	}

}
