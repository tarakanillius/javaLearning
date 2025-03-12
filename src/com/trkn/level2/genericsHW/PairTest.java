package com.trkn.level2.genericsHW;

import org.junit.Test;
import static org.junit.Assert.*;

public class PairTest {
    @Test
    public void testPair() {
        Pair<Integer, String> pair1 = new Pair<>(1, "one");
        Pair<String, Integer> swappedPair = PairUtil.swap(pair1);
        Pair<String, Integer> pair2 = new Pair<>("one", 1);

        assertEquals(pair2.getKey(), swappedPair.getKey());
        assertEquals(pair2.getValue(), swappedPair.getValue());
    }
}
