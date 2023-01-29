package states;

import shapes.Shape;

public class BoldState implements ShapeState {
    @Override
    public void draw(Shape shape) {
        System.out.println("Drawing shape in bold...");
        shape.draw();
    }
}
