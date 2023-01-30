package generators;

import Store.ShapeStore;
import observers.ShapeObserver;
import shapes.Shape;

// 3. Template Method: Define the steps of an algorithm, allowing subclasses to provide specific implementation
public abstract class ShapeGenerator {
    private ShapeObserver observer;
    private ShapeStore shapeStore;

    public ShapeGenerator(ShapeObserver observer) {
        this.observer = observer;
    }

    public void generateShape() {
        Shape shape = createShape();
        ShapeStore.getInstance().addShape(shape);
        observer.update();
    }

    protected abstract Shape createShape();
}

