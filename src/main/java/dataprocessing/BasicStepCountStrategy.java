package dataprocessing;

import dataprocessing.StepCountStrategy;
import storage.DataRepository;
import storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {
    private int totalcount = 0;

    @Override
    public void consumeMessage(SensorData sample) {
        //DataRepository.getInstance().addData(sample);
        totalcount+= sample.getStepsCount();
    }

    @Override
    public int getTotalSteps() {
        //List<SensorData> records = DataRepository.getInstance().getRecords();
        //return records.stream().mapToInt(SensorData::getStepsCount).sum();
        return totalcount;
    }

    @Override
    public String getStrategyDescription() {
        return "Basic step count strategy: sums all step counts.";
    }
}