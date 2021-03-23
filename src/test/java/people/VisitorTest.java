package people;

import attractions.Attraction;
import attractions.Park;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VisitorTest {

    Visitor visitor;
    Park park;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        park = new Park("Peel Park", 6);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void hasEmptyVisitedAttractionsList(){
        assertEquals(0, visitor.getVisitedAttractions().size());
    }

    @Test
    public void canAddVisitedAttractionToList(){
        visitor.addAttraction(new RollerCoaster("Loop the Loop", 9));
        assertNotNull(visitor.getVisitedAttractions());
    }

    @Test
    public void canAddVisitedAttractionWithThemePark(){
        park.visit(visitor, park);
        assertNotNull(visitor.getVisitedAttractions());

    }

}
