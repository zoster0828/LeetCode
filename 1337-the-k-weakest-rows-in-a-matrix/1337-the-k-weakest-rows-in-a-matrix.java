class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Soldier> priorityQueue = new PriorityQueue();
        for(int row = 0 ; row < mat.length ; row++) {
            int count = countSoldiers(mat[row]);
            priorityQueue.add(new Soldier(count, row));
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll().po;
        }
        return result;
    }

    private class Soldier implements Comparable<Soldier> {
        int count;
        int po;
        public Soldier(int count, int po) {
            this.count = count;
            this.po = po;
        }

        @Override
        public int compareTo(Soldier soldier) {
            if(soldier.count > this.count) {
                return -1;
            } else if(soldier.count < this.count) {
                return 1;
            } else {
                return soldier.po > this.po ? -1 : 1;
            }
        }
    }

    public int countSoldiers(int[] row) {
        int count = 0 ;
        for(int i = 0 ; i < row.length ; i ++) {
            if(row[i] == 1) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}