class FindSumPairs {
    List<Integer> list1;
    Map<Integer, Integer> countMap;
    int[] nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        list1 = new ArrayList();   
        countMap = new HashMap();     

        for(int num : nums1) {
            list1.add(num);
        }

        this.nums2 = nums2;

        for(int num : nums2) {
            countMap.compute(num, (key, val) -> val == null ? 1 : val + 1);
        }
        

        Collections.sort(list1);
        // Collections.sort(list2);
    }
    
    public void add(int index, int val) {        
        int num = nums2[index];
        countMap.compute(num, (key, value) -> value == null ? 1 : value - 1);
        num += val;
        countMap.compute(num, (key, value) -> value == null ? 1 : value + 1);
        // Collections.sort(list2);
    }
    
    public int count(int tot) {
        int result = 0;
        for(int i = 0 ; i < list1.size() ; i++) {
            int a = list1.get(i);
            int num = countMap.getOrDefault(tot-a, 0);            
            result += num;
        }

        return result;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */