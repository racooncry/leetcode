package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午5:09
 * @Description
 * @Version 1.0
 */
public class MergeSort extends Sort {
    @Override
    public void merge(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left;
        int rightSize = right - mid + 1;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        int i;
//        System.out.println("l:" + left + ",m:" + mid + ",r:" + right);
        for (i = left; i < mid; i++) {
            leftArr[i - left] = arr[i];
        }
        for (i = mid; i <= right; i++) {
            rightArr[i - mid] = arr[i];
        }

        ArrUtil.print(leftArr);
        ArrUtil.print(rightArr);
        i = 0;
        int j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
                k++;
            } else if (leftArr[i] > rightArr[j]) {
                arr[k] = rightArr[j];
                j++;
                k++;
            } else {
                arr[k++] = leftArr[i++];

                arr[k++] = rightArr[j++];

            }
        }
        for (int p = i; p < leftSize; p++) {
            arr[k++] = leftArr[p];
        }
        for (int p = j; p < rightSize; p++) {
            arr[k++] = rightArr[p];
        }

    }


    public void mergeSort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 1, 2, 3, 10};
        int size = arr.length;
        int l = 0;
        int r = size - 1;
        int m = (l + r) / 2 + 1;

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr, l, r);
        //  mergeSort.merge(arr, l, m, r);
        ArrUtil.print(arr);
    }

}
