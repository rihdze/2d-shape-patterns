package states;

import shapes.Shape;

// 4. State: Allow an object to alter its behavior when its internal state changes
public interface ShapeState {
    void draw(Shape shape);
}

