package org.example.task;

import java.util.List;

public abstract class ArithmeticMean {
    public static double findArithmeticMean(List<Integer> lInteger) {
        return lInteger.stream()
                .mapToInt(Integer::intValue)
                .average().getAsDouble();
    }
}
