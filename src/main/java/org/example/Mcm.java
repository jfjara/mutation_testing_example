package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mcm {

    public int calculate(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        List<Integer> decompose1 = decompose(n1);
        List<Integer> decompose2 = decompose(n2);
        Map<Integer, Integer> commonsNoCommons =
                getCommonsAndNoCommonsGreaterPow(groupByPotency(decompose1), groupByPotency(decompose2));
        return calculate(commonsNoCommons);
    }

    private Map<Integer, Integer> groupByPotency(List<Integer> decompose) {
        Map<Integer, Integer> set = new HashMap<>();
        decompose.forEach(e -> {
            if (set.containsKey(e)) {
                set.put(e, set.get(e) * e);
            } else {
                set.put(e, e);
            }
        });
        return set;
    }

    private int calculate(Map<Integer, Integer> selectedValues) {
        int result = 1;
        for (Integer value : selectedValues.values()) {
            result *= value;
        }
        return result;
    }

    private Map<Integer, Integer> getCommonsAndNoCommonsGreaterPow(
            Map<Integer, Integer> set1, Map<Integer, Integer> set2) {

        Map<Integer, Integer> selectedValues = new HashMap<>();
        filterValues(set1, selectedValues);
        filterValues(set2, selectedValues);
        return selectedValues;
    }

    private void filterValues(Map<Integer, Integer> values,
                                     Map<Integer, Integer> selectedValues) {
        values.forEach((key, value) -> {
            if (!selectedValues.containsKey(key)) {
                selectedValues.put(key, value);
            } else {
                if (selectedValues.get(key) < value) {
                    selectedValues.put(key, value);
                }
            }
        });
    }


    private List<Integer> decompose(int number) {
        if (number == 1) {
            return new ArrayList<>();
        }

        int divisor = 2;
        while (number % divisor != 0) {
            divisor++;
        }
        List<Integer> result = decompose(number / divisor);
        result.add(divisor);
        return result;
    }



}
