import org.example.Products;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {

    private Products testProduct;

    // Sample test data
    private final String TEST_NAME = "Test Product";
    private final String TEST_ID = "TP123";
    private final double TEST_PRICE = 1200.00;
    private final String TEST_DESCRIPTION = "A test product description";
    private final String TEST_CATEGORY = "electronics";

    /**
     * Set up a test product before each test case.
     */
    @BeforeEach
    void setUp() {
        testProduct = new Products(TEST_NAME, TEST_ID, TEST_PRICE,
                TEST_DESCRIPTION, TEST_CATEGORY);
    }

    /**
     * Test the constructor and initial values.
     */
    @Test
    void testConstructor() {
        assertNotNull(testProduct, "Product should be created successfully");
        assertEquals(TEST_NAME, testProduct.getName(), "Name should match constructor argument");
        assertEquals(TEST_ID, testProduct.getProductId(), "Product ID should match constructor argument");
        assertEquals(TEST_PRICE, testProduct.getPrice(), "Price should match constructor argument");
        assertEquals(TEST_DESCRIPTION, testProduct.getDescription(), "Description should match constructor argument");
        assertEquals(TEST_CATEGORY, testProduct.getCategory(), "Category should match constructor argument");
    }

    /**
     * Test discount calculations for electronics category.
     */
    @Test
    void testElectronicsDiscount() {
        // Test expensive electronics (should get 10% discount)
        testProduct.setPrice(50000.00);
        assertEquals(0.10, testProduct.discount(), "Electronics over $1000 should get 10% discount");

        // Test cheaper electronics (should get no discount)
        testProduct.setPrice(5000.00);
        assertEquals(0.0, testProduct.discount(), "Electronics under $1000 should get no discount");
    }

    /**
     * Test discount calculations for clothing category.
     */
    @Test
    void testClothingDiscount() {
        testProduct.setCategory("clothing");

        // Test expensive clothing (should get 15% discount)
        testProduct.setPrice(9000.00);
        assertEquals(0.15, testProduct.discount(), "Clothing over 8000 should get 15% discount");

        // Test cheaper clothing (should get no discount)
        testProduct.setPrice(5000.00);
        assertEquals(0.0, testProduct.discount(), "Clothing under 8000 should get no discount");
    }

    /**
     * Test discount calculations for books category.
     */
    @Test
    void testBooksDiscount() {
        testProduct.setCategory("books");

        // Test books at any price (should always get 5% discount)
        assertEquals(0.05, testProduct.discount(), "Books should always get 5% discount");

        testProduct.setPrice(10.00);
        assertEquals(0.05, testProduct.discount(), "Books should get 5% discount regardless of price");
    }

    /**
     * Test discount calculations for other categories.
     */
    @Test
    void testOtherCategoryDiscount() {
        testProduct.setCategory("food");
        assertEquals(0.0, testProduct.discount(), "Other categories should get no discount");
    }
}
