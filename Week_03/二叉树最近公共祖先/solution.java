import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

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
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(root == null || root == p || root == q)return root;

    //     TreeNode left = lowestCommonAncestor(root.left, p, q);
    //     TreeNode right = lowestCommonAncestor(root.right, p, q);
    //     if(left != null && right != null)return root;
    //     if(left != null) return left;
    //     if(right != null) return right;
    //     return null;
    // }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pPath = new Stack<>();
        getPath(root, p, pPath);
        Stack<TreeNode> qPath = new Stack<>();
        getPath(root, q, qPath);
        TreeNode ans = root;
        while(!pPath.empty() && !qPath.empty() && pPath.peek().val == qPath.peek().val){
            pPath.pop();
            ans = qPath.pop();
        }
        return ans;
    }

    public void getPath(TreeNode curNode, TreeNode target, Stack<TreeNode> path) {
        if (curNode.val == target.val) {
            path.push(curNode);
            return;
        }

        if (curNode.left != null && path.size()== 0) {
            getPath(curNode.left, target, path);
        }

        if (curNode.right != null && path.size()== 0) {
            getPath(curNode.right, target, path);
        }
        if(path.size()> 0)path.push(curNode);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

