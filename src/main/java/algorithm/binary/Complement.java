package main.java.algorithm.binary;

public class Complement {


    public int findComplement(int num) {
        int index = 0;
        int sum = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                sum += power(2, index);
            }
            index++;
            num = num >> 1;
        }
        return sum;

    }

    public long power(int a, int n) {
        long r = 1;
        while (n-- >= 1) {
            r = r * a;
        }
        return r;
    }

    public static void main(String[] args) {

        System.out.println(new Complement().findComplement(1));


    }
}
