class RandomizedSet {
    private List<Integer> set;
    private Map<Integer, Integer> map;

    private Random random;

    public RandomizedSet() {
        set = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        set.add(val);

        map.put(val, set.size() - 1);

        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);

        int lastElement = set.get(set.size() - 1);

        set.set(index, lastElement);

        map.put(lastElement, index);

        set.remove(set.size() - 1);

        map.remove(val);

        return true;
    }

    public int getRandom() {
        int index = random.nextInt(set.size());

        return set.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */