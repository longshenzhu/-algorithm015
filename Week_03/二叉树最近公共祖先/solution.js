class TreeNode {
    constructor(x){
        this.val = x;
        this.left = null;
        this.right = null;
    }
}

function main(){
    let root = new TreeNode(3);
    let node5 = new TreeNode(5);
    let node1 = new TreeNode(1);
    let node6 = new TreeNode(6);
    let node2 = new TreeNode(2);
    let node0 = new TreeNode(0);
    let node8 = new TreeNode(8);
    let node7 = new TreeNode(7);
    let node4 = new TreeNode(4);

    node2.left = node7;
    node2.right = node4;

    node5.left = node6;
    node5.right = node2;

    node1.left = node0;
    node1.right = node8;

    root.left = node5;
    root.right = node1;

    let pPath = [];
    getPath(root, node5, pPath);
    console.log(node5.val,pPath);
    let qPath = [];
    getPath(root, node4, qPath);
    console.log(node4.val,qPath);
}
main();

function getPath(curNode, target, path){
    if(curNode.val == target.val){
        path.push(curNode.val);
        return;
    }
    
    if(curNode.left !=null && path.length == 0) getPath(curNode.left, target, path);
    if(curNode.right != null && path.length == 0) getPath(curNode.right, target, path);

    if(path.length>0) path.push(curNode.val);
}



