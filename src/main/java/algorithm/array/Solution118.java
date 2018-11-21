package algorithm.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: yxw
 * @Date: 2018/10/25 9:00
 * @Description:
 * @Version 1.0
 */
public class Solution118 {

    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = null;
        List<List<Integer>> res = new ArrayList<List<Integer>>(numRows);
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                list = new ArrayList<Integer>(1);
                list.add(1);
            } else if (i == 1) {
                list = new ArrayList<Integer>(1);
                list.add(1);
                list.add(1);
            } else {
                list = new ArrayList<Integer>(1 + i);
                list.add(1);
                for (int j = 0; j < i - 1; j++) {
                    int k=j;
                    int left = res.get(i - 1).get(k);
                    int right = res.get(i - 1).get(++k);
                    System.out.println("left:"+left+",right:"+right+",i:"+i+",j:"+j);
                    list.add(left + right);
                }
                list.add(1);
            }
            res.add(list);

        }

        return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> res=  new Solution118().generate(5);
        Iterator<List<Integer>> iterator=res.iterator();
        while (iterator.hasNext()){
            List<Integer> list=iterator.next();
            for(int i=0,size=list.size();i<size;i++){
                if(i!=size-1) {
                    System.out.print(list.get(i)+",");
                }else {
                    System.out.println(list.get(i));
                }
            }
        }



    }
}
