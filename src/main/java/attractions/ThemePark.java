package attractions;

import behaviours.IReviewed;

import java.util.ArrayList;

public abstract class ThemePark {

    public ArrayList<IReviewed> getAllReviewed() {
        return new ArrayList<IReviewed>();
    }
}
