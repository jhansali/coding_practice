class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i=0
        j=len(nums)-1
        ans = len(nums)

        while(i<=j):
            mid = (i+j)//2

            if(nums[mid]>=target):
                ans = mid
                j=mid-1
            else:
                i=mid+1

        return ans        
