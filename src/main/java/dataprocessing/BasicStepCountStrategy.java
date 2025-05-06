package dataprocessing;

import dataprocessing.StepCountStrategy;
import storage.DataRepository;
import storage.SensorData;

import java.util.List;

public class BasicStepCountStrategy implements StepCountStrategy {

    @Override
    public void consumeMessage(SensorData sample) {
        DataRepository.getInstance().addData(sample);
    }

    @Override
    public int getTotalSteps() {
        List<SensorData> records = DataRepository.getInstance().getRecords();
        return records.stream().mapToInt(SensorData::getStepsCount).sum();
    }

    @Override
    public String getStrategyDescription() {
        return "Basic step count strategy: sums all step counts.";
    }
}