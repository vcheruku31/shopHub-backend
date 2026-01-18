public class Product {

    private int productId;
    private String name;
    private double price;
    private String currency;
    private int stockQuantity;
    private String category;
    private boolean isActive;

    public Product(int productId, String name, double price, String currency, int stockQuantity, String category, boolean isActive) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.currency = currency;
        this.stockQuantity = stockQuantity;
        this.category = category;
        this.isActive = isActive;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    public void updateStock(int quantity) {
        this.stockQuantity = quantity;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }
}
