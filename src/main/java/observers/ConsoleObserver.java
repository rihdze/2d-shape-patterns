package observers;

public class ConsoleObserver implements ShapeObserver {
    @Override
    public void update() {
        System.out.println("A new shape was added to the store");
    }
}
