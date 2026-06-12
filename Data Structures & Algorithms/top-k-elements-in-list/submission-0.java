class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] buckets = new List[n+1];
        for(int i=0;i<buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int[] ans = new int[k];
        int index = 0;
        for(int i = buckets.length-1;i>0 && index < k;i--){
            for(int val : buckets[i]){
                ans[index++] = val;
                if(index == k){
                    return ans;
                }
            }
        }
        return ans;
    }
}
