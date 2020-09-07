import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> vals = new ArrayList<>();
    //     Inorder(root, vals);
    //     return vals;
    // }

    // //中序遍历递归方法
    // public void Inorder(TreeNode node, List<Integer> vals){
    //     if(node != null){
    //         if(node.left != null)Inorder(node.left,vals);
    //         vals.add(node.val);
    //         if(node.right != null)Inorder(node.right,vals);
    //     }
    // }

    // //先序遍历递归方法
    // public void Preorder(TreeNode node, List<Integer> vals){
    //     if(node != null){
    //         vals.add(node.val);
    //         if(node.left != null)Preorder(node.left, vals);
    //         if(node.right != null)Preorder(node.right, vals);
    //     }
    // }

    // //后序遍历递归方法
    // public void Postorder(TreeNode node, List<Integer> vals){
    //     if(node != null){
    //         if(node.left != null)Postorder(node.left, vals);
    //         if(node.right != null)Postorder(node.right, vals);
    //         vals.add(node.val);
    //     }
    // }

    public class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int value) {
            this.val = value;
            this.left = null;
        }
    }


    //基于栈的遍历（迭代法）: 左孩子节点依次入栈，无左孩子则开始出栈，出栈时对右孩子执行上述操作
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode curNode = root;
        while(curNode != null || !stack.isEmpty()){
            //找到最左孩子，依次入栈
            while(curNode != null){
                stack.push(root);
                curNode = curNode.left;
            }
            //依次出栈
            curNode = stack.pop();
            vals.add(curNode.val);
            curNode = curNode.right;
        }

        return vals;
    }
}
