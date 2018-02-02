package com.algorithm.imaginedays.lib.base;

import com.algorithm.imaginedays.lib.utils.FileReadUtils;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

/**
 * Created by imaginedays on 18/01/2018.
 * 二分查找
 * 1.必须采用顺序存储结构。2.必须按关键字大小有序排列。
 */

public class BinarySearch {

    public static int rank (int key, int[] a)
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

    public static void main(String[] args)
    {

        ArrayList<Integer> integerList =  FileReadUtils.readToString("/Users/imaginedays/Documents/算法第四版Java/algs4-data/largeW.txt");
//        Collections.sort(integerList);
        int[] intArray = new int[integerList.size()];
        for (int i = 0;i < integerList.size(); i++)
        {
            intArray[i] = integerList.get(i).intValue();
        }

        Arrays.sort(intArray);
        int key = 865397;
        int index = rank(key,intArray);
        if (index != -1)
        {
            out.println("intArray[" + index + "] = " + key);
        }else
        {
            out.println("没找到");
        }



    }

}
