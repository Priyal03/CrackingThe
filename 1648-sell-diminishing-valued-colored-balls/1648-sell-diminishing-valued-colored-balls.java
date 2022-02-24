class Solution {
    public int maxProfit(int[] inventory, int orders) {
        
        int n = inventory.length;
        long MOD = (long)1e9 + 7;
        long totalValue = 0;
        
        Arrays.sort(inventory);
        
        int count = 0;
        for (int i = n - 1; i >= 0; i--){
            count++;
            if (i == 0 || inventory[i] > inventory[i - 1]){
                long diff = i == 0 ? inventory[i] : inventory[i] - inventory[i - 1];
                if (count * diff < orders) {
                    totalValue += 
                        (2 * inventory[i] - diff + 1)
                        * diff * count / 2 % MOD;
                    orders -= count * diff;
                } else {
                    diff = orders / count;
                    long remainder = orders % count;
                                    
                    totalValue += 
                        (2 * inventory[i] - diff + 1)
                        * diff * count / 2 % MOD;
                    totalValue += (inventory[i] - diff) * remainder % MOD;
                    totalValue %= MOD;
                    break;
                }
            }
        }
        return (int)totalValue;
    }
}