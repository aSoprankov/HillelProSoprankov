package org.example.task;

import java.util.List;
import java.util.OptionalDouble;

public class ArithmeticMean {
    public void findArithmeticMean(List<Integer> lInteger) {
        OptionalDouble average = lInteger.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println(average);
    }
}
