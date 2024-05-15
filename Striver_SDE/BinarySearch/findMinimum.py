import sys
class Solution:
    def findMin(self, arr: List[int]) -> int:
        low = 0
        high = len(arr) - 1
        ans = sys.maxsize

        while(low<=high):
            mid = (low+high)//2
            if(arr[low]<=arr[high]):
                ans = min(ans,arr[low])
            if(arr[low]<=arr[mid]):
                ans = min(ans,arr[low])
                low=mid+1
            else:
                ans = min(ans, arr[mid])
                high = mid - 1
        return ans
