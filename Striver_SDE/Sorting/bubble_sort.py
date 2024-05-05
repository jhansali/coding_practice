from typing import List

def bubbleSort(arr: List[int], n: int):
    for i in range(n):
        didswap = False
        for j in range(n-i-1):
            if(arr[j+1]<arr[j]):
                arr[j+1],arr[j] = arr[j],arr[j+1]
                didswap = True
        if (didswap == False):
            break
    pass
