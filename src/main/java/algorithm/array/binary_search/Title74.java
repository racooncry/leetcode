package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/21 8:52
 * @Version: 1.0
 */
public class Title74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || (matrix.length == 1 && matrix[0].length == 0)) {
            return false;
        }
        int l = 0;
        int r;
        int columnLength = matrix[0].length;
        int lineLength = matrix.length;
        if (columnLength == 0) {
            r = lineLength - 1;
        } else {
            r = columnLength * lineLength - 1;
        }
        int mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            int number;
            if (0 == columnLength) {
                number = matrix[mid][0];
            } else {
                number = matrix[mid / columnLength][mid % columnLength];
            }

            if (number > target) {
                r = mid - 1;
            } else if (number < target) {
                l = mid + 1;
            } else {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);

    }
}
