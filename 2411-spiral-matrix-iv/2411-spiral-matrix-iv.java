/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int direction[][] = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int dir = 0;
        int count = 0;

        int row = 0;
        int col = 0;
        int baser = 0;
        int basec = 0;

        int result[][] = new int[m][n];

        int len = m * n;

        for(int i = 0 ; i < len ; i++) {
            if(head != null) {
                result[row][col] = head.val;
                head = head.next;
            } else {
                result[row][col] = -1;
            }
            row += direction[dir%4][0];
            col += direction[dir%4][1];


            if(row == m) {
                dir++;
                row--;
                col--;
                n--;
                continue;
            }
            if(col == n) {
                dir++;
                col--;
                row++;
                baser++;
                continue;
            }
            if(row < baser) {
                dir++;
                row++;
                col++;
                basec += 1;
                continue;
            }
            if(col < basec) {
                dir++;
                row--;
                col++;
                m--;
                continue;
            }
        }

        return result;
    }
}