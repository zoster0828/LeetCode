class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        // 키와 인덱스를 매핑하는 해시맵 생성
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        // 키 배열을 내림차순으로 정렬
        Integer[] sortedHeights = Arrays.stream(heights).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedHeights, (a, b) -> b - a);
        
        // 정렬된 키에 따라 이름 배열 생성
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = map.get(sortedHeights[i]);
        }
        
        return sortedNames;
    }
}