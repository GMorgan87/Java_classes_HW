import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50);
    }

    @Test
    public void hasSheetCount(){
        assertEquals(50, printer.getSheetCount());
    }

    @Test
    public void printUpdatesSheetCount(){
        printer.print(5,2);
        assertEquals(40, printer.getSheetCount());
    }

    @Test
    public void printUpdatesToner(){
        printer.print(5,2);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void wontPrintWithoutEnoughPaper(){
        printer.print(20, 10);
        assertEquals(50, printer.getSheetCount());
        assertEquals(100, printer.getToner());
    }

}
