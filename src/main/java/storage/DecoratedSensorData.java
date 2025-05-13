package storage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DecoratedSensorData implements ISensorData {

    private ISensorData decoratedSensorData;

    public DecoratedSensorData(ISensorData decoratedSensorData) {
        this.decoratedSensorData = decoratedSensorData;
    }

    @Override
    public int getStepsCount() {
        return decoratedSensorData.getStepsCount();
    }

    @Override
    public long getTimestamp() {
        return decoratedSensorData.getTimestamp();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        Date resultDate = new Date(decoratedSensorData.getTimestamp());
        return String.format("Decorated -> stepsCount: %d, time: %s",
                decoratedSensorData.getStepsCount(), sdf.format(resultDate));
    }
}