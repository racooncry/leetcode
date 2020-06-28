package main.java.algorithm.binary;

public class OnlyAppearOneTime2 {
    public static void main(String[] args) {
        System.out.println(~3);
    }


    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            a = (a ^ num) & ~b;
            b = (b ^ num) & ~a;
        }
        return a;
    }
}
