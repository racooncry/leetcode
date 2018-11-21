package algorithm.test;

import java.util.Arrays;

/**
 * @Author: yxw
 * @Date: 2018/10/19 10:48
 * @Description:
 * @Version 1.0
 */
public class MergeComplete {


    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void sort(int[] arr) {
        int[] tem = new int[arr.length];
        sort(arr, 0, arr.length - 1, tem);
    }

    private static void sort(int[] arr, int left, int right, int tem[]) {

        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid, tem);
            sort(arr, mid + 1, right, tem);
            merage(arr, left, mid, right, tem);
        }else {
            System.out.println("arr:"+Arrays.toString(arr)+",left:"+left+",right:"+right);
        }
    }

    private static void merage(int[] arr, int left, int mid, int right, int temp[]) {
       // System.out.println("arr:"+Arrays.toString(arr)+",left:"+left+".mid:"+mid+",right:"+right+",temp:"+Arrays.toString(temp));
        int i = left;
        int j = mid + 1;
        int t = 0;//临时数组指针
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while (j <= right) {//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }


}
