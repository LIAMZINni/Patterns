package factory;

import items.Chair;
import items.Furniture;

public class ChairFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
