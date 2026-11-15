class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int MOD = 1_000_000_007;
        int preFixSum = 0;
        int eventCount = 1;
        int oddCount = 0;
        int totalCount = 0;
        for (int num : arr) {
            preFixSum += num;
            if (preFixSum % 2 == 0) {
                count += oddCount;
                eventCount++;
            } else {
                count += eventCount;
                oddCount++;
            }
            count %= MOD;
        }

        return count;
    }
}