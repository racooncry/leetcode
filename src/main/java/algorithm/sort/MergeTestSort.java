package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午5:09
 * @Description
 * @Version 1.0
 */
public class MergeTestSort extends Sort {

    public static void merge2(int[] arr, int L, int M, int R) {
        int lSize = M - L;
        int rSize = R - M + 1;

        int lArr[] = new int[lSize];
        int rArr[] = new int[rSize];
        int i, j, k;

        for (i = L; i < M; i++) {
            lArr[i - L] = arr[i];
        }

        for (i = M; i <= R; i++) {
            rArr[i - M] = arr[i];
        }
        System.out.println("排序前：");
        ArrUtil.print(lArr);
        ArrUtil.print(rArr);
        i = 0;
        j = 0;
        k = L;
        while (i < lSize && j < rSize) {
            if (lArr[i] < rArr[j]) {
                arr[k++] = lArr[i++];
            } else {
                arr[k++] = rArr[j++];
            }
        }

        while (i < lSize) {
            arr[k++] = lArr[i++];
        }

        while (j < rSize) {
            arr[k++] = rArr[j++];
        }
        System.out.println("排序后：");
        ArrUtil.print(arr);
        System.out.println();
        System.out.println();
    }

    public static void mergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int M = (L + R) / 2;
        mergeSort(arr, L, M);
        mergeSort(arr, M + 1, R);
        merge2(arr, L, M + 1, R);

    }


    public static void main(String[] args) {
        int[] arr = {1, 22, 33, 5, 9, 8, 4, 2};
        int l = 0;
        int m = 4;
        int r = 7;
        mergeSort(arr, l, r);
        ArrUtil.print(arr);
    }


}
