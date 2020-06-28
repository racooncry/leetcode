package algorithm.array.binary_search;

import java.util.Arrays;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/20 8:56
 * @Version: 1.0
 */
public class Title875 {

    public int minEatingSpeed(int[] piles, int H) {
        int l = 0, r = piles.length - 1, mid = 0;





        while (l < r) {
            mid = l + (r - l) / 2;
            if (check(piles[mid], piles, H)) {
                r = mid;
            }
        }
        return piles[mid];


    }

    private boolean check(int k, int[] piples, int H) {
        int sumH = 0;
        for (int i = 0; i < piples.length; i++) {
            if (k <= piples[i]) {
                sumH++;
            } else {
                sumH += piples[i] / k + 1;
            }
        }

        if (sumH > H) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] piples = {3, 6, 7, 11};
        int H = 8;
        System.out.println(new Title875().minEatingSpeed(piples, H));

    }
}
