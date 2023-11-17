package factory;

import furniture.Chair;
import furniture.ClassicChair;
import furniture.ClassicTable;
import furniture.Table;

public class ClassicFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
