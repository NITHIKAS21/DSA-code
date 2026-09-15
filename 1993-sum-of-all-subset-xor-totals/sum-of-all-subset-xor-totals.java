class Solution {
    public int subsetXORSum(int[] nums) {
      return find(nums, 0, 0);
    }

    public int find(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }

        int take = find(nums, index + 1, xor ^ nums[index]);

        int skip = find(nums, index + 1, xor);

        return take + skip; 
    }
}