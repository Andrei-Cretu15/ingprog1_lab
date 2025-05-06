package dataprocessing;

import dataprocessing.StepCountStrategy;
import storage.DataRepository;
import storage.SensorData;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class FilteredStepCountStrategy implements StepCountStrategy {

    @Override
    public void consumeMessage(SensorData sample) {
        //DataRepository.getInstance().addData(sample);
    }

    @Override
    public int getTotalSteps() {
        List<SensorData> records = DataRepository.getInstance().getRecords();
        int totalSteps = 0;

        for (int i = 0; i < records.size(); i++) {
            SensorData current = records.get(i);
            if (current.getStepsCount() > 0 && current.getStepsCount() <= 1000) {
                if (i == 0 || isValidTimeDifference(toLocalDateTime(records.get(i - 1).getTimestamp()), toLocalDateTime(current.getTimestamp())))  {
                    totalSteps += current.getStepsCount();
                }
            }
        }

        return totalSteps;
    }
    private LocalDateTime toLocalDateTime(long timestamp) {
        return LocalDateTime.ofEpochSecond(timestamp, 0, java.time.ZoneOffset.UTC);
    }
    private boolean isValidTimeDifference(LocalDateTime previous, LocalDateTime current) {
        return Duration.between(previous, current).toMinutes() >= 1;
    }

    @Override
    public String getStrategyDescription() {
        return "Filtered step count strategy: sums only valid step counts.";
    }
}