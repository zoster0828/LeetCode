class RandomizedSet {
    Set<Integer> set;
    List<Integer> list;
    public RandomizedSet() {
        set = new HashSet();
        list = new ArrayList();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int a = new Random().nextInt(set.size());
        Iterator<Integer> iterator = set.stream().iterator();
        
        for(int i = 0 ; i < set.size() ; i++) {
            int result = iterator.next();
            if(i == a) return result;            
        }
        
        return -1;
    }
}