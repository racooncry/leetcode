package algorithm.jk;

/**
 * @Author: yxw
 * @Date: 2018/11/2 19:29
 * @Description:
 * @Version 1.0
 */
public class InsertSort {

    // 插入排序，a 表示数组，n 表示数组大小
    public void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j + 1] = value; // 插入数据
        }
    }


    public void insertionSortMy(int[] a, int n) {
        if (n < 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j+1] = a[j] ;
                } else {
                    break;
                }
            }
            a[j+1]=value;
        }


    }


    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 3, 2};
        int size = arr.length;
        new InsertSort().insertionSortMy(arr, size);
          for(int i=0;i<size;i++){
              if(i!=size-1){
                  System.out.print(arr[i]+",");
              }else {
                  System.out.println(arr[i]);
              }
          }

    }
}
