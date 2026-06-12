class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hm =  new HashSet<>();
        
        for(int i=0;i<n;i++){
            hm.add(nums[i]);
        }

        int ans = 0;

        for(int num : hm){

            if(!hm.contains(num-1)){
                int current= num;
                int longest = 1;

                while(hm.contains(current+1)){
                    longest++;
                    current++;
                }

                ans = Math.max(ans, longest);
            }
        }

        return ans;
    }
}
