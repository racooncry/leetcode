package main.java.algorithm.array;

import java.util.Stack;

/**
 * @Author yangxw
 * @Date 10/9/2020 上午9:30
 * @Description
 * @Version 1.0
 */
public class Solution169 {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
                count++;
            } else if (nums[i] == cand) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }


    public int majorityElementStack(int[] nums) {
        Stack stack = new Stack();
        for (int i = 0, size = nums.length; i < size; i++) {
            if (stack.empty()) {
                stack.push(nums[i]);
            } else if (nums[i] == (int) stack.peek()) {
                stack.push(nums[i]);
            } else {
                stack.pop();
            }
        }
        return (int) stack.peek();
    }

    public int majorityElementArr(int[] nums) {
        int[] arr = new int[nums.length];
        int top = -1;
        for (int i = 0, size = nums.length; i < size; i++) {
            if (top == -1) {
                arr[++top] = nums[i];
            } else if (nums[i] == arr[top]) {
                arr[++top] = nums[i];
            } else {
                top--;
            }
        }
        return arr[0];
    }

}
