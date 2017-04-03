package factory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Color;

public class ShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shapeType) {
		if (null == shapeType) {
			return null;
		}
		
		if ("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("RECTANGULE".equalsIgnoreCase(shapeType)) {
			return new Rectangule();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
	
	public Color getColor(String color) {
		return null;
	}
	

}
