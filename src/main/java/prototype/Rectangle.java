package prototype;

public class Rectangle extends Shape {
	
	public Rectangle() {
		this.type = "Rectangule";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangule::draw() method.");
	}

}
