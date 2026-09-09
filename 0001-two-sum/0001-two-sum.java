class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i=i+1){
            for (int j=0;j<i;j=j+1){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j} ;}}}
                    return new int[]{-1,-1};


    }
}