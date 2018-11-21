package algorithm.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yxw
 * @Date: 2018/10/25 9:32
 * @Description:
 * @Version 1.0
 */
public class Solution119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = null;
        List<List<Integer>> res = new ArrayList<List<Integer>>(rowIndex);
        for (int i = 0; i < rowIndex+1; i++) {
            if (i == 0) {
                list = new ArrayList<Integer>(1);
                list.add(1);
            } else if (i == 1) {
                list = new ArrayList<Integer>(2);
                list.add(1);
                list.add(1);
            } else {
                list = new ArrayList<Integer>(1 + i);
                list.add(1);
                for (int j = 0; j < i - 1; j++) {
                    int k = j;
                    int left = res.get(i - 1).get(k);
                    int right = res.get(i - 1).get(++k);
                    System.out.println("left:" + left + ",right:" + right + ",i:" + i + ",j:" + j);
                    list.add(left + right);
                }
                list.add(1);
                 if(i==rowIndex+1){
                     return list;
                 }
                for(int j=0,size=list.size();j<size;j++){
                    if(j==size-1){
                        System.out.println(list.get(j));
                    }else {
                        System.out.print(list.get(j)+",");
                    }
                }


            }
            res.add(list);
        }
        return list;
    }



    public List<Integer> getRow2(int rowIndex) {
        long temp = 1;
        List<Integer> row = new LinkedList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int)temp);
            temp = temp * (rowIndex-i) / (i+1);
        }
        return row;
    }
    public static void main(String[] args) {
        List<Integer> res=new Solution119().getRow2(3);


    }

}
