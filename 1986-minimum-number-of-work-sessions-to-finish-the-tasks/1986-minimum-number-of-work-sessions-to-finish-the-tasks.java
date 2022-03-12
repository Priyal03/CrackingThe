class Solution {
    Integer[][] dp;
    
    int dfs(int mask,int[] tasks,int stime,int curTotal){
        int n = tasks.length;
        if(mask == (1 << n) - 1){    
            return 1;
        }
        
        if(dp[mask][curTotal] != null){
            return dp[mask][curTotal];
        }
        
        int answer = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++){
            //Not Selected in curSessionTime;
            if((mask & (1 << i)) == 0){
                if(curTotal + tasks[i] <= stime){
                    int subAns = dfs((mask | (1 << i)),tasks,stime,curTotal + tasks[i]);
                    answer = Math.min(subAns,answer);   
                }else{
                    int subAns = 1 + dfs((mask | (1 << i)),tasks,stime,tasks[i]);
                    answer = Math.min(subAns,answer);
                }     
            }
        }
        
        return dp[mask][curTotal] = answer;
    }
    
    public int minSessions(int[] tasks, int sessionTime) {
        int n = tasks.length;
        dp = new Integer[(1 << 15)][16];
        int answer = dfs(0,tasks,sessionTime,0);
        return answer;
    }
}