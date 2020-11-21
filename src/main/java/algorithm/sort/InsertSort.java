package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午4:24
 * @Description
 * @Version 1.0
 */
public class InsertSort extends Sort {
    @Override
    public void sort(int arr[]) {
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    break;
                } else {
                    ArrUtil.swap(arr, j - 1, j);
                }
            }

        }
    }

}
