package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/5 15:30
 * @Version: 1.0
 */
public class Title744 {


    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;
        int mid;
        if (target >= letters[high]) {
            return letters[0];
        }
        if (target < letters[low]) {
            return letters[0];
        }
        while (low <= high) {
            mid = (low + high) / 2;
            if (letters[mid] > target) {
                if(mid==low){
                    return letters[high];
                }
                high = mid;
            } else if (letters[mid] < target) {
                if(mid==low){
                    return letters[high];
                }
                low = mid ;
            } else {
                for (int i = mid + 1; i <=letters.length - 1; i++) {
                    if (letters[i] > target) {
                        return letters[i];
                    }
                }
            }
        }
        return letters[0];

    }

    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        System.out.println(new Title744().nextGreatestLetter(arr,'f'));
    }
}
