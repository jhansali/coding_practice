"""
	The function is called with the parameters:
	quickSort(input, 0, size - 1);

"""
from typing import List

def partition(arr,startIndex,endIndex):
    i=startIndex-1
    pivot=arr[endIndex]
    for j in range(startIndex,endIndex):
        if arr[j]<=pivot:
            i+=1
            arr[i],arr[j]=arr[j],arr[i]
    arr[i+1],arr[endIndex]=arr[endIndex],arr[i+1]
    return i+1

def quickSort(arr: List[int], startIndex: int, endIndex: int):
    if startIndex<endIndex:
        p=partition(arr,startIndex,endIndex)
        quickSort(arr,startIndex,p-1)
        quickSort(arr,p+1,endIndex)
    return arr
