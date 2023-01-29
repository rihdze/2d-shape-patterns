package states;

import shapes.Shape;

public class NormalState implements ShapeState {
    @Override
    public void draw(Shape shape) {
        shape.draw();
    }
}
