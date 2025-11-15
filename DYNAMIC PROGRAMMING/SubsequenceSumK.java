// Given an array arr and target sum k, check whether there exists a subsequence such that the sum of all elements in the subsequence equals the given target sum(k).


// Example:

// Input:  arr = [10,1,2,7,6,1,5], k = 8.
// Output:  Yes
// Explanation:  Subsequences like [2, 6], [1, 7] sum upto 8

public class SubsequenceSumK {
    public static boolean checkSubsequence(int N,int arr[], int K){
        int[][] dp=new int[N][K+1];
        for(int i=0;i<N;i++){
            dp[i][0]=1;
        }
        for(int t=1;t<=K;t++){
            if(t==arr[0]) dp[0][t]=1;
            else dp[0][t]=2;
        }
        for(int i=1;i<N;i++){
            for(int j=1;j<=K;j++){
                int pick=2;
                if(arr[i]<=j){
                    pick=dp[i-1][j-arr[i]];
                    if(pick==1){
                        dp[i][j]=1;
                        continue;
                    }
                }
                int nopick=dp[i-1][j];
                dp[i][j]=nopick;
            }
        }
        return (dp[N-1][K]==1);
    }
}
