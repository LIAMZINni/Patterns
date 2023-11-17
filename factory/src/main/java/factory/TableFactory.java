package factory;

import items.Furniture;
import items.Table;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
