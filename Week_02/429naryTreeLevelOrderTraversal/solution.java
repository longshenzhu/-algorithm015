import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null)return null;
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> rootValue = new ArrayList<Integer>(1);
        rootValue.add(root.val);
        res.add(rootValue);

        getLevelNodes(root.children, res);
        return res;
    }

    public void getLevelNodes(List<Node> levelNodes, List<List<Integer>> res){
        if(levelNodes == null || levelNodes.size() == 0){ return; }
        List<Node> perLevelNodes = new ArrayList<>();
        List<Integer> nodesValue = new ArrayList<>();
        for (int i = 0; i < levelNodes.size(); i++) {
            nodesValue.add(levelNodes.get(i).val);
            perLevelNodes.addAll(levelNodes.get(i).children);
        }
        res.add(nodesValue);
        getLevelNodes(perLevelNodes, res);
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};