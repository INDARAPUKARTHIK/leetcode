class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        int[] arr = new int[2];
        int index = 0;
        for (int i = 0; i < keys.size(); i++) {
            int key = keys.get(i);
            if (map.get(key) == 1) {
                arr[index] = key;
                index++;
            }
        }
        return arr;
    }
}