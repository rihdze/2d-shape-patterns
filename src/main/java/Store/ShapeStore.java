package Store;

import java.util.ArrayList;
import java.util.List;


// Creational pattern: Singleton
public class ShapeStore {
    private static ShapeStore instance;
    private List<shapes.Shape> shapes;

    private ShapeStore() {
        shapes = new ArrayList<>();
    }

    public static ShapeStore getInstance() {
        if (instance == null) {
            instance = new ShapeStore();
        }
        return instance;
    }

    public void addShape(shapes.Shape shape) {
        shapes.add(shape);
    }

    public List<shapes.Shape> getShapes() {
        return shapes;
    }
}