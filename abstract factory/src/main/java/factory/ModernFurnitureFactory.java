package factory;

import furniture.Chair;
import furniture.ModernChair;
import furniture.ModernTable;
import furniture.Table;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
