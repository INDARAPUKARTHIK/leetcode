class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        for (int i = 0; i < nums3.length; i++) {
            set3.add(nums3[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> it1 = set1.iterator();
        while (it1.hasNext()) {
            int num = it1.next();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Iterator<Integer> it2 = set2.iterator();
        while (it2.hasNext()) {
            int num = it2.next();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Iterator<Integer> it3 = set3.iterator();
        while (it3.hasNext()) {
            int num = it3.next();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> ans = new ArrayList<>();
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            if (map.get(key) >= 2) {
                ans.add(key);
            }
        }
        return ans;
    }
}