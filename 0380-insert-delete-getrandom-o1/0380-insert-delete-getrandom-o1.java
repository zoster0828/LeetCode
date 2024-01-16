class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int a = new Random().nextInt(set.size());
        Integer[] array = set.toArray(set.toArray(new Integer[0]));
        return array[a];
    }
}