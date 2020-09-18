package main.java.algorithm.array;

/**
 * @Author yangxw
 * @Date 2020-09-16 上午9:47
 * @Description
 * @Version 1.0
 */
public class Solu88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int total = m + n;
        int[] arr = new int[total];
        while (i < m && j < n) {
            if (nums1[i] > nums2[j]) {
                arr[k] = nums2[j];
                j++;
            } else {
                arr[k] = nums1[i];
                i++;
            }
            k++;
        }

        while (i < m) {
            arr[k] = nums1[i];
            k++;
            i++;
        }

        while (j < n) {
            arr[k] = nums2[j];
            k++;
            j++;
        }
        for (i = 0; i < total; i++) {
            nums1[i] = arr[i];
        }

    }

    public static void main(String[] args) {


    }
}
