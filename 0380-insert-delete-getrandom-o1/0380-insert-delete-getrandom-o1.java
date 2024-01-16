class RandomizedSet {
    Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet();
    }

    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }

        return false;
    }

    public boolean remove(int val) {
        if(set.contains(val)){
           set.remove(val);
           return true;
        }
        return false;
    }

    public int getRandom() {
        int a = new Random().nextInt(set.size());
        Integer[] array = set.toArray(set.toArray(new Integer[0]));
        return array[a];
    }
}