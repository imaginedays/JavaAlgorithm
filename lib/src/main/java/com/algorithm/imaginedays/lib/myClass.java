package com.algorithm.imaginedays.lib;

import com.algorithm.imaginedays.lib.base.BinarySearch;
import com.algorithm.imaginedays.lib.base.GCDSample;

import static java.lang.System.out;

public class myClass {

    public static void main(String[] args)
    {
        out.println("hello world");
        /*欧几里德 求最大公约数*/
        int num = GCDSample.gcd(100,25);
        out.print(num);
        /*二分查找法*/
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10,11,23};
        final int rank = BinarySearch.rank(8 ,intArray);
        out.println("rank = " + rank);



    }
}
