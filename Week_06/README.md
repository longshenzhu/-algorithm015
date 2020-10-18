# 第六周学习笔记 
## 动态规划 Dynamic Programming
* 定义: "Simplifying a complicated problem by breaking it down into simpler sub-problems"(in a recursive manner)
* Divide & Conquer + Optimal substructure 分治 + 最优子结构

* 动态规划 vs 递归或分治
    1. 动态规划 和 递归或者分治无根本上的区别（关键看有无最优子结构）
    2. 共性：找到重复子问题
    3. 差异性：最优子结构、中途可以淘汰次优解

* 动态规划关键点
    1. 最优子结构: opt[n]= best_of(opt[n-1],opt[n-2],...)
    2. 存储中间状态: opt[i]
    3. 递推公式（状态转移方程或DP方程）
        如：Fib: opt[i] = opt[n-1] + opt[n-2]
        二维路径:opt[i,j] = opt[i+1][j] + opt[i][j+1] (且判断a[i][j]是否为空)

