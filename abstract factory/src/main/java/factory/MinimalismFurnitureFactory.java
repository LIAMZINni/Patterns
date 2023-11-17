package factory;

import furniture.Chair;
import furniture.MinimalismChair;
import furniture.MinimalismTable;
import furniture.Table;

public class MinimalismFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new MinimalismChair();
    }

    @Override
    public Table createTable() {
        return new MinimalismTable();
    }
}
