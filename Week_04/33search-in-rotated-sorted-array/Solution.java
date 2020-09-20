
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0)return -1;
        if(nums.length == 1)return nums[0] == target? 0: -1;
        int left = 0, right = nums.length -1;
        int mid = -1;
        while(left <= right){
            System.out.print("left:" + left + ",right:" + right);
            mid = (left + right)/2;
            if(nums[mid] == target)return mid;
            //左侧递增
            if(nums[mid]>= nums[0]){
                if(nums[0] < target|| target< nums[mid])right = mid - 1;
                else left = mid + 1;
            }
            //右侧递增
            else{
                if(nums[mid] < target && target < nums[nums.length -1])left = mid +1;
                else right = mid -1;
            }

        }
        return -1;
    }

    private void binarySearch(int[] array, int target) {
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
    }


}