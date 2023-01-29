package factories;

import shapes.Circle;
import shapes.Shape;

import java.util.Random;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        Random random = new Random();
        int radius = random.nextInt(100);
        return new Circle(radius);
    }
}
