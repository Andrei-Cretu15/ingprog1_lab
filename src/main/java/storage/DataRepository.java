package storage;

import java.util.ArrayList;
import java.util.Observable;
import java.util.List;
/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */

public class DataRepository extends Observable {
    private static DataRepository instance;
    private final List<ISensorData> dataList = new ArrayList<>();

    private DataRepository() {}

    public static DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }
    public void addData(SensorData dataRecord){
        dataList.add(dataRecord);
        setChanged();
        notifyObservers(dataRecord);
    }

}


