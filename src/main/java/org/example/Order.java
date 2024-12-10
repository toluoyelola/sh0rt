package org.example;

/**
 * Represents an order placed by a user for a product.
 * This class manages the user's order details, including the product, order status, and order ID.
 */
public class Order {

    private int userId;
    private Products product;
    private String orderStatus;
    private int orderId;

    /**
     * Constructs a new Order with the specified user and product.
     *
     * @param userId the ID of the user placing the order
     * @param product the product being ordered
     */
    public Order(int userId, Products product) {
        this.userId = userId;
        this.product = product;
        this.orderStatus = "Pending";
    }

    /**
     * Retrieves the ID of the user who placed the order.
     *
     * @return the user ID associated with this order
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Updates the user ID associated with this order.
     *
     * @param userId the new user ID to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Retrieves the product associated with this order.
     *
     * @return the product being ordered
     */
    public Products getProduct() {
        return product;
    }

    /**
     * Updates the product associated with this order.
     *
     * @param product the new product to set
     */
    public void setProduct(Products product) {
        this.product = product;
    }

    /**
     * Retrieves the current status of the order.
     *
     * @return the current order status
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Updates the status of the order.
     *
     * @param orderStatus the new order status to set
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * Retrieves the unique identifier of the order.
     *
     * @return the order ID
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Updates the unique identifier of the order.
     *
     * @param orderId the new order ID to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * Creates a new order in the system. This method initializes the order
     * and sets its status to "Created".
     */
    public void createOrder() {
        this.orderStatus = "Created";
    }

    /**
     * Cancels an existing order. This method updates the order status
     * to "Cancelled" and performs any necessary cleanup.
     */
    public void cancelOrder() {
        this.orderStatus = "Cancelled";
    }
}
