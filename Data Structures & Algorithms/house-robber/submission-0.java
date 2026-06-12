class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return dfs(nums,dp,0);
    }

    private int dfs(int[] nums, int[] dp, int i){
        if(nums.length<=i){ 
            return 0;
        }
        
        if(dp[i]!=-1){
            return dp[i];
        }

        dp[i] = Math.max(dfs(nums,dp,i+1), nums[i]+dfs(nums,dp,i+2));

        return dp[i];

    }
}
