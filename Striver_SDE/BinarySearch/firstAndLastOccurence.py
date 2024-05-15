class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        start = 0
        end = len(nums)-1
        left = -1
        st =[]
        while (start<=end): #left Search Element
            mid = start + (end-start)//2
            if nums[mid] == target:
                left = mid
                end = mid-1
            elif nums[mid]>target:
                end = mid-1
            else:
                start = mid+1
        
        right =-1
        start =0
        end = len(nums)-1
        while(start<=end):
            mid = start + (end-start)//2
            if nums[mid] == target:
                right = mid
                #print(right)
                start = mid+1
            elif nums[mid]>target:
                end = mid-1
            else:
                start = mid+1
        st.append(left)
        st.append(right)
        return st
