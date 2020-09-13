import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //中序遍历简介参考版
    private double pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null)return false;
        
        if(!isValidBST(root.left))return false;
        if(root.val <= pre)return false;
        pre = root.val;
        if(!isValidBST(root.right))return false;
        return true;
    }

    // 官方递归版
    // public boolean isValidBST(TreeNode root) {
    //     return solution1(root, Long.MIN_VALUE, Long.MAX_VALUE);
    // }
    // private boolean solution1(TreeNode root, long minValue, long maxValue) {
    //     if (root == null)  return true;
    //     if (root.val <= minValue || root.val >= maxValue) return false;
    //     return solution1(root.left, minValue, root.val)
    //             && solution1(root.right, root.val, maxValue);
    // }
    
    // //中序遍历：自创版
    // private boolean ans = true;
    // public boolean isValidBST(TreeNode root) {
    //     //中序遍历法，上个节点小于下个节点
    //     List<TreeNode> res = new ArrayList<>();
    //     inorderTraversal(root, res);
    //     return ans;
        
    // }
    // public void inorderTraversal(TreeNode curNode, List<TreeNode> res) {
    //     //terminator
    //     if(curNode == null || !ans){
    //         return;
    //     }
        
    //     if(curNode.left != null) {
    //         inorderTraversal(curNode.left, res);
    //     }
    //     if(!res.isEmpty() && res.get(res.size()-1).val > curNode.val){
    //         ans = false;
    //         return;
    //     }else{
    //         res.add(curNode);
    //     }
        
    //     if(curNode.right != null){
    //         inorderTraversal(curNode.right, res);
    //     }
	// }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}