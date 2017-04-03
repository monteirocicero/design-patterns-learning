package factory;

import AbstractFactory.AbstractFactory;
import AbstractFactory.Color;
import AbstractFactory.FactoryProducer;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		shouldGetShapeFactory();
		shouldGetColorFactory();

	}
	
	public static void shouldGetShapeFactory() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape = shapeFactory.getShape("CIRCLE");
//		Color circle = shapeFactory.getColor("CIRCLE");
//		circle.fill();
		shape.draw();
	}
	
	public static void shouldGetColorFactory() {
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color = colorFactory.getColor("RED");
		color.fill();
	}

}
