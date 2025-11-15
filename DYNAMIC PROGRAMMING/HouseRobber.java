// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

public class HouseRobber {
    public int rob(int[] nums){
        int n=nums.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<n+1;i++){
            int pick=nums[i-1]+dp[i-2];
            int nopick=0+dp[i-1];
            dp[i]=Math.max(pick,nopick);
        }
        return dp[n];
    }
}
