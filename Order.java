import java.util.Date;
import java.util.List;

public class Order {

    private int orderId;
    private User user;
    private List<OrderItem> items;
    private String orderStatus;
    private Date orderDate;

    public Order(int orderId, User user, List<OrderItem> items) {
        this.orderId = orderId;
        this.user = user;
        this.items = items;
        this.orderDate = new Date();
        this.orderStatus = "PLACED";
    }

    public void addOrderItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.calculateSubtotal();
        }
        return total;
    }

    public void updateStatus(String status) {
        this.orderStatus = status;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
