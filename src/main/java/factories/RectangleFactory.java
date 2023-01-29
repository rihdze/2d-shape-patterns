package factories;

import shapes.Rectangle;
import shapes.Shape;

import java.util.Random;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        Random random = new Random();
        int width = random.nextInt(100);
        int height = random.nextInt(100);
        return new Rectangle(width, height);
    }
}
