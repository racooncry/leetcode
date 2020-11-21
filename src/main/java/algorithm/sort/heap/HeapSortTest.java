package main.java.algorithm.sort.heap;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午7:46
 * @Description
 * @Version 1.0
 */
public class HeapSortTest {
    public static void heapSort(int[] arr, int n) {
        buildHeap(arr, n);
        int last = n - 1;
        for (int i = last; i > 0; i--) {
            ArrUtil.swap(arr, i, 0);
            heapify(arr, i, 0);
        }

    }


    public static void buildHeap(int[] arr, int n) {
        int last = n - 1;
        int parent = (last - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }


    public static void heapify(int[] arr, int n, int i) {
        if (i > n) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && arr[c1] > arr[max]) {
            max = c1;
        }
        if (c2 < n && arr[c2] > arr[max]) {
            max = c2;
        }
        if (max != i) {
            ArrUtil.swap(arr, i, max);
            heapify(arr, n, max);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 7, 5, 4};
        heapSort(arr,arr.length);

//        buildHeap(arr, arr.length);
//        heapify(arr, arr.length, 0);
        ArrUtil.print(arr);

    }
}
