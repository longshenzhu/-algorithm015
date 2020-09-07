import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

import javafx.util.Pair;

class Solution {
    //前k个高频元素
    public int[] topKFrequent(int[] nums,  int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num)) {
                Integer newValue = map.get(num) + 1;
                map.put(num, newValue);
            } else {
                map.put(num, 1);
            }
        }

        // 创建k大小的小顶堆
        PriorityQueue<Pair<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (heap.size() < k) {
                heap.offer(new Pair<Integer, Integer>(num, count));
            } else if (count > heap.peek().getValue()) {
                heap.poll();
                heap.offer(new Pair<Integer, Integer>(num, count));
            }
        }

        // 取出所有小顶堆的元素
        int[] ans = new int[k];
        int i = 0;
        Iterator<Pair<Integer, Integer>> value = heap.iterator();
        while (value.hasNext()) {
            ans[i++] = heap.poll().getKey();
            // System.out.println(value.next());
        }

        // while(heap.size()>0){
        //     ans[i++] = heap.poll().getKey();
        // }
        return ans;
    }
}