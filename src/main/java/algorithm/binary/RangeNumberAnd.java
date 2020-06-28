package main.java.algorithm.binary;

public class RangeNumberAnd {


    public  static  int rangeBitwiseAnd(int m, int n) {

        int sum=~0;
        for(int i=m;i<=n;i++){
            sum&=i;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
    }
}
