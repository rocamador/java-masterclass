import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle r;

    @BeforeEach
    void setUp() {
        r = new Rectangle(5,10);
    }

    @Test
    void getWidth() {
        assertEquals(5,r.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(10,r.getLength());
    }

    @Test
    void getArea() {
        assertEquals(50,r.getArea());
    }
}