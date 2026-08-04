class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int small = nums[0];
        int large = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (small > nums[i]) {
                small = nums[i];
            }

        }
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int element = small;

        for (int num : nums) {

            while (element < num) {
                list.add(element);
                element++;
            }

            element++;
        }

        return list;

    }
}