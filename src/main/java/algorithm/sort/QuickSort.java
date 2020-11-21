package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午4:24
 * @Description
 * @Version 1.0
 * 递归
 */
public class QuickSort extends Sort {

    public static int partition(int[] arr, int L, int R) {
        int check = arr[L];
        int i = L;
        int j = R;
        while (i < j) {
            while (i < j && arr[j] >= check) {
                j--;
            }
            while (i < j && arr[i] <= check) {
                i++;
            }
            ArrUtil.swap(arr, i, j);
        }
        arr[L] = arr[i];
        arr[i] = check;
        return i;
    }


    public static void sort(int[] arr, int L, int R) {
        if (L < R) {
            int index = partition(arr, L, R);
            sort(arr, L, index - 1);
            sort(arr, index + 1, R);
        }

    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 8, 5, 6, 7, 9};

        sort(arr, 0, 7);
        ArrUtil.print(arr);

    }
}
