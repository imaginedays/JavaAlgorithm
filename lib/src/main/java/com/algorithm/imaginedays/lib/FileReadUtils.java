package com.algorithm.imaginedays.lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by imaginedays on 23/01/2018.
 */

public class FileReadUtils {

    // 读取文件
    public static ArrayList<Integer> readToString(String fileName) {
        ArrayList<Integer> contentIntlist = new ArrayList<Integer>();
        int count = 0;
        String encoding = "UTF-8";
        File file = new File(fileName);
        if (!file.exists())
        {
            System.err.println(file + "文件不存在");
        }

        try {

            BufferedReader bReader = new BufferedReader(new FileReader(file));
            String lineContentStr;
            while ((lineContentStr = bReader.readLine()) != null)
            {

                String str = lineContentStr.trim();
                contentIntlist.add(Integer.valueOf(str));
                count += 1;
            }
            bReader.close();
            System.out.println("count = " + count);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contentIntlist;
    }
}
