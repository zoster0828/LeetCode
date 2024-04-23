class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        Set<Integer> []adj = (Set<Integer>[]) new HashSet[n];
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            ans.add(i);
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new HashSet<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            adj[from].add(to);
            adj[to].add(from);
        }

        Set<Integer> leaves = new HashSet<>();
        while(ans.size() > 2) {
            for (int v : ans) {
                if (adj[v].size() == 1) {
                    leaves.add(v);
                }
            }
            ans.removeAll(leaves);
            Set<Integer> nxtLeaves = new HashSet<>();
            for (int v : leaves) {
                int adjNode = adj[v].iterator().next();
                adj[adjNode].remove(v);
                if (adj[adjNode].size() == 1) {
                    nxtLeaves.add(adjNode);
                }
            }
            leaves = nxtLeaves;
        }
        return new ArrayList<>(ans);
    }
}