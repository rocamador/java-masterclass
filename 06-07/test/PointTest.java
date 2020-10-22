import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    private Point p1;
    private Point p2;

    @BeforeEach
    void setUp() {
        p1 = new Point();
        p2 = new Point(6,5);
    }

    @Test
    void getX() {
        assertEquals(6, p2.getX());
    }

    @Test
    void setX() {
        p1.setX(3);
        assertEquals( 3, p1.getX());

    }

    @Test
    void getY() {
        assertEquals(5, p2.getY());
    }

    @Test
    void setY() {
        p1.setY(4);
        assertEquals( 4, p1.getY());
    }

    @Test
    void distance() {
        assertEquals(7.810249675906654, p2.distance());
    }

    @Test
    void distanceCoords() {
        assertEquals(5.0, p2.distance(3,1));
    }

    @Test
    void distancePoint() {
        Point p = new Point(3,6);
        assertEquals(3.1622776601683795, p2.distance(p));
    }

}