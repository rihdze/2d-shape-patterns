// 4. State: Allow an object to alter its behavior when its internal state changes
interface ShapeState {
    void draw(Shape shape);
}

class NormalState implements ShapeState {
    @Override
    public void draw(Shape shape) {
        shape.draw();
    }
}

class BoldState implements ShapeState {
    @Override
    public void draw(Shape shape) {
        System.out.println("Drawing shape in bold...");
        shape.draw();
    }
}