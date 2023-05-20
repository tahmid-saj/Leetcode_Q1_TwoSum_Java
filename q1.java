class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hMap.containsKey(target - nums[i]) == true) {
                return new int[] {i, hMap.get(target - nums[i])};
            } else {
                hMap.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
