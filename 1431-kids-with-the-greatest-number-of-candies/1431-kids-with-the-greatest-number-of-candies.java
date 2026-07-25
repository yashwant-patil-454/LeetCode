class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new LinkedList<>();

        int maxOne = Integer.MIN_VALUE;
        for (int candie : candies) {
            if (candie > maxOne) {
                maxOne = candie;
            }
        }

        for (int candie : candies) {
            if ((candie + extraCandies) >= maxOne) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}