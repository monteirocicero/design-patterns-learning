package AbstractFactory;

import factory.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		
		if (null == color) {
			return null;
		}
		
		if ("RED".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("GREEN".equalsIgnoreCase(color)) {
			return new Green();
		} else if ("BLUE".equalsIgnoreCase(color)) {
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
