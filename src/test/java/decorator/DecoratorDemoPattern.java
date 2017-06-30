package decorator;

import factory.Circle;
import factory.Rectangule;
import factory.Shape;

public class DecoratorDemoPattern {

	public static void main(String[] args) {
		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		
		Shape redRetangule = new RedShapeDecorator(new Rectangule());
		System.out.println("Rectangule with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		System.out.println("\nRectangule of red border");
		redRetangule.draw();
	}

}
