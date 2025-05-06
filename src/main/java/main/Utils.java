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


    public static StepCountStrategy getStrategy(String strategyType) {
        if ("basic".equalsIgnoreCase(strategyType)) {
            return new BasicStepCountStrategy();
        } else if ("filtered".equalsIgnoreCase(strategyType)) {
            return new FilteredStepCountStrategy();
        } else {
            throw new IllegalArgumentException("Invalid strategy type: " + strategyType);
        }
    }
}
