package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mcd {

    public int calculate(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return Math.abs(n1 - n2);
        }
        List<Integer> div1 = divisors(n1);
        List<Integer> div2 = divisors(n2);
        return maxCommon(div1, div2);
    }

    private int maxCommon(List<Integer> div1, List<Integer> div2) {
        for (int i = div1.size() - 1; i >= 0; i--) {
            int element1 = div1.get(i);
            for (int j = div2.size() - 1; j >= 0; j--) {
                if (element1 == div2.get(j)) {
                    return element1;
                }
            }
        }
        return 0;
    }

    private List<Integer> divisors(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
