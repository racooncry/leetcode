package algorithm.array;

/**
 * @Author: yxw
 * @Date: 2018/10/9 9:27
 * @Description:
 * @Version 1.0
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 * <p>
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：[[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[[1,4,7],[2,5,8],[3,6,9]]
 * 示例 2：
 * <p>
 * 输入：[[1,2,3],[4,5,6]]
 * 输出：[[1,4],[2,5],[3,6]]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 1000
 * 1 <= A[0].length <= 1000
 */
public class Solution867 {

    public int[][] transpose(int[][] A) {
        int size = A.length;

        for (int i = 0; i < size; i++) {
            for (int j = i+1, length = A[i].length; j < length; j++) {
                if(i!=j) {
                    int a = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = a;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0, length = A[i].length; j < length; j++) {
                if(j==length-1){
                    System.out.println(A[i][j]);
                    continue;
                }
                System.out.print(A[i][j]+" ");
            }
        }
        return A;
    }


    public int[][] transpose2(int[][] A) {
        int size = A.length;
        int length=A[0].length;
        int[][] B=new int[length][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                B[j][i]=A[i][j];
            }
        }
        print(B);
        return A;
    }

    private void print(int[][] A){
        int size = A.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0, length = A[i].length; j < length; j++) {
                if(j==length-1){
                    System.out.println(A[i][j]);
                    continue;
                }
                System.out.print(A[i][j]+" ");
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("===========转置前===============");
       int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      //  int[][] A = {{1, 2, 3}, {4, 5, 6}};
        int siez = A.length;
        for (int i = 0; i < siez; i++) {
            for (int j = 0, length = A[i].length; j < length; j++) {
                if(j==length-1){
                    System.out.println(A[i][j]);
                    continue;
                }
                System.out.print(A[i][j]+" ");
            }
        }
        System.out.println("===========转置后===============");
        new Solution867().transpose2(A);



    }

}
