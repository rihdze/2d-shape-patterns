public class Main {
    public static void main(String[] args) {
        ShapeObserver observer = new ConsoleObserver();
        ShapeFactory circleFactory = new CircleFactory();
        ShapeGenerator circleGenerator = new CircleGenerator(observer, circleFactory);

        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeGenerator rectangleGenerator = new RectangleGenerator(observer, rectangleFactory);

        circleGenerator.generateShape();
        rectangleGenerator.generateShape();

        ShapeStore shapeStore = ShapeStore.getInstance();
        ShapeIterator iterator = new ShapeStoreIterator(shapeStore);
        ShapeState normalState = new NormalState();
        ShapeState boldState = new BoldState();

        while (iterator.hasNext()) {
            Shape shape = iterator.next();
            normalState.draw(shape);
            boldState.draw(shape);
        }
    }
}