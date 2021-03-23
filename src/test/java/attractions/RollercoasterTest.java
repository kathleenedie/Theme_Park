package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 147, 2.50);
        visitor2 = new Visitor(27, 201.50, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void isTallEnoughAndOldEnoughForRollerCoaster(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isNotTallEnoughOrOldEnoughForRollerCoaster(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void chargeForUnder2m(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void chargedDoubleForOver2mHeight(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2), 0.0);
    }

}
