package algorithm.array.binary_search;

/**
 * @Author: yangxw
 * @Description:
 * @Date: 2019/3/13 9:06
 * @Version: 1.0
 */
public class Title222 {

    private int count;

    public int countNodes(TreeNode root) {
        getTreeAllNodeNumber(root);
        return count;

    }


    private void getTreeAllNodeNumber(TreeNode root) {
        if (null == root) {
            return;
        }
        count++;
        getTreeAllNodeNumber(root.left);
        getTreeAllNodeNumber(root.right);

    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
