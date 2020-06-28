package main.java.algorithm.dynamic_plan;

/**
 * @Author yangxw
 * @Date 2020/2/25 14:38
 * @Description
 * @Version 1.0
 */
public class Subset {

    public static final int[] arr = {3,34,4,12,5,2};


    public static boolean recSubset(int[] arr,int i ,int s){
        if(s==0){
            return true;
        }else if(i ==0){
            return arr[0]==s;
        }else if(arr[i]>s){
            return recSubset(arr,i-1,s);
        }else {
            boolean A = recSubset(arr,i-1,s-arr[i]);
            boolean B = recSubset(arr,i-1,s);
            return A || B;
        }
    }


    public static void main(String[] args) {
        System.out.println(recSubset(arr,arr.length-1,13));
    }
}
