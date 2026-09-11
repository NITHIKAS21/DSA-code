class Solution {
    public int splitArray(int[] nums, int k) {
        long low = 0;
        long high = 0;

        for(int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        while(low < high) {
            long mid = low + (high - low) / 2;

            int part = 1;
            long sum = 0;
            for(int n :nums) {
                if(sum + n > mid) {
                    part++;
                    sum = n;
                }else {
                    sum += n;
                }
            }

            if(part <= k) {
                high = mid;
            }else {
                low = mid + 1;
            }
        }

        return (int) low;
    }
}