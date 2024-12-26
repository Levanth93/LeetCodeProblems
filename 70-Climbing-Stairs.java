class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return climb(dp,n);
    }

    public static int climb(int[] dp,int n){
        if(n==1 || n==2)
        return n;

        if(dp[n]!=0) return dp[n];

        dp[n]=climb(dp,n-1)+climb(dp,n-2);

        return dp[n];
    }
}