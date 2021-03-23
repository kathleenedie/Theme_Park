package attractions;

import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public abstract class ThemePark {

    public ArrayList<IReviewed> getAllReviewed() {
        return new ArrayList<IReviewed>();
    }

    public void visit(Visitor visitor, Attraction attraction){
        int count = attraction.getVisitCount() +1;
        attraction.setVisitCount(count);
        visitor.addAttraction(attraction);
    }
}
