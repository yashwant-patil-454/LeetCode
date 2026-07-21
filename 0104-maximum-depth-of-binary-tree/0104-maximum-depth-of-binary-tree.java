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
    public int maxDepth(TreeNode root) {
        int max = findDepth(root);
        return max;
    }

    int findDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int h1 = findDepth(root.left);
        int h2 = findDepth(root.right);
        int max = h1 > h2 ? h1 : h2;
        return max + 1;
    }
}