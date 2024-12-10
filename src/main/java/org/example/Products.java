package org.example;

/**
 * Represents the products in the shop
 */
public class Products {

    private String name;
    private String productId;
    private double price;
    private String description;
    private String category;

    /**
     * Constructs a new Product with the specified details.
     *
     * @param name        the name of the product
     * @param productId   unique identifier for the product
     * @param price       the price of the product
     * @param description detailed description of the product
     * @param category    the category to which the product belongs
     */
    public Products(String name, String productId, double price, String description, String category) {
        this.name = name;
        this.productId = productId;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    /**
     * Retrieves the name of the product.
     *
     * @return the current product name
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the name of the product.
     *
     * @param name the new product name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the unique identifier of the product.
     *
     * @return the current product ID
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Updates the unique identifier of the product.
     *
     * @param productId the new product ID to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Retrieves the price of the product.
     *
     * @return the current price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Updates the price of the product.
     *
     * @param price the new price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Retrieves the description of the product.
     *
     * @return the current product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Updates the description of the product.
     *
     * @param description the new product description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the category of the product.
     *
     * @return the current product category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Updates the category of the product.
     *
     * @param category the new product category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Calculates any applicable discount for this product based on category and price.
     * The discount rules are:
     * - Electronics: 10% off if price is over $1000
     * - Clothing: 15% off if price is over $100
     * - Books: 5% off on all items
     * - Other categories: No discount
     *
     * @return the discount amount as a decimal value between 0.0 and 1.0
     */
    public double discount() {
        // Convert category to lowercase to make comparison case-insensitive
        String categoryLower = category.toLowerCase();

        // Calculate discount based on category and price conditions
        switch (categoryLower) {
            case "electronics":
                if (price > 20000) {
                    return 0.10; // 10% discount on expensive electronics
                }
                break;

            case "clothing":
                if (price > 8000) {
                    return 0.15; // 15% discount on premium clothing
                }
                break;

            case "books":
                return 0.05; // 5% discount on all books

            default:
                // No discount for other categories
                break;
        }

        return 0.0; // Default: no discount
    }

    /**
     * Returns the category of this product for listing purposes.
     *
     * @return the product category
     */
    public String listCategory() {
        return category;
    }
}
