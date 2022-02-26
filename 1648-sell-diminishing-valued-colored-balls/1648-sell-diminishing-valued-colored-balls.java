class Solution {
    public int maxProfit(int[] inventory, int orders) {
        
   int max = 0;
        for (int inv : inventory) {
            max = Math.max(max, inv);
        }
        int lo = 0, hi = max;
        while (lo < hi) {
            int mid = hi + (lo - hi) / 2;
            if (getThreshold(inventory, orders, mid)) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        long res = 0L;
        for (int inv : inventory) {
            if (inv > lo) {
                res += (long) (inv + lo + 1) * (inv - lo) / 2;
                orders -= (inv - lo);
            }
        }
        res += (long) (lo + 1) * orders;
        return (int) (res % 1_000_000_007);
    }
    
    private boolean getThreshold(int[] nums, int k, int mid) {
        int res = 0;
        for (int num : nums) {
            if (num > mid) {
                res += num - mid;
                if (res >= k) {
                    return true;
                }
            }
        }
        return false;
    }
}