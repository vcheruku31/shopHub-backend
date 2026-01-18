import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int cartId;
    private User user;
    private List<OrderItem> items = new ArrayList<>();

    public Cart(int cartId, User user) {
        this.cartId = cartId;
        this.user = user;
    }

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public void removeItem(int productId) {
        items.removeIf(item -> {
            Product product = item.getProduct();
            if (product == null) {
                return false;
            }
            // Explicitly use backend_models.Product which has getProductId() method
            int itemProductId = product.getProductId();
            return itemProductId == productId;
        });
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.calculateSubtotal();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }

    public List<OrderItem> getItems() {
        return items;
    }

    // Getters and Setters
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
