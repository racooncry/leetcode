package main.java.algorithm.dynamic_plan;

public class Solution198 {

    public int rob(int[] nums) {
        int sumOne=0;
        int sumTwo=0;
        for(int i=0,size=nums.length;i<size;i++){
            if(i%2==0){
                sumOne+=nums[i];
            }else {
                sumTwo+=nums[i];
            }
        }
        if(sumOne>=sumTwo){
            return sumOne;
        }
        return sumTwo;

    }


}
