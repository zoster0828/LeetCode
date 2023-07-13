class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Node nodes[] = new Node[numCourses];
        for(int i = 0 ; i < numCourses ; i ++) {
            nodes[i] = new Node(i);
        }
        
        for(int idx = 0 ; idx < prerequisites.length ; idx++) {
            int nodeNum = prerequisites[idx][0];
            int preNum = prerequisites[idx][1];
            
            nodes[nodeNum].addDestination(preNum);
            nodes[preNum].addFrom(nodeNum);
        }
        
        Queue<Node> queue = new LinkedList();
        for(Node node : nodes) {
            if(node.isTerminal()) {
                queue.add(node);
            }
        }
        
        
        int result = 0;
        while(queue.size() != 0) {
            result++;
            Node node = queue.poll();
            Set<Integer> from = node.getFrom();
            for(Integer fromNum : from) {
                nodes[fromNum].removeDest(node.getIndex());
                if(nodes[fromNum].isTerminal()) {
                    queue.add(nodes[fromNum]);
                }
            }            
        }
        
        return result == numCourses;
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