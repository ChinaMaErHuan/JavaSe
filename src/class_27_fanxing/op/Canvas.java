package class_27_fanxing.op;

import java.util.List;

public class Canvas{
	public void drawAll(List<? extends Shape> shape){
		for (Shape shape2 : shape) {
			shape2.draw(this);
		}
	}
}
