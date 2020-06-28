package main.java.algorithm.dynamic_plan;

public class Solution877 {


    public boolean stoneGame(int[] piles) {
        int i = 0;
        int k = piles.length - 1;
        int sumA = 0;
        int sumB = 0;
        while (i <= k) {
            if (piles[i]< piles[k]) {
                sumA += piles[k];
                k--;
            }else if(piles[i]> piles[k]) {
                sumB+=piles[i];
                i++;
            }else {
               // if((i+1)
            }
        }
        return sumA>sumB?true:false;

    }

    public boolean compare(int a, int b) {
        return a < b ? true : false;

    }

    public static void main(String[] args) {


    }
}
