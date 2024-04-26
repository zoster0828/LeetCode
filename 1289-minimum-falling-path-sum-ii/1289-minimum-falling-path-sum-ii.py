class Solution(object):
    def minFallingPathSum(self, A):
        for i in xrange(1, len(A)):
            r = heapq.nsmallest(2, A[i - 1])
            for j in xrange(len(A[0])):
                A[i][j] += r[1] if A[i - 1][j] == r[0] else r[0]
        return min(A[-1])