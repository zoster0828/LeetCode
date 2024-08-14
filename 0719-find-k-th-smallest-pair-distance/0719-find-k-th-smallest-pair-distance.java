class Solution {
    private List<Integer> list;
    private int k = 0;
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        this.k = k;
        list = new ArrayList();        
        int max = -1;
        for(int i = 0 ; i < nums.length-1 ; i++) {
            for(int j = i+1 ; j < nums.length ; j++) {
                int distance = nums[j]-nums[i];
                // if(list.size() > k && list.get(k-1) < distance) break;

                list.add(distance);
                // Math.max(max, distance);
            }
        }

        Collections.sort(list);

        return list.get(k-1);
    }
}