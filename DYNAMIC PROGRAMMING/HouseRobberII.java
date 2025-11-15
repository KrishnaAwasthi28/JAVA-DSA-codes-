// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

// Input: nums = [2,3,2]
// Output: 3
// Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

public class HouseRobberII {
    public int rob1(int[] nums){
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
    public int rob(int[] nums){
        int n=nums.length;
        int num1[]=new int[n-1];
        int num2[]=new int[n-1];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(i!=0){
                num1[j]=nums[i];
                j++;
            }
            if(i!=n-1){
                num2[k]=nums[i];
                k++;
            }
        }
        return Math.max(rob1(num1),rob1(num2));
    }
    
}
