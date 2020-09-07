import java.util.HashMap;

//查找数组中两数之和==target的索引
//时间复杂度O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target-nums[i])){
                indexs[0] = i;
                indexs[1] = hash.get(target-nums[i]);
                return indexs;
            }
            // 将数据存入 key为补数 ，value为下标
            hash.put(nums[i],i);
        }
        return indexs;
    }

    public int[] twoSum1(int[] nums, int target) {
        int i = 0, j = 0;
        ok:
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[j] == target-nums[i]){
                    break ok;
                }
            }
            j = 0;
        }
        if(j==0){
            return null;
        }
        return  new int[]{i,j};
    }
}