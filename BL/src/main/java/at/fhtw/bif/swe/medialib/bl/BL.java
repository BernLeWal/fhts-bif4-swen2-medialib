package at.fhtw.bif.swe.medialib.bl;

import at.fhtw.bif.swe.medialib.dal.DAL;
import at.fhtw.bif.swe.medialib.model.MediaItem;

import java.util.List;
import java.util.stream.Collectors;

public class BL {
    public List<MediaItem> findMatchingTours(String searchText) {
        var tours = DAL.getInstance().tourDao().getAll();
        if (searchText==null || searchText.isEmpty()) {
            return tours;
        }
        return tours.stream()
                .filter(t->t.getName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    //
    // Singleton-Pattern for BL with early-binding
    //
    private static BL instance = new BL();

    public static BL getInstance() { return instance; }
}
