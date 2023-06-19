import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void printing () {
        printer.print(3, 2);
        assertEquals(94, printer.getSheetsLeft());
        assertEquals(44, printer.toner());
    }

    @Test
    public void hasEnoughSheets () {
        printer.print(51, 2);
        assertEquals(100, printer.getSheetsLeft());
        assertEquals(50, printer.toner());
    }
}
