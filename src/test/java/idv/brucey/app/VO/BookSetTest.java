package idv.brucey.app.VO;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookSetTest {

    @Test
    public void constructorTest() {
        BookSet noInput = new BookSet();
        BookSet oneInput = new BookSet("book1,1,1.00");
        BookSet twoInput = new BookSet("book1,1,1.00","book2,1,103.0");
        BookSet threeInput = new BookSet("book1,1,1.00","book2,1,103.0","book1,2,10.20");

        assertNull(noInput.getBookUnitList());
        assertEquals(1, oneInput.getBookUnitList().size());
        assertEquals(2, twoInput.getBookUnitList().size());
        assertEquals(3, threeInput.getBookUnitList().size());
    }
}