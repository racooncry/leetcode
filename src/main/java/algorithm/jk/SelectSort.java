package algorithm.jk;

/**
 * @Author: yxw
 * @Date: 2018/11/2 19:49
 * @Description:
 * @Version 1.0
 */
public class SelectSort {

    public void SelectSortMy(int[] a, int n) {
        if (n < 1) {
            return;
        }


        for (int i = 0; i < n; i++) {
            int min = a[i];
            int index=i;
            for (int j =  i + 1; j <n; j++) {
                if (min > a[j]) {
                    min = a[j];
                    index=j;
                }
            }
          //  System.out.println(i+","+min);
            int at=a[i];
            a[i] = min;
            a[index]=at;
            pint(a);

        }


    }

    private void pint(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 3, 2};
        int size = arr.length;
        new SelectSort().SelectSortMy(arr, size);
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }

    }
}
