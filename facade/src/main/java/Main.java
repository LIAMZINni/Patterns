public class Main {
    public static void main(String[] args) {
        InternetShopFacade internetShopFacade=new InternetShopFacade();
        internetShopFacade.viewProducts();
        internetShopFacade.shoppingCartManage();
        internetShopFacade.makeOrder();
    }
}
