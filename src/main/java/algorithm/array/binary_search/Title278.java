package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/7 9:11
 * @Version: 1.0
 */
public class Title278 extends VersionControl {
//    System.out.println("low: "+low+",mid: "+mid+",high: "+high+",isBadVersion(mid):"+isBadVersion(mid)+",!isBadVersion(mid -1): "+isBadVersion(mid - 1));
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(new Title278().firstBadVersion(1));
    }

}

class VersionControl {

    boolean isBadVersion(int version) {
        if(version>=4){
            return true;
        }
        return false;
    }


}
