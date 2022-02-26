class Solution {
    public int maxProfit(int[] inventory, int orders) {
        
        TreeMap<Long, Long> treeMap = new TreeMap<>(); // <The number of balls of specific color, Count>
        
        for (int number : inventory)
            treeMap.put((long)number, treeMap.getOrDefault((long)number, 0L) + 1);
        
        long result = 0, mod = (long)Math.pow(10, 9) + 7;
        
        while (orders > 0)
        {
            Map.Entry<Long, Long> maxEntry = treeMap.pollLastEntry();
            long maxNumber = maxEntry.getKey(), maxCount = maxEntry.getValue(), subMaxNumber = 0;
            
            if (!treeMap.isEmpty())
                subMaxNumber = treeMap.lastKey();
            
            long totalCount = (maxNumber - subMaxNumber) * maxCount;
            
            if (orders >= totalCount)
            {
                long n = maxNumber - subMaxNumber, a1 = maxNumber, an = subMaxNumber + 1; 
            
                result = (result + n * (a1 + an) / 2 * maxCount) % mod; // Note: Sum of arithmetic sequence n * (a1 + an) / 2
                orders -= n * maxCount;
                
                treeMap.put(subMaxNumber, treeMap.getOrDefault(subMaxNumber, 0L) + maxCount); // Get the orders until maxNumber equals subMaxNumber
            }
            else
            {
                long n = orders / maxCount, a1 = maxNumber, an = a1 - n + 1;
                
                result = (result + n * (a1 + an) / 2 * maxCount) % mod;
                orders -= n * maxCount;
                
                result = (result + orders * (an - 1)) % mod;
                break; // orders = 0
            }
        }
        
        return (int)result;
    }
}