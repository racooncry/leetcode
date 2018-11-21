package algorithm.test;

/**
 * @Author: yxw
 * @Date: 2018/10/18 16:18
 * @Description:
 * @Version 1.0
 */
public class MergeTest {




    public static int[] test(int[] a, int[] b, int[] c) {
        int lengthA = a.length;
        int lengthB = b.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < lengthA && j < lengthB) {
            System.out.println("i:" + i + ",j:" + j + ",a[]:" + a[i] + ",b[]:" + b[j] + ",k:" + k);
            if (a[i] < b[j]) {
                c[k++] = a[i];
                i++;
                continue;
            }
            if (a[i] > b[j]) {
                c[k++] = b[j];
                j++;
                continue;
            }
            if (a[i] == b[j]) {
                c[k++] = b[j];
                c[k] = a[i];
                i++;
                j++;
                k++;
            }
        }
        while (i < lengthA) {
            c[k++] = a[i++];
        }

        while (j < lengthB) {
            c[k++] = b[j++];
        }
        return c;
    }

    public static int[] test2(int[] a, int[] b, int[] c) {
        int lengthA = a.length;
        int lengthB = b.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < lengthA && j < lengthB) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = b[j++];
            }
        }
        while (i < lengthA) {
            c[k++] = a[i++];
        }
        while (j < lengthB) {
            c[k++] = b[j++];
        }
        return c;
    }

    private static final int a=10;
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 8};
        int[] b = {2, 4, 5, 6, 9};
        int[] c = new int[a.length + b.length];
        test2(a, b, c);
        for (int ai : c) {
            System.out.println(ai);
        }


    }

}
