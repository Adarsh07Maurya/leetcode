class Solution {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);

        int a = 0, b = nums.length - 1;
        long sum = 0;

        while (a < b) {
            sum += nums[b] - nums[a];
            a++;
            b--;
        }
        if (a == b) {
            sum += nums[a];
        }

        return sum;
    }
}
