import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VipCustomerTest {

    private VipCustomer customer;

    @BeforeEach
    void setUp() {
        customer = new VipCustomer();
    }

    @Test
    void getName() {
        assertEquals("sample", customer.getName());
    }

    @Test
    void getCreditLimit() {
        assertEquals(0, customer.getCreditLimit());
    }

    @Test
    void getEmailAddress() {
        assertEquals( "sample@email.com", customer.getEmailAddress());
    }
}