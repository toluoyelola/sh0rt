import org.junit.jupiter.api.BeforeEach;  // JUnit 5 annotation
import org.junit.jupiter.api.Test;
import org.example.Order;
import org.example.Products;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the {@link Order} class.
 * This class tests the functionality of the Order's methods and its behavior in different scenarios.
 */
public class OrderTest {
    private Order testOrder;
    private Products testProduct;
    private static final int TEST_USER_ID = 1;

    /**
     * Set up test objects before each test.
     */
    @BeforeEach  // Changed from @Before to @BeforeEach
    public void setUp() {
        testProduct = new Products("Test Product", "TP001",
                99.99, "Test Description", "Test Category");
        testOrder = new Order(TEST_USER_ID, testProduct);
    }

    /**
     * Test that an order is properly constructed with the given values.
     */
    @Test
    public void testOrderConstruction() {
        assertEquals(TEST_USER_ID, testOrder.getUserId());
        assertEquals(testProduct, testOrder.getProduct());
        assertEquals("Pending", testOrder.getOrderStatus());
    }

    /**
     * Test the order creation process.
     */
    @Test
    public void testCreateOrder() {
        testOrder.createOrder();
        assertEquals("Created", testOrder.getOrderStatus());
    }

    /**
     * Test the order cancellation process.
     */
    @Test
    public void testCancelOrder() {
        testOrder.createOrder(); // First create the order
        testOrder.cancelOrder();
        assertEquals("Cancelled", testOrder.getOrderStatus());
    }

    /**
     * Test order ID setter and getter.
     */
    @Test
    public void testOrderIdSetterGetter() {
        testOrder.setOrderId(100);
        assertEquals(100, testOrder.getOrderId());
    }
}
