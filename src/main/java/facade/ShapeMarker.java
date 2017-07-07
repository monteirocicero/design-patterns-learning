package facade;

import factory.Circle;
import factory.Rectangule;
import factory.Shape;
import factory.Square;

public class ShapeMarker {

	private Shape circle;
	private Shape rectangule;
	private Shape square;

	public ShapeMarker() {
		circle = new Circle();
		rectangule = new Rectangule();
		square = new Square();
	}
	
	public void drawRectangule() {
		rectangule.draw();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	

}
