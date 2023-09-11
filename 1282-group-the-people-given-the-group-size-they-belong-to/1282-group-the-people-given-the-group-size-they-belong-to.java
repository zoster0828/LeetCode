class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int num = groupSizes[i];
            List<Integer> list = map.get(num);
            if(list == null) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(num, temp);
                continue;
            }

            if(list.size() < num) {
                list.add(i);
            } else {
                result.add(list);
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(num, temp);
            }
        }

        for (Map.Entry<Integer, List<Integer>> integerListEntry : map.entrySet()) {
            result.add(integerListEntry.getValue());
        }

        return result;
    }
}