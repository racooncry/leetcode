package main.java.algorithm.binary;

public class HanMingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        return numberBinary1Count(z);
    }

    public int numberBinary1Count(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(new HanMingDistance().hammingDistance(1,4));
    }
}
