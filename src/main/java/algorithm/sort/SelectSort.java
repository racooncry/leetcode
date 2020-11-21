package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午4:25
 * @Description
 * @Version 1.0
 */
public class SelectSort extends Sort {
    @Override
    public void sort(int[] arr) {
        int size = arr.length;


        for (int i = 0; i < size; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            ArrUtil.swap(arr, minIndex, i);
        }


    }
}
