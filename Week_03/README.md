# 学习笔记

## 递归

* 核心思想
  
* 思维要点
  1. 不要人肉进行递归（最大误区）
  2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
  3. 数学归纳法思维
  
* 递归模板
  
```递归模板
public void recursion(int level, int param){
    int Max_Level;
    //1.terminator
    if(level> Max_Level){
        //process result
        return;
    }

    //2.process current logic
    process(level, param);

    //3. drill down
    recursion(level+1, newParam);

    //4.restore current status
}
```
