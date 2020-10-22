import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    Printer p;

    @BeforeEach
    void setUp() {
        p = new Printer(100,false);
    }

    @Test
    void setTonerLevel() {
        p.setTonerLevel(20);
        assertEquals(20,p.getTonerLevel());
    }

    @Test
    void printPage() {
        assertEquals(0,p.getNrPagesPrinted());
        p.print();
        assertEquals(1, p.getNrPagesPrinted());
    }

    @Test
    void getTonerLevel() {
        p.setTonerLevel(40);
        assertEquals(40,p.getTonerLevel());
    }

    @Test
    void getNrPagesPrinted() {
        p.print(400);
        p.print();
        assertEquals(401, p.getNrPagesPrinted());
    }

    @Test
    void isDuplex() {
        assertEquals(false, p.isDuplex());
    }

    @Test
    void fillToner() {
        p.fillToner(40);
        assertEquals(40,p.getTonerLevel() );
    }
}