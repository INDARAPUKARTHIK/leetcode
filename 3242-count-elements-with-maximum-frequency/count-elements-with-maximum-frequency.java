class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> values = new ArrayList<>(hash.values());
        
        int maxf =0;
        int n = values.size();
        for(int i=0;i<n;i++){
            if(values.get(i)> maxf){
                maxf = values.get(i);
            }
        }
            int ans = 0;
            for (int j = 0; j < n; j++) {
            if (values.get(j) == maxf) {
                ans += values.get(j);
            }
        }
    return ans;
    }
}
