package main.java.algorithm.sort;

import main.java.algorithm.utils.ArrUtil;

/**
 * @Author yangxw
 * @Date 2020-11-21 下午4:39
 * @Description
 * @Version 1.0
 */
public class SortTest {

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 8, 6, 5, 1};
        Sort sort = new SelectSort();
        sort.sort(arr);
        ArrUtil.print(arr);
    }
}
