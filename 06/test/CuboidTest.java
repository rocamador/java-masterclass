import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboidTest {

    private Cuboid c;

    @BeforeEach
    void setUp() {
        c = new Cuboid(5,10,5);
    }

    @Test
    void getHeight() {
        assertEquals(5,c.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(5,c.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(50,c.getArea());
    }

    @Test
    void getVolume() {
        assertEquals(250,c.getVolume());
    }
}