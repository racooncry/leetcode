package algorithm.jk;

/**
 * @Author: yxw
 * @Date: 2018/11/2 17:12
 * @Description:
 * @Version 1.0
 */
public class Digui {
   public int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n-1) + 1;
    }

    public static void main(String[] args) {




    }
}
