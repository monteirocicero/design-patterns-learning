package factory;

public class ShapeFactoryTest {
	
	private static ShapeFactory shapeFactory = new ShapeFactory();
	
	
	public static void main(String[] args) {
		shouldGetShapeCircle();
		
		shoulGetShapeRectangule();
		
		shouldGetShapeSquare();
	}

	public static void shouldGetShapeCircle() {
		
		Shape circle = shapeFactory.getShape("CIRCLE");
		
		circle.draw();
	}
	
	public static void shoulGetShapeRectangule() {
		Shape rectangule = shapeFactory.getShape("RECTANGULE");
		
		rectangule.draw();
	}
	
	public static void shouldGetShapeSquare() {
		Shape square = shapeFactory.getShape("SQUARE");
		
		square.draw();
	}
	

}
