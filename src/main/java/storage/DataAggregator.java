package storage;


import dataprocessing.StepCountStrategy;


// TODO Implement observer for changes in data repository, implement java.util.Observer interface
public class DataAggregator  {

    private StepCountStrategy strategy;
    public DataAggregator(StepCountStrategy strategy) {
        this.strategy = strategy;
    }

    public String getResults() {
        return String.format("Strategy %s: stepsCount=%d", strategy.getStrategyDescription(), strategy.getTotalSteps());
    }
}
