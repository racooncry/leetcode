package algorithm.array.binary_search;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/14 9:06
 * @Version: 1.0
 */
public class Title436 {
    public int[] findRightInterval(Interval[] intervals) {
        int[] res = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            int min = -1;
            for (int j = 0; j < intervals.length; j++) {
                if (i != j) {
                    if (intervals[i].end <= intervals[j].start) {
                        if (min == -1) {
                            min = j;
                            continue;
                        }
                        if (intervals[j].start <= intervals[min].start) {
                            min = j;
                        }
                    }
                }
            }
            res[i] = min;
        }
        return res;
    }


    public int[] findRightInterval2(Interval[] intervals) {
        int[] res = new int[intervals.length];
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i].start, i);
        }
        for (int i = 0; i < intervals.length; i++) {
            Integer start = map.ceilingKey(intervals[i].end);
            if(null==start){
                res[i]=-1;
            }else {
                res[i]= map.get(start);
            }

        }
        return res;
    }


    public static void main(String[] args) {

        TreeMap map=new TreeMap();

    }
}


class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }


}