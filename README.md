# Backend Models

This folder contains Java domain models for the ShopHub e-commerce backend system.

## Purpose

These are the core domain models that represent the business entities in the e-commerce system. They define the structure and behavior of the main entities used throughout the backend application.

## Models

### Product
Represents a product in the catalog.
- **Attributes**: productId, name, price, stockQuantity, category, isActive
- **Methods**: `isInStock()`, `updateStock()`
- **Getters/Setters**: All attributes have getters and setters

### User
Represents a user (customer or admin) in the system.
- **Attributes**: userId, name, email, password, role, isActive, address
- **Methods**: `updateProfile()`, `isAdmin()`
- **Getters/Setters**: All attributes have getters and setters

### Cart
Represents a shopping cart for a user.
- **Attributes**: cartId, user, items (List<OrderItem>)
- **Methods**: `addItem()`, `removeItem()`, `calculateTotal()`, `clearCart()`
- **Getters/Setters**: All attributes have getters and setters

### OrderItem
Represents an item within an order or cart.
- **Attributes**: product, quantity, priceAtPurchase
- **Methods**: `calculateSubtotal()`
- **Getters/Setters**: All attributes have getters and setters

### Order
Represents a customer order.
- **Attributes**: orderId, user, items (List<OrderItem>), orderStatus, orderDate
- **Methods**: `addOrderItem()`, `calculateTotal()`, `updateStatus()`
- **Getters/Setters**: All attributes have getters and setters

## Relationships

- **Cart** contains a **User** and a list of **OrderItem** objects
- **Order** contains a **User** and a list of **OrderItem** objects
- **OrderItem** contains a **Product** reference
- Each **OrderItem** stores the price at the time of purchase

## Usage

These models are used by:
- Backend API services
- Business logic layer
- Data access layer (DAO/Repository)
- API response serialization

## Structure

All models follow a consistent structure:
- Private fields for attributes
- Constructor for initialization
- Business logic methods
- Complete getter and setter methods for all attributes

## Status Values

- **Order Status**: PLACED, SHIPPED, DELIVERED, CANCELLED
- **User Role**: CUSTOMER, ADMIN
- **Product**: isActive (boolean) indicates availability
