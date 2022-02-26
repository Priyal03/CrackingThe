class Solution {
    public int maxProfit(int[] inventory, int orders) {
        int lo = 1, hi = Arrays.stream(inventory).max().getAsInt();
        Arrays.sort(inventory);

        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            if (getCount(inventory, mid) < orders)
                hi = mid - 1;
            else
                lo = mid;
        }

        int minPrice = lo, ordered = 0;
        long profit = 0;

        for (int i = inventory.length - 1; i >= 0; i--) {
            int curPrice = inventory[i];
            if (curPrice <= minPrice) break;
            profit += (long) (curPrice + minPrice + 1) * (curPrice - minPrice) / 2;
            ordered += curPrice - minPrice;
        }

        profit += (long) minPrice * (orders - ordered);
        profit = profit % 1000000007;
        return (int) profit;
    }

    private long getCount(int[] inventory, int mid) {
        long count = 0;
        for (int i = inventory.length - 1; i >= 0; i--) {
            if (inventory[i] < mid) break;
            count += inventory[i] - mid + 1;
        }
        return count;
    }
}