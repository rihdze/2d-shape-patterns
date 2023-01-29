package iterators;


import Store.ShapeStore;

public class ShapeStoreIterator implements ShapeIterator {
    private ShapeStore shapeStore;
    private int index;

    public ShapeStoreIterator(ShapeStore shapeStore) {
        this.shapeStore = shapeStore;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < shapeStore.getShapes().size();
    }

    @Override
    public shapes.Shape next() {
        return shapeStore.getShapes().get(index++);
    }
}