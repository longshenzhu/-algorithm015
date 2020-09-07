哈希表：
    以<Key,Value>方式存储数据。 快速定位数据,时间复杂度O(1), 常用于优化O(n)的查询。
    哈希函数：根据key值计算存储位置的函数。
    冲突：根据不同key值得到相同的函数值。
    冲突处理：
        链表法：在存储位置存入链表，冲突发生时，添加入链表。
        开放定址法：按照规则占用别的空间。

HashMap 实现:
    HashMap的主干是一个Entry数组。Entry是HashMap的基本组成单元，每一个Entry包含一个key-value键值对。
    transient Entry<K,V>[] table = (Entry<K,V>[]) EMPTY_TABLE;
    ![Alt text](https://github.com/longshenzhu/-algorithm015/blob/master/Week_02/Images/Node.jpg)