package main.java.algorithm.dynamic_plan;

public class Solution338 {
//1.传统的暴力求解
    public int[] countBits(int num) {
        int[] number = new int[num + 1];
        for (int i = 0; i < num; i++) {
            int res=0;
            int n=i;
            while (n!=0){
                n=n&(n-1);
                res++;
            }
            number[i]=res;
        }
        return number;
    }

//使用传说中的位运算做递推
    public int[] countBits2(int num) {
        int[] number = new int[num + 1];
        for (int i = 1; i < num; i++) {
            number[i]=number[i>>1]+(1&i);
        }
        return number;
    }

}
