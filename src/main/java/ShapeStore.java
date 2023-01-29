
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


// Creational pattern: Singleton
class ShapeStore {
    private static ShapeStore instance;
    private List<Shape> shapes;

    private ShapeStore() {
        shapes = new ArrayList<>();
    }

    public static ShapeStore getInstance() {
        if (instance == null) {
            instance = new ShapeStore();
        }
        return instance;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}