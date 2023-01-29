package factories;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.Random;

// 2. Factory Method: Create specific shape objects
public interface ShapeFactory {
    Shape createShape();
}

