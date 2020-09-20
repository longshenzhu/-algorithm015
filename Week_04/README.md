# 第四周学习笔记

## 搜索-遍历

* 每个节点都要访问一次
* 每个节点仅访问一次
* 对于节点的访问顺序不限
  * 深度优先： depth first search
  * 广度优先： breadth first search
  * 优先级优先： 启发式搜索，priority first search

## 贪心算法

* 定义：贪心算法是一种在局部都采取最好或最优的选择，从而达到全局最好或最优的算法。
* 使用场景：问题能够分解为子问题，子问题的最优解能递推到最终问题的最优解。
* 贪心算法 vs 动态规划
  * 贪心：当下局部最优判断，不能回退。
  * 动态规划：保存以前的运算结果、 最优判断、 能够回退

## 二分查找

* 使用前提：
  1. 目标序列单调性（单调递增或递减）
  2. 存在上下界（bounded）
  3. 能够通过索引访问（index accessible），链表通常不二分查找
* 二分查找模板

``` 二分查找模板
    //1.边界条件
    int left= 0, right= array.length-1;
    int mid = 0;
    while(left <= right){
        mid = (left + right)/2;
        if(array[mid] == target){
            //find the target
            //break or return result;
            return;
        }
        else if(array[mid] < target)left= mid+1;
        else right = mid - -1;
    }
```
