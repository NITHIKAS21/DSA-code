class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        int n = nums.length;
        long MOD = 1000000007;

        if (m == 1) return nums;

        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] != b[0] ? Long.compare(a[0], b[0])
                                    : Long.compare(a[1], b[1])
        );

        long max = 0;

        for (int i = 0; i < n; i++) {
            pq.add(new long[]{nums[i], i});
            max = Math.max(max, nums[i]);
        }

        while (k > 0 && pq.peek()[0] < max) {
            long[] a = pq.poll();
            a[0] *= m;
            pq.add(a);
            k--;
        }

        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) a[i] = pq.poll();

        long q = k / n, r = k % n;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            long power = q + (i < r ? 1 : 0);
            ans[(int)a[i][1]] = (int)(a[i][0] % MOD * pow(m, power, MOD) % MOD);
        }

        return ans;
    }

    long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            b /= 2;
        }
        return res;
    }
}