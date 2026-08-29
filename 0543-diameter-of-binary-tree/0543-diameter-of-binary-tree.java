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
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int h1 = height(root.left);
        int h2 = height(root.right);
        diameter = Math.max(diameter, h1 + h2);
        int max = h1 > h2 ? h1 : h2;
        return max + 1;
    }
}