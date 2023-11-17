import factory.CreateItem;
import factory.FurnitureFactory;
import items.Furniture;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = CreateItem.createItem("table");
        Furniture furniture= furnitureFactory.createFurniture();
        System.out.println(furniture.info());
    }
}
