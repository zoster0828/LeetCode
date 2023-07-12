class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Node[] nodes = new Node[graph.length];
        Queue<Integer> terminals = new LinkedList<>();

        for(int index = 0 ; index < graph.length ; index++) {
            if(nodes[index] == null) {
                nodes[index] = new Node(index);
            }
            if(graph[index].length == 0) {
                terminals.add(index);
            }

            for(int dest = 0 ; dest < graph[index].length ; dest ++) {
                nodes[index].addDestination(graph[index][dest]);

                if(nodes[graph[index][dest]] == null) {
                    nodes[graph[index][dest]] = new Node(graph[index][dest]);
                }
                nodes[graph[index][dest]].addFrom(index);
            }
        }

        List<Integer> result = new ArrayList();
        while(terminals.size() != 0) {
            Node terminal = nodes[terminals.poll()];
            result.add(terminal.getIndex());
            Set<Integer> from = terminal.getFrom();
            for(Integer index : from) {
                nodes[index].removeDest(terminal.getIndex());
                if(nodes[index].isTerminal()) {
                    terminals.add(index);
                }
            }
        }

        Collections.sort(result);
        return result;
    }

    public class Node {
        private int index;
        private Set<Integer> dest;
        private Set<Integer> from;
        public Node(int index) {
            this.index = index;
            this.dest = new HashSet();
            this.from = new HashSet();
        }
        public void addDestination(int index) {
            this.dest.add(index);
        }
        public void addFrom(int index) {
            this.from.add(index);
        }
        public Set<Integer> getFrom() {
            return this.from;
        }
        public int getIndex() {return this.index;}
        public boolean isTerminal() {
            return this.dest.size() == 0;
        }
        public void removeDest(int index) {
            this.dest.remove(index);
        }
    }
}