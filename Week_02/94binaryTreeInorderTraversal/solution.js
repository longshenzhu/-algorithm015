/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let nums = [];
    let fun = (root) => {
        root.left && fun(root.left);
        nums.push(root.val);
        root.right && fun(root.right);
    }
    root && fun(root);
    return nums;
    // let numbers = [];
    // inorder(root,numbers);
    // return numbers;


    // function inorder(curNode, numbers){

    //     if(curNode){
    //         if(curNode.left)inorder(curNode.left);
    //         numbers.push(curNode.val);
    //         if(curNode.right)inorder(curNode.right);
    //     }
    // }

    // function TreeNode(val) {
    //     this.val = val;
    //     this.left = this.right = null;
    // }
};