import java.util.PriorityQueue;

//请参考四个解法 https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/solution/3chong-jie-fa-miao-sha-topkkuai-pai-dui-er-cha-sou/
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length ==0 || k == 0)return new int[0];
        if(k > arr.length)return arr;
        //堆 priorityQueue，默认小顶堆，转成大顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>((v1, v2) -> v2 - v1);

        int[] ans = new int[k];
        for (int i = 0; i < arr.length; i++) {
            if(heap.size()<k){
                heap.offer(arr[i]);
            }else if(arr[i] < heap.peek()){
                heap.poll();
                heap.offer(arr[i]);
            }
        }
        
        //返回堆中元素
        int idx = 0;
        for(int num: heap) {
            ans[idx++] = num;
        }
        return ans;
    }
    // 时间复杂度 O(olongn）
    // public int[] getLeastNumbers(int[] arr, int k) {
    //     if(arr.length ==0 || k > arr.length)return arr;
    //     Arrays.sort(arr);
    //     return Arrays.copyOf(arr,k);
    // }

    // 时间复杂度 nlongn + klogn
    // public int[] getLeastNumbers(int[] arr, int k) {
    //     //堆 priorityQueue，默认小顶堆
    //     PriorityQueue<Integer> heap = new PriorityQueue<>();
    //     for (int i = 0; i < arr.length; i++) {
    //         heap.add(arr[i]);
    //     }

    //     int[] ans = new int[k];
    //     for (int i = 0; i < k; i++) {
    //         ans[i] = heap.poll();
    //     }
    //     return ans;
    // }
}