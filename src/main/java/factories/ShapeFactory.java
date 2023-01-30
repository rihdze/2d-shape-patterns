package factories;

import shapes.Shape;


// 2. Factory Method: Create specific shape objects
public interface ShapeFactory {
    Shape createShape();
}

