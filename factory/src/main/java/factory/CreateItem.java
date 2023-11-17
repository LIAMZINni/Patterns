package factory;

import items.Furniture;

public class CreateItem {
    public static  FurnitureFactory createItem(String name) {
        FurnitureFactory factory=null;
        try {


        switch (name){
            case "chair" -> {
                factory= new ChairFactory();

            }
            case "table" -> {
                factory= new TableFactory();
            }
            case "closet" -> {
                factory =new ClosetFactory();
            }

        }
        }
        catch (Exception e){
            System.err.println("item not found ");
        }


        return factory;
    }

}
