public class InternetShopFacade {
    private Viewing viewing;
    private ShoppingCart shoppingCart;
    private Order order;

    public InternetShopFacade() {
        this.viewing = new Viewing();
        this.shoppingCart = new ShoppingCart();
        this.order = new Order();
    }
    public void viewProducts(){
        viewing.viewingProduct();
        viewing.viewingNextProduct();
        viewing.viewingPreviousProduct();
    }
    public void shoppingCartManage(){
        shoppingCart.addProduct();
        shoppingCart.deleteProduct();
    }
    public void makeOrder(){
        order.createOrder();
    }
    public void cancelOrder(){
        order.cancelOrder();
    }

}
