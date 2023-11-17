package factory;

import items.Closet;
import items.Furniture;

public class ClosetFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Closet();
    }
}
