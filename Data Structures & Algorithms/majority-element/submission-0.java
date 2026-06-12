class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        if(n==0 || n==2) return 0;

        int frq = 0;
        int ans = 0;

        for(int i=0;i<n;i++){
            if(frq==0){
                ans = nums[i];
            }
            if(ans==nums[i]){
                frq++;
            }else{
                frq--;
            }
        }
        return ans;
    }
}