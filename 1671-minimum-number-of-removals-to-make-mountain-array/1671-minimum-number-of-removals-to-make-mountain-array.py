class Solution:
    def minimumMountainRemovals(self, nums):
        def lengthOfLIS(nums):
            dp = [10**10] * (len(nums) + 1)
            for elem in nums: 
                dp[bisect.bisect_left(dp, elem)] = elem  
            return dp.index(10**10)

        max_found = 0
        n = len(nums)
        for i in range(1, n - 1):
            left  = [num for num in nums[:i] if num < nums[i]] + [nums[i]]
            right = [nums[i]] + [num for num in nums[i+1:] if num < nums[i]]
            right = right[::-1]
            a, b = lengthOfLIS(left), lengthOfLIS(right)
            if a >=2 and b >= 2: 
                max_found = max(max_found, a + b - 1)

        return n - max_found