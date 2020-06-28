package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/6 10:10
 * @Version: 1.0
 */
public class Title441 {

    //math
    /**
     * (n+1)*n/2=n
     * n*n + n =2n
     * n*n + n + 0.25=2n+0.25
     * (n+0.5)^2=2n+0.25
     * n=Math.sqrt(2n+0.25)-0.5
     **/

    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2*(long)n+0.25)-0.5);
    }

    public int arrangeCoinsNewton(int n) {
        double last=0;
        double res=1;
        double number=n;
        //如果精度大于10的10的-3次方，也就是0.01，则认为逼近y=0时x的值为多少
        while (Math.abs(last-res)>10e-3){
            last=res;
            res=(res*res+2*number)/(2*res+1);

        }
        int count = (int)res;
        int rest = count%2 == 0? n-(count/2)*(count+1): n-count*((count+1)/2);
        return rest <= count? count: count+1;
    }


    public static void main(String[] args) {
        //1e-15表示10的-15次方，你可以用输出语句输出验证一下！
        double err=1e-15;
        System.out.println(1e-15);
        System.out.println(new Title441().arrangeCoinsNewton(1804289383));
    }
}
