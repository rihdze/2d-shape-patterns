import java.util.Random;

// 2. Factory Method: Create specific shape objects
interface ShapeFactory {
    Shape createShape();
}

class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        Random random = new Random();
        int radius = random.nextInt(100);
        return new Circle(radius);
    }
}

class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        Random random = new Random();
        int width = random.nextInt(100);
        int height = random.nextInt(100);
        return new Rectangle(width, height);
    }
}