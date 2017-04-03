package singleton;

import singleton.SingleObject;

public class SinglePatternDemoTest {

	public static void main(String[] args) {
		
		SingleObject singleObject = SingleObject.getInstance();
		
		singleObject.showMessage();
		
		SingleObject singleObject2 = SingleObject.getInstance();
		
		singleObject2.showMessage();
		

	}

}
