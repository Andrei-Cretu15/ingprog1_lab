package storage;


import dataprocessing.StepCountStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Persists sensor data.
 */

public class DataRepository {
    private static DataRepository instance;
    private final List<SensorData> dataRecords;

    private DataRepository() {
        dataRecords = new ArrayList<>();
    }
    public static synchronized DataRepository getInstance() {
        if (instance == null) {
            instance = new DataRepository();
        }
        return instance;
    }

    public void addData(SensorData dataRecord){
            dataRecords.add(dataRecord);
    }


    public List<SensorData> getRecords() {
        return dataRecords;
    }
}


