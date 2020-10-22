import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    private Cylinder c;

    @BeforeEach
    void setUp() {
        c = new Cylinder(5.55,7.25);
    }

    @Test
    void getHeight() {
        assertEquals(7.25, c.getHeight());
    }

    @Test
    void getRadius() {
        assertEquals(5.55, c.getRadius());
    }

    @Test
    void getVolume() {
        assertEquals( 701.574580913447, c.getVolume());
    }

    @Test
    void getArea() {
        assertEquals( 96.76890771219959, c.getArea());
    }
}