import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WallTest {

    private Wall w1;
    private Wall w2;

    @BeforeEach
    void setUp() {
        w1 = new Wall();
        w2 = new Wall(5,4);
    }

    @Test
    void getWidth() {
        assertEquals(5,w2.getWidth());
    }

    @Test
    void setWidth() {
        w1.setWidth(12);
        assertEquals(12,w1.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(4,w2.getHeight());
    }

    @Test
    void setHeight() {
        w1.setHeight(2);
        assertEquals(2, w1.getHeight());
    }

    @Test
    void getArea() {
        assertEquals(20,w2.getArea());
    }
}