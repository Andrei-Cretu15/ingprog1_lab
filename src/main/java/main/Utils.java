package main;

import dataprocessing.BasicStepCountStrategy;
import dataprocessing.FilteredStepCountStrategy;
import dataprocessing.StepCountStrategy;

public class Utils {
    public static final String BASIC_STRATEGY = "basic";
    public static final String FILTERED_STRATEGY = "filtered";

    public static int getClientId() {
        return 42;
    }


    public static StepCountStrategy getStrategy(String type) {
        if (BASIC_STRATEGY.equals(type)) {
            return new BasicStepCountStrategy();
        } else if (FILTERED_STRATEGY.equals(type)) {
            return new FilteredStepCountStrategy();
        } else {
            throw new IllegalArgumentException("Unknown strategy type: " + type);
        }
    }
}
