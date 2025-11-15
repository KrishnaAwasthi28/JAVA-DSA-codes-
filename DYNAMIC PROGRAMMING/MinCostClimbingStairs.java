// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15

public class MinCostClimbingStairs {
    public int minCost(int[] cost){
        int n=cost.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            int onestep=cost[i-1]+dp[i-1];
            int twostep=cost[i-2]+dp[i-2];
            dp[i]=Math.min(onestep,twostep);
        }
        return dp[n];
    }
}
