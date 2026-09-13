class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        double ans = Double.POSITIVE_INFINITY;
        while(i < j){
            ans = Math.min(ans,(nums[i]+nums[j])/2.0);
            i++;
            j--;
        }
        return ans;
    }
}