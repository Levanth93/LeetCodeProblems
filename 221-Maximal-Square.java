class Solution {
    public int maximalSquare(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int side=0;
        int[][] dp=new int[row][col];

        if(matrix == null || matrix[0].length == 0 || matrix.length == 0){
            return 0;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j] == '1'){
                    if(i==0 || j==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    }
                    side=Math.max(side,dp[i][j]);
                }
            }
        }
        return side * side;
    }
}