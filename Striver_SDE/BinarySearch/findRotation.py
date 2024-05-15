# code here
        low = 0
        high = n - 1
        ans = float('inf')
        index = 0
        
        while low <= high:
            mid = (low + high) // 2
            
            if arr[low] <= arr[high]:
                if arr[low] < ans:
                    index = low
                    ans = arr[low]
                break
            
            if arr[low] <= arr[mid]:
                if arr[low] < ans:
                    index = low
                    ans = arr[low]
                low = mid + 1
            else:
                high = mid - 1
                if arr[mid] < ans:
                    index = mid
                    ans = arr[mid]
                    
        return index
