package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午4:24
 * @Description
 * @Version 1.0
 */
public class PopSort extends Sort {


    @Override
    public void sort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    ArrUtil.swap(arr, i, j);
                }
            }
        }
    }



}
