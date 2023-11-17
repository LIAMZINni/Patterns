import factory.FurnitureFactory;
import factory.ModernFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory=new ModernFurnitureFactory();

        System.out.println(modernFurnitureFactory.createChair().getName()+"\n"+modernFurnitureFactory.createTable().getName());
    }
}
