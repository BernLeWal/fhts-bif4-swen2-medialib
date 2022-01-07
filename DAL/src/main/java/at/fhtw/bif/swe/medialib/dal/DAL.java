package at.fhtw.bif.swe.medialib.dal;

import at.fhtw.bif.swe.medialib.model.MediaItem;

public class DAL {

    private Dao<MediaItem> tourDao;

    private DAL() {
        tourDao = new MediaItemDao();
    }

    //
    // Tours:
    //
    public Dao<MediaItem> tourDao() {
        return tourDao;
    }


    //
    // Singleton-Pattern for DAL with early-binding
    //
    private static DAL instance = new DAL();

    public static DAL getInstance() {
        return instance;
    }

}
