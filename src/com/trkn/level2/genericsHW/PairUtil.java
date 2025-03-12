package com.trkn.level2.genericsHW;

public final class PairUtil {
    private PairUtil() {}

    public static <K,V> Pair<V,K> swap(Pair<K,V> pair){
        return new Pair<>(pair.getValue(),pair.getKey());
    }
}
