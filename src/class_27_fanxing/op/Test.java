package class_27_fanxing.op;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle();
		//Rectangle rectangle = new Rectangle();
		//Shape shape = new Shape();
		
		List<Circle> shapes = new ArrayList<>();
		shapes.add(circle);
//		shapes.add(shape);
//		shapes.add(rectangle);
		
		
		Canvas canvas = new Canvas();
		canvas.drawAll(shapes);
	}
}
