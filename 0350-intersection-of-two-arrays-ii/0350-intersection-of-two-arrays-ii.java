class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0, right = 0, k = 0;
        int[] arr = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                arr[k++] = nums1[left];
                left++;
                right++;
            } else if (nums1[left] < nums2[right]) {
                left++;
            } else {
                right++;
            }
        }
        return Arrays.copyOf(arr, k);

    }
}