package org.example;

import org.junit.jupiter.api.Test;

import static org.example.PermutationComparator.isPermutation;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationComparatorTest {

    @Test
    public void is_permutation_test() {
        assertTrue(isPermutation("123456789abc", "9876a54b32c1"));
        assertTrue(isPermutation("aaa", "aaa"));


    }

    @Test
    public void is_not_permutation_test() {
        assertFalse(isPermutation("((", "edcba"));
        assertFalse(isPermutation("123456789abc", "abc123456788"));
    }

}
