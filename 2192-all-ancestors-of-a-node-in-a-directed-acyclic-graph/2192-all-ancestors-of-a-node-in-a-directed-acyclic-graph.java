class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        boolean[][] ancestors = new boolean[n][n];

        for(int[] edge : edges) {
            ancestors[edge[1]][edge[0]] = true;
        }

        List<List<Integer>> result = new ArrayList();

        for(boolean[] ancestor : ancestors) {
            Set<Integer> temp = new HashSet();
            for(int i = 0 ; i < ancestor.length ; i++) {
                if(ancestor[i]) {
                    if(result.size() > i) temp.addAll(result.get(i));
                    temp.add(i);
                }
            }
            result.add(new ArrayList(temp));
        }

        return result;
    }
}