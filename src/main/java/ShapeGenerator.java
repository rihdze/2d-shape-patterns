// 3. Template Method: Define the steps of an algorithm, allowing subclasses to provide specific implementation
abstract class ShapeGenerator {
    ShapeObserver observer;

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

class CircleGenerator extends ShapeGenerator {
    private ShapeFactory factory;

    public CircleGenerator(ShapeObserver observer, ShapeFactory factory) {
        super(observer);
        this.factory = factory;
    }

    @Override
    protected Shape createShape() {
        return factory.createShape();
    }
}

class RectangleGenerator extends ShapeGenerator {
    private ShapeFactory factory;

    public RectangleGenerator(ShapeObserver observer, ShapeFactory factory) {
        super(observer);
        this.factory = factory;
    }

    @Override
    protected Shape createShape() {
        return factory.createShape();
    }
}