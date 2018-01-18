package com.algorithm.imaginedays.lib.base;

/**
 * Created by imaginedays on 18/01/2018.
 * 二分查找
 */

public class BinarySearch {

    public  static int rank (int key, int[] a)
    {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                    return mid;
        }
        return -1;
    }
}
