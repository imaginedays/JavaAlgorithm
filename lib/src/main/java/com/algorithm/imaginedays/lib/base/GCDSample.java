package com.algorithm.imaginedays.lib.base;

/**
 * Created by imaginedays on 18/01/2018.
 * 欧几里德算法 求最大公约数
 */

public class GCDSample {


    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q,r);
    }
}
