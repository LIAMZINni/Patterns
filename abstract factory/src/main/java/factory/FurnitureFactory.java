package factory;

import furniture.Chair;
import furniture.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
