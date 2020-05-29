package question06;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val=x;
        }
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return new TreeNode(1);
    }
}