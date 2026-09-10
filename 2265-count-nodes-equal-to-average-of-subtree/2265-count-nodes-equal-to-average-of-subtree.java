/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int output = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return output;
    }

    int[] dfs(TreeNode root) {

        if (root == null) {

            return new int[] { 0, 0 };

        }

        int leftArr[] = dfs(root.left);

        int rightArr[] = dfs(root.right);

        int sum = leftArr[0] + rightArr[0] + root.val;

        int count = leftArr[1] + rightArr[1] + 1;

        int avg = sum / count;

        if (avg == root.val) {
            output++;
        }
        return new int[] { sum, count };
    }

}