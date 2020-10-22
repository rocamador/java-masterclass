import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalconyTest {

    Balcony balcony;

    @BeforeEach
    void setUp() {
        Table table = new Table("wood", 20, 40,40);
        Chair chair = new Chair( "plastic" );
        balcony = new Balcony("North", table, chair);
    }

    @Test
    void testOpenTable() {
        balcony.foldTable();
        balcony.foldChair();
        balcony.openTable();
        balcony.openChair();
    }
}