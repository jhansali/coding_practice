class Solution:
    def search(self, nums: List[int], target: int) -> int:
        i=0
        j=len(nums)-1
        mid=0
        while(i<j):
            mid  = (i+j)//2
            if(nums[mid]==target):
                return mid
            elif(nums[mid]>target):
                j=mid-1
            else:
                i=mid+1
        if nums[i]==target: 
            return i
        return -1
        
