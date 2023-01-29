import Store.ShapeStore;
import factories.CircleFactory;
import factories.RectangleFactory;
import factories.ShapeFactory;
import generators.CircleGenerator;
import generators.RectangleGenerator;
import generators.ShapeGenerator;

import iterators.ShapeIterator;
import iterators.ShapeStoreIterator;
import observers.ConsoleObserver;
import observers.ShapeObserver;
import shapes.Shape;
import states.BoldState;
import states.NormalState;
import states.ShapeState;


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