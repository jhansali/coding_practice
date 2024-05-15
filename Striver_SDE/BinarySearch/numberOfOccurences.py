#User function Template for python3
class Solution:

	def count(self,nums, n, target):
		start = 0
        end = len(nums)-1
        left = -1
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
        
        if(left==-1):
            return 0
        return right-left+1


#{ 
 # Driver Code Starts
#Initial Template for Python 3




if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, x = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.count(arr, n, x)
        print(ans)
        tc -= 1

# } Driver Code Ends
