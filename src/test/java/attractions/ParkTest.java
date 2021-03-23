package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        park.visit(new Visitor(10, 124, 5.00), park);
        assertEquals(1, park.getVisitCount());
    }
}
