package main.java.algorithm.sort.heap;

/**
 * @Author yangxw
 * @Date 13/7/2020 上午9:25
 * @Description
 * @Version 1.0
 */
public class SortMax {

    public static void swap(int tree[], int i, int j) {
        int tem = tree[i];
        tree[i] = tree[j];
        tree[j] = tem;
    }

    public static void buildHeap(int tree[], int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;
        int i;
        for (i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }


    public static void heapify(int tree[], int n, int i) {
        if (i >= n) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && tree[c1] > tree[max]) {
            max = c1;
        }
        if (c2 < n && tree[c2] > tree[max]) {
            max = c2;
        }
        if (max != i) {
            swap(tree, max, i);
            heapify(tree, n, max);
        }
    }

    public static void heapSort(int tree[], int n) {
        buildHeap(tree, n);
        int i;
        for (i = n - 1; i > 0; i--) {
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }


    public static void testHeapify() {
        int tree[] = {4, 10, 3, 5, 1, 2};
        heapify(tree, 6, 0);
        printArr(tree);
    }

    public static void testBuildHeap() {
        int tree[] = {2, 5, 3, 1, 10, 4};
        buildHeap(tree, 6);
        printArr(tree);
    }

    public static void printArr(int tree[]) {
        int n = tree.length;
        int i;
        for (i = 0; i < n; i++) {
            System.out.println(tree[i]);
        }
    }


    public static void testHeapSort() {
        int tree[] = {2, 5, 3, 1, 10, 4};
        heapSort(tree, 6);
        printArr(tree);
    }


    public static void main(String[] args) {
        // testBuildHeap();
        // testHeapify();
        testHeapSort();
    }
}
