// Non-creational patterns
// 1. Observer: Notify clients when a new shape is added to the store
interface ShapeObserver {
    void update();
}

class ConsoleObserver implements ShapeObserver {
    @Override
    public void update() {
        System.out.println("A new shape was added to the store");
    }
}