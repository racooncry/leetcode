package main.java.algorithm.sort.heap;

/**
 * @Author yangxw
 * @Date 13/7/2020 上午10:02
 * @Description
 * @Version 1.0
 */
public class HeapSort215 {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        heapSort(nums, n);
        return nums[n - k];
    }


    public void heapSort(int tree[], int n) {
        buildHeap(tree, n);
        int i;
        for (i = n - 1; i > 0; i--) {
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }

    public void buildHeap(int tree[], int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;
        int i;
        for (i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }


    public void heapify(int tree[], int n, int i) {
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

    public void swap(int tree[], int i, int j) {
        int tem = tree[i];
        tree[i] = tree[j];
        tree[j] = tem;
    }

}
