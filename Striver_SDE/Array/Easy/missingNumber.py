class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum_formula = n*(n+1)/2
        len_sum=0
        for i in range(0,n):
            len_sum+=nums[i]
        return int(sum_formula-len_sum)      