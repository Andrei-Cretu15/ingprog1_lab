package storage;

import dataprocessing.StepCountStrategy;
import storage.SensorData;

import java.util.Observer;
import java.util.Observable;

public class DataAggregator implements Observer {

    private StepCountStrategy strategy;

    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof SensorData) {
            strategy.consumeMessage((SensorData) arg);
        }
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }
}
