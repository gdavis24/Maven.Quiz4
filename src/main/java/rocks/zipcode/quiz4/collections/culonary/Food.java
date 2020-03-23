package rocks.zipcode.quiz4.collections.culonary;

import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Spice spice;
    private List<Spice> spiceList;
    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }

    public void applySpice(Spice spice) {
        if (!spiceList.contains(spice)){
            spiceList.add(spice);
        }
    }
}
