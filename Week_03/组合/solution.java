import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    //参考：https://leetcode-cn.com/problems/combinations/solution/77-zu-he-hui-su-fa-jing-dian-ti-mu-by-carlsun-2/
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<Integer> res = new ArrayDeque<>();
        recursion(1,n,k, res, ans);
        return ans;
        
    }

    public void recursion(int start, int n,int k,  Deque<Integer> list, List<List<Integer>> ans) {
        if(list.size()== k){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <=n; i++) {
            list.addLast(i);
            recursion(i+1, n, k, list, ans);
            list.removeLast();
        }
    }
    //递归、回溯模板
    // backtracking() {
    //     if (终止条件) {
    //         存放结果;
    //     }
    
    //     for (选择：选择列表（可以想成树中节点孩子的数量）) {
    //         递归，处理节点;
    //         backtracking();
    //         回溯，撤销处理结果
    //     }
    // }
    
}